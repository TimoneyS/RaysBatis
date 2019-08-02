package com.ray.code;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.ray.Dog;

public class DemoCodeConfig {

    public static Properties loadProperties(String name) {
        Properties prop = new Properties();
        try {
            prop.load(DemoCodeConfig.class.getClassLoader().getResourceAsStream("datasource.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static void main(String[] args) throws IOException {

        Properties prop = loadProperties("datasource.properties");
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
        
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            DogMapper mapper = session.getMapper(DogMapper.class);
            Dog d = mapper.selectDog(1);
            System.out.println(d.getName() + ", " + d.getAge());
        }

    }

}
