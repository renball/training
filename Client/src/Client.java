import java.io.*;
import MyPack.Phone;

public class Client {
    public static void main(String[] args){
        try (Phone phone = new Phone ("127.0.0.1", 8080))
        {
            System.out.println("Connected to server");
            String request = "arzamas";;
            phone.writeLine(request);
            String response = phone.readLine();
            System.out.println("Response "+response);
        } catch (IOException e){
          e.printStackTrace();
        }
    }
}
