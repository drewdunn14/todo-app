package com.tnd.model;

public class Request {

    static public int EXIT_REQUEST = 0;
    static public int USER_LOGIN_REQUEST = 1;
    static public int LOAD_TASK_REQUEST = 2;


    public int code;
    public String body;
}
