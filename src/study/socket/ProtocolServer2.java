package socket;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer2 {
    public static void main(String[] args) throws IOException {

        try {
            ServerSocket serverSocket = new ServerSocket(9500);
            while (true) {
                System.out.println("연결을 기다리는 중");
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("연결 수락됨" + isa.getHostName());
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));																	// 데이터를 읽어옴
                String line = reader.readLine();
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                writer.println(line);
                writer.flush();
            }
        } catch (IOException e) {
        }
    }
}
