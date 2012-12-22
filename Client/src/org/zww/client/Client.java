package org.zww.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Socket client = new Socket();
		client.connect(new InetSocketAddress("localhost", 9999));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String line = consoleReader.readLine();
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
	}

}
