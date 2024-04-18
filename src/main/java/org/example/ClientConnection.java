package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class ClientConnection {
    static Client.ClientConnect getClientConnect() throws IOException {
        System.out.println("Client started...");
        Socket soc = new Socket("localhost", 5000);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        Client.ClientConnect result = new Client.ClientConnect(soc, userInput);
        return result;
    }
}
