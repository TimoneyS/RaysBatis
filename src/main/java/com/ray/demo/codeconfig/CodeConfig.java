package com.ray.demo.codeconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.ray.common.SysUtil;

public class CodeConfig {
    
    static SqlSessionFactory sqlSessionFactory;
    
    public static void init() {
        
        Properties prop = SysUtil.loadProperties("datasource.properties");
        // 创建数据源
        DataSource ds = new PooledDataSource(
                prop.getProperty("driver"),
                prop.getProperty("url"),
                prop.getProperty("username"),
                prop.getProperty("password"));
        // 事务管理器
        TransactionFactory tsf = new JdbcTransactionFactory();
        // 创建配置环境
        Environment environment = new Environment("dev", tsf, ds);
        // 创建配置对象，并添加映射器
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(DogMapper.class);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
    }
    
}
