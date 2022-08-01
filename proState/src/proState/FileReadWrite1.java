package proState;

import java.io.*;

public class FileReadWrite1 {

	public static void main(String args[ ]) throws IOException
	   {
		
	     DataInputStream dis=new DataInputStream(System.in);

	     System.out.print("Enter file name to write : ");
	     String fileWrite=dis.readLine();

	     System.out.println("Enter data to be written to file : ");
	     String data=dis.readLine();

	     FileOutputStream fos=null;
	     
	      try
	        {
	          fos=new FileOutputStream(fileWrite);
	        }
	      catch(FileNotFoundException fe)
	        {
	          fe.printStackTrace();
	          System.exit(0);
	        }

	       byte arr[ ]=data.getBytes();
	       fos.write(arr);

	       fos.close(); 
	       
	   }

}
