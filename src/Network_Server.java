
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Network_Server {
    public static void main(String[] args)
            throws IOException
    {Scanner sc = new Scanner(System.in);
        System.out.print("Client > Tell me DateServer's IP");
        String Server_Address = sc.nextLine();
        try (Socket client = new Socket(Server_Address, 9000);
             BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));) {
            String response = input.readLine();
            System.out.println(response);
        } catch (Exception e) {
        }
    }
}
