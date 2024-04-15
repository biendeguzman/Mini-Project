import java.net.Socket;

public class Client {
    public static void main (String[] args){
        //Connection for Client and Server
        try {
            System.out.println("Client started...");
            Socket soc = new Socket("localhost", 5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
