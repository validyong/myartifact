package com.simplecrud.myartifact.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

@Configuration
public class MyConfig {
    @Bean
    public DataSource dataSource() throws SQLException {
        PoolDataSource dataSource = PoolDataSourceFactory.getPoolDataSource();
        dataSource.setUser("sjo03");
        dataSource.setPassword("system123");
        dataSource.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
        dataSource.setURL("jdbc:oracle:thin:@localhost:1521:XE");
        dataSource.setInitialPoolSize(5);
        dataSource.setMinPoolSize(5);
        dataSource.setMaxPoolSize(10);
        return dataSource;
    }

}
