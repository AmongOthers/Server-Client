package org.zww.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		while(true) {
			Socket client = server.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String line = null;
			try {
				while((line = reader.readLine()) != null) {
					System.out.println(line);
				}
			}
			catch (SocketException e) {
			}
		}
	}

}
