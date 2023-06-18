package com.tnd.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class DatabaseAdapter implements DataAccess {
    Connection conn = null;

    @Override
    public void connect() {
        try {
            // db parameters
            String url = "jdbc:sqlite:db/todo.db";
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

    @Override
    public boolean verifyUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User authentication required to access tasks...");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password");
        String password = scanner.nextLine();

    }
}
