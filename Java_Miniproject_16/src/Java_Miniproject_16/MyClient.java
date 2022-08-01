package Java_Miniproject_16;

import java.net.*;
import java.io.*;

public class MyClient {

	public static void main(String[] args) {
		
		try {
			
			Socket s = new Socket("localhost", 47);
			
			OutputStream os = s.getOutputStream();
			
			String data = "Hello";
			
			byte arr[] = data.getBytes();
			
			os.write(arr);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
