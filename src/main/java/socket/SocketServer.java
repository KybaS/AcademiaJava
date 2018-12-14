package socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class SocketServer {

    private static final Logger LOGGER = Logger.getLogger(SocketServer.class.getName());

    public static void main(String[] args) throws Exception{

        try (ServerSocket serverSocket = new ServerSocket(7777)){
            while (true){
                try (Socket socket = serverSocket.accept()){
                    serverClient(socket);
                }
            }
        }
    }
    private static void serverClient(Socket socket)throws Exception{
        LOGGER.info("Serving client " + socket.getInetAddress());

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        while (true){
            int request = inputStream.read();

            if (request==-1){
                break;
            }

            LOGGER.info("Request: " + request);
            outputStream.write(request*request);
            outputStream.flush();
        }
    }
}
