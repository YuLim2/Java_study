package socket;

import java.net.Socket;

public class ProtocolClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9500);
            System.out.println("연결성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
