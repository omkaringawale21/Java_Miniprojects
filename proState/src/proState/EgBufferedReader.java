package proState;

import java.io.*;

public class EgBufferedReader {

	public static void main(String[] args) {
		
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter data. Enter 'S' to stop");

			int i = 0;
			char ch = ' ';

			while(ch != 'S'){
				i=  br.read();       
			    ch = (char)i;
			    if(ch != 'S') System.out.print(ch);
			}
		}catch(IOException ie){
			ie.printStackTrace();
		}
		       
	}

}
