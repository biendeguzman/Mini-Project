package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
public class ClientInput {
    static void UserInput(BufferedReader userInput, Socket soc) throws IOException {
        System.out.print("Enter a number for Poem Line: ");
        int lineNumber = Integer.parseInt(userInput.readLine());
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println(lineNumber);
    }
}
