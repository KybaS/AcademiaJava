package socket.echo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class EchoServer {

    private static final Logger LOGGER = Logger.getLogger(EchoServer.class.getName());

    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(11112)) {
            System.out.println("Server ready");
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    serveClient(socket);
                }
            }
        }
    }

    private static void serveClient(Socket socket) throws Exception {
        LOGGER.info("Serve client " + socket.getInetAddress());

        try (DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String request = dataInputStream.readUTF();

                LOGGER.info("Request: " + request);

                dataOutputStream.writeUTF("Success");
                dataOutputStream.flush();
            }
        } catch (EOFException e) {

        }
    }
}
