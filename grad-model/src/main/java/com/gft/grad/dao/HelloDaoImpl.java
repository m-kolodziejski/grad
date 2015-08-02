package com.gft.grad.dao;

import com.gft.grad.datasource.JdbcExecutor;

import javax.enterprise.inject.Default;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mateusz on 2015-07-31.
 */
@Default
public class HelloDaoImpl implements HelloDao, Serializable {

    public String getHello() {

        try {
            ResultSet rs = JdbcExecutor.execute("select WORLD from hello;");
            if(rs.next() == true){
                return rs.getString("WORLD")+" version 1";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
