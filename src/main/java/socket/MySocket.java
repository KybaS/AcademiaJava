package socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MySocket {
    public static void main(String[] args) throws Exception{
        try (Socket socket = new Socket("localhost", 7777)){

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(10);
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();
            int response = inputStream.read();

            System.out.println(response);
        }

    }

}
