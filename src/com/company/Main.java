package com.company;

import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
      int PORT = 8080;
      try {
        ServerSocket SSocket = new ServerSocket(PORT);
        SSocket.accept();
      }catch (Exception e){
        System.out.println("Couldnt start server on port: " + PORT);
      }
    }
}
