package socket.echo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        try (Socket socket = new Socket("localhost", 11112)) {

            while (true) {
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your message: ");
                String message = scanner.nextLine();

                dataOutputStream.writeUTF(message);
                dataOutputStream.flush();

                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                String response = dataInputStream.readUTF();

                System.out.println(response);
            }
        }
    }
}
