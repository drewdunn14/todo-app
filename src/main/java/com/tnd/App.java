package com.tnd;

import com.tnd.adapter.ClientAdapter;
import com.tnd.adapter.DataAccess;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        DataAccess dao = new ClientAdapter();

        dao.connect();

    }

}
