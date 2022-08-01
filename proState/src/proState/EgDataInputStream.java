package proState;

import java.io.DataInputStream;
import java.io.IOException;

public class EgDataInputStream {

	public static void main(String[] args) {
		
		try{
			DataInputStream dis=new DataInputStream(System.in);

		    System.out.print("Enter first no : ");
		    int fno=Integer.parseInt(dis.readLine());

		    System.out.print("Enter second no : ");
		    int sno=Integer.parseInt(dis.readLine());

		    int sum=fno + sno;
		    System.out.println("Summation = " + sum);
		}catch(IOException ie){
			ie.printStackTrace();
		}

	}

}
