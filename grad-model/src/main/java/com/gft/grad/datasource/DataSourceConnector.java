package com.gft.grad.datasource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Mateusz on 2015-07-31.
 */
public class DataSourceConnector {

    public static Connection getConnection() throws SQLException {
        Context initCtx = null;
        Context envCtx = null;
        DataSource ds = null;
        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            ds = (DataSource)
                    envCtx.lookup("jdbc/grad");
        } catch (NamingException e) {
            e.printStackTrace();
        }

        return ds.getConnection();

    }
}
