package Java_Miniproject_16;

import java.io.IOException;
import java.net.*;
import java.io.*;

public class MyServer {

	public static void main(String[] args) {
		
		try {
			
			ServerSocket ss = new ServerSocket(47);
			
			Socket s = ss.accept();
			
			InputStream is = s.getInputStream();
			
			int i = 0;
			char ch = ' ';
			
			while(i != -1){
				i = is.read();
				ch = (char)i;
				if(i != -1){
					System.out.print(ch);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
