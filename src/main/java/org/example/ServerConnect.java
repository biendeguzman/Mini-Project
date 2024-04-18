package org.example;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerConnect {
    static Socket getSocket() throws IOException {
        System.out.println("Waiting for Client...");
        ServerSocket ss = new ServerSocket(5000);
        //accept methods waits until client connects to the server.
        Socket soc = ss.accept();
        System.out.println("Client Accepted!");
        return soc;
    }
}
