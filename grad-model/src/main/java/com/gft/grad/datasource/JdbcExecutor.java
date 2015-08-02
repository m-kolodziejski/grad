package com.gft.grad.datasource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Mateusz on 2015-07-31.
 */
public class JdbcExecutor {

    public static ResultSet execute(String query) throws SQLException {
        Statement statement = DataSourceConnector.getConnection().createStatement();
        return statement.executeQuery(query);
    }
}
