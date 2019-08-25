package com.ray.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class H2Util {

    // 从配置文件冲加载，初始化数据源的内容
    public static void init(String... schemas) {
        if (schemas == null)
            return;
        Properties props = SysUtil.loadProperties("datasource.properties");
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");
        
        if (!url.matches(".*h2.*")) return;

        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            try (Statement sqlStat = conn.createStatement()) {
                for (String schema : schemas) {
                    for (String statement : getStatemetns("/" + schema)) {
                        sqlStat.execute(statement);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // 获取文件中的所有语句
    private static List<String> getStatemetns(String schema) {
        
        List<String> rs = new ArrayList<>();
        try (Scanner sc = new Scanner(H2Util.class.getResourceAsStream(schema))) {
            
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                
                int tail = line.length() - 1;
                
                if (tail < 0) {
                    continue;
                } else {
                    while (tail > 0) {
                        if (line.charAt(tail) != ' ') {
                            break;
                        } 
                        tail --;
                    }
                }
                
                if (line.charAt(tail) == ';') {
                    sb.append(line.substring(0, tail));
                    rs.add(sb.toString());
                    sb = new StringBuilder();
                } else {
                    sb.append(line).append('\n');
                }
            }
            
        }
        return rs;
    }

}
