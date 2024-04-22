package com._98Labs.exercises.sockets;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ServerResult {
    private static Logger serverResultLogger = LogManager.getLogger(ServerConnect.class);
    static void extracted(Socket soc, Server.Result result) throws IOException {
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        System.out.print("Line " + result.lineNumber() + " : "+ result.line());
    }
}
