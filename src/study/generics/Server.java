//package generics;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class Server {
//    public static void main(String[] args) throws IOException {
//        int port = 5050;
//        ServerSocket ssk = new ServerSocket(port); //서버 자신의 포트 설정
//        System.out.println("접속 대기 중~!");
//        while (true){
//            Socket sock = ssk.accept();
//            System.out.println("사용자 접속 완료");
//            System.out.println("Client ip: " + Socket.getIntAddress());
//        }
//    }
//}
