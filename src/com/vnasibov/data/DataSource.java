package com.vnasibov.data;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {

    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    static {
        config.setJdbcUrl( "jdbc:postgresql://localhost/myapp" );
        config.setUsername( "postgres" );
        config.setPassword( "1234" );
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        config.setAutoCommit(true);
        config.setMaximumPoolSize(10);
        ds = new HikariDataSource( config );
    }

    private DataSource() throws ClassNotFoundException {

    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}