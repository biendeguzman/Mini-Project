package com._98Labs.exercises.sockets;
import java.net.Socket;
public class Server {
    public static void main (String[]args) {
        //File path
        String filePath = "C:\\Users\\ticed\\project\\client-server\\server\\src\\main\\resources\\Poem.txt";

        try {
            //Connection to Client
            Socket soc = ServerConnect.getSocket();
            //Poem Line Result
            while (true) {
                Result result = ServerPoem.getResult(soc, filePath);
                ServerResult.extracted(soc, result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public record Result(int lineNumber, String line) {
    }
}
