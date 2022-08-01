package proState;

import java.io.*;

public class FileReadWrite {

	  public static void main(String args[ ]) throws IOException{
		  
		     DataInputStream dis=new DataInputStream(System.in);

		     System.out.print("Enter file name to read : ");
		     String fileRead=dis.readLine(); 

		     System.out.print("Enter file name to write : ");
		     String fileWrite=dis.readLine(); 

		     FileInputStream fis=null;
		     FileOutputStream fos=null;

		      try
		        {
		          fis=new FileInputStream(fileRead); 
		        }
		      catch(FileNotFoundException fe)
		        {
		          fe.printStackTrace();
		          System.exit(0);
		        }

		      try
		        {
		          fos=new FileOutputStream(fileWrite); 
		        }
		      catch(FileNotFoundException fe)
		        {
		          fe.printStackTrace();
		          System.exit(0);
		        }

		        int i = 0;
		        char ch = ' ';

		          while(i != -1)
		            {  
		               i = fis.read();
		               ch = (char)i;

		              if(i != -1) 
		                {
		                  System.out.print(ch); 
		                  fos.write(i);
		                }
		            }

		         fis.close(); 
		         fos.close();
		  
	  }
	
}
