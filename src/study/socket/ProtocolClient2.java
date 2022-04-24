package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ProtocolClient2 {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9500);
            System.out.println("연결성공");
        } catch (Exception e){
            e.printStackTrace();
        }
        String msg = "하윙";
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.println(msg);
        writer.flush();
        System.out.println("전송 완료");

        BufferedReader reader = new BufferedReader((new InputStreamReader(socket.getInputStream())));
        String line = reader.readLine();
        System.out.println("받기 완료: " + line);

        writer.close();
        reader.close();
    }
}
