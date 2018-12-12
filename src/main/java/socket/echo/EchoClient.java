package socket.echo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws Exception{
        try (Socket socket = new Socket("localhost", 11112)){

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("TEST1");
            dataOutputStream.flush();

            DataInputStream dataInputStream =new DataInputStream(socket.getInputStream());
            String response = dataInputStream.readUTF();

            System.out.println(response);
        }
    }
}
