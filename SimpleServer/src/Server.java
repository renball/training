import MyPack.Phone;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main (String[] args) throws IOException {

        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("Server started");
            while(true) {
                try (Phone phone = new Phone(server))
                {
                    System.out.println("Client connected");
                    String request = phone.readLine();
                    String response = (int)(Math.random() * 30 - 10) + "";
                    phone.writeLine(response);
                } catch(IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }






    }
}
