package com.tnd.server;

import com.google.gson.Gson;
import com.tnd.adapter.DataAccess;
import com.tnd.adapter.DatabaseAdapter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

class ClientHandler extends Thread {
    final DataInputStream dis;
    final DataOutputStream dos;
    final Socket s;

    Gson gson = new Gson();

    DataAccess dao = new DatabaseAdapter();


    // Constructor
    public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos) {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
        dao.connect();
    }
}