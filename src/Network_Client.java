
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Network_Client {
    public static void main(String[] args) {
        try (ServerSocket SS = new ServerSocket(9000);
             Socket connection = SS.accept();
             PrintWriter out = new PrintWriter(connection.getOutputStream(), true);) {
            out.println("Server > " + new Date().toString());
        } catch (Exception e) {
        }
    }
}