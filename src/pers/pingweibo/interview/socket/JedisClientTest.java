package pers.pingweibo.interview.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class JedisClientTest {
    
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(6379);
		Socket res = server.accept();
		byte[] result = new byte[2048];
		res.getInputStream().read(result);
		System.out.println(new String(result));
	}
}
