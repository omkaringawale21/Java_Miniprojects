package proState;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Problem-Statement: Append String in an Existing File

public class AppendStringToExistingFile {

	public static void appendStrToFile(String filename, String str){
		try{
			// Open given file in append mode by creating an object of BufferedWriter class
			BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));
			// Write on output Stream
			out.write(str);
			// Closing the Connection
			out.close();
		}catch(IOException e){
			System.out.println("Exception Occured!" + e);
		}
	}
	
	public static void main(String[] args) {
		
		// Creating a sample File with some ramdom text
		String filename = "OmkarResume.txt";
		
		try{
			// Again operating some operations by passing file as parameter to read it
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			// Write on file
			out.write("Hello, My Name is Omkar Ingawale.\n");
			// Closing the connection
			out.close();
		}catch(IOException e){
			System.out.println("Exception Occured!" + e);
		}
		
		// Appending given str to above
		String str = "This is a method, which is find Append String in an Existing File";
		
		appendStrToFile(filename, str);
		
		// Let a print modified File
		try{
			BufferedWriter in = new BufferedWriter(new FileWriter("OmkarResume.txt"));
			
			String mystring;
			
			// Till there is content in string condition holds true
//			while((mystring = in.readLine()) != null){
//				System.out.println(mystring);
//			}
		}catch(IOException e){
			System.out.println("Exception occured!" + e);
		}
		
	}
	
}
