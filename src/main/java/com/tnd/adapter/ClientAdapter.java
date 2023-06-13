package com.tnd.adapter;

import com.google.gson.Gson;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientAdapter implements DataAccess {

    Gson gson = new Gson();
    Socket s = null;
    DataInputStream dis = null;
    DataOutputStream dos = null;


    @Override
    public void connect() {
        try {
            s = new Socket("localhost", 5056);
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            System.out.println("Successful connection to server...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}