package generics;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1", 5050);
        System.out.println("서버 접속!");
    }
}
