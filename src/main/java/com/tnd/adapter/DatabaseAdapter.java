package com.tnd.adapter;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseAdapter implements DataAccess {
    Connection conn = null;

    @Override
    public void connect() {
        try {
            // db parameters
            String url = "jdbc:sqlite:todo.db";
            // create a connection to the database
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection(url);

            if (conn == null)
                System.out.println("Cannot make the connection!!!");
            else
                System.out.println("The connection object is " + conn);

            System.out.println("Connection to SQLite has been established.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
