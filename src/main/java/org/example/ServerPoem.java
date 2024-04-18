package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class ServerPoem {
    static Server.Result getResult(Socket soc, String filePath) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        //Open the file for reading
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int lineNumber = Integer.parseInt(in.readLine());
        //Line Starts
        int currentLine = 1;
        String line;
        while((line = reader.readLine())!=null){
            if (currentLine == lineNumber){
                System.out.println("Line " + lineNumber + ": " + line);
                break;
            }
            currentLine++;
        }
        reader.close();
        Server.Result result = new Server.Result(lineNumber, line);
        return result;
    }
}
