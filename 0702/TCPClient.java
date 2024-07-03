import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 1000; i++) {
            Socket socket = new Socket("localhost", 9000);
            System.out.println(i +"번: 클라이언트가 9000포트 서버에 연결을 요청함");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String data = br.readLine();
            System.out.println("서버로 부터 받은 데이터 >> "+data);
        }
    }
}
