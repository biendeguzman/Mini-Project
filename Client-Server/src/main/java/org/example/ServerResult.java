package org.example;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
public class ServerResult {
    static void extracted(Socket soc, Server.Result result) throws IOException {
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println("Line " + result.lineNumber() + " : "+ result.line());
    }
}