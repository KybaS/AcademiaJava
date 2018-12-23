package socket.echo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class Server {

    private static final int PORT = 7777;
    private static final Logger LOGGER = Logger.getLogger(Server.class.getName());

    public static void main(String[] args) throws Exception {
        int count = 1;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is ready, port: " + PORT);

            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    System.out.println("Client connected " + count++);

                    server(socket);
                }
            }
        }
    }

    private static void server(Socket socket) throws Exception {
        LOGGER.info("Serve client " + socket.getInetAddress());

        try (DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String request = dataInputStream.readUTF();

                String requestWithoutSpaces = request.replaceAll("\\s+", "");
                int countCharacters = requestWithoutSpaces.length();

                LOGGER.info("Request: " + request);
                Thread.sleep(2000);

                dataOutputStream.writeUTF("Your message is " + countCharacters + " characters long.");
                dataOutputStream.flush();
            }
        }
    }
}
