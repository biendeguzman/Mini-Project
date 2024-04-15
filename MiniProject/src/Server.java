import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String filePath = "C:/Users/ticed/IdeaProjects/MiniProject/Poem.txt";
        //Line Starts
        int currentLine = 1;
        // Line to read
        System.out.print("Enter Poem Line: ");
        int lineNumber = sc.nextInt();
        System.out.println("_________________");
        //Reading txt to a file
        try {
            //Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;

            while((line = reader.readLine())!=null){
                if (currentLine == lineNumber){
                    System.out.println("Line " + lineNumber + ": " + line);
                    break;
                }
                currentLine++;
                //System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Writing a txt in a file
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("Poem.txt"));
//            writer.write("Writing to a file.");
//            writer.write("\nWriting to a file. 2");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Connection for Client and Server
//        try {
//            System.out.println("Waiting for Client...");
//            ServerSocket ss = new ServerSocket(5000);
//            //accept methods waits until client connects to the server.
//            Socket soc = ss.accept();
//            System.out.println("Client Accepted!");
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
    }
}
