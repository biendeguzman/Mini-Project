package com._98Labs.exercises.sockets;
import java.io.BufferedReader;
import java.net.Socket;

public class Client {
    public static void main (String[]args) {
        //Connection for Client and Server
        try {
            //Client Connection to Server
            ClientConnect result = ClientConnection.getClientConnect();
            while (true) {
                //UserInput
                ClientInput.UserInput(result.userInput(), result.soc());
                ClientResult.clientResult(result.soc());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public record ClientConnect(Socket soc, BufferedReader userInput) {
    }
}
