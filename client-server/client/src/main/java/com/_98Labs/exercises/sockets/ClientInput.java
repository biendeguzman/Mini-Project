package com._98Labs.exercises.sockets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ClientInput {
    private static Logger clientInputLogger = LogManager.getLogger(ClientInput.class);
    public static void UserInput(BufferedReader userInput, Socket soc) throws IOException {
        String inputLine;
        int lineNumber = 0;
        boolean validInput = false;

        while (!validInput) {
            clientInputLogger.info("Enter a number for Poem Line 1 to 24 or (type 'end' to end Poem Line): ");
            inputLine = userInput.readLine();

            if (inputLine.equalsIgnoreCase("end")) {
                clientInputLogger.warn("Poem line terminated");
                soc.close();
            }
            try {
                lineNumber = Integer.parseInt(inputLine);
                if (lineNumber <= 0 || lineNumber > 24) {
                    throw new IllegalArgumentException(lineNumber + " is an invalid number. Please enter a number between 1 and 24.");
                }
                validInput = true; // Mark input as valid to exit the loop
            } catch (NumberFormatException e) {
                clientInputLogger.warn("Invalid input. Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                clientInputLogger.error(e.getMessage());
            }
        }
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println(lineNumber);
    }
}
//            System.out.print("Enter a number for Poem Line: ");
//            try {
//                int lineNumber = Integer.parseInt(userInput.readLine());
//                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
//                if (lineNumber == 555) {
//                    System.out.println("Poem line terminated");
//                    soc.close();
//                } else if (lineNumber == 0 || lineNumber > 24) {
//                    throw new IllegalArgumentException(lineNumber + " Invalid number");
//                } else out.println(lineNumber);
//            } catch (NumberFormatException e) {
//                throw new IllegalArgumentException("Invalid input. Please enter valid linenumber. ");
//            }
//    }
//}