package com.jpr.simpleclientserverapp.phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class phone {

    private final Socket socket;
    private final BufferedReader reader;
    private final BufferedWriter writer;

    public phone(Socket socket){
        this.socket=socket;
        this.reader=createReader(this.socket.getInputStream());
    }

    public phone(ServerSocket serverSocket){
        this.socket= serverSocket.accept();
    }
    private BufferedReader createReader(InputStream inputStream){
        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
