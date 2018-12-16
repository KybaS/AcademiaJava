package socket.echo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

public class Client {

    private static final String HOST = "127.0.0.1";
    private static final int PORT = 7777;
    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) throws Exception {

        try (Socket socket = new Socket(HOST, PORT)) {
            LOGGER.info("Connected to the " + HOST + " server, via the " + PORT + " port.");

            client(socket);
        }
    }

    private static void client(Socket socket) throws Exception {
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
