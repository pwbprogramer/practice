package pers.pingweibo.interview.socket;

import java.net.Socket;

public class Redis {
	
	
	public static void set(Socket socket,String key,String value) {
		StringBuffer str = new StringBuffer();
		str.append("*3").append("\r\n");
		str.append("");
		System.currentTimeMillis();
		
	}

}
