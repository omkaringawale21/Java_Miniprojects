package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

class ReadAndWrite{
	void readFile() throws FileNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("F:/Xyz.txt");
		FileWriter fiw = new FileWriter("F:/Xyz.txt");
		System.out.println(fiw.getEncoding());
	}
	
	void saveFile() throws FileNotFoundException, IOException{
		String msg = "This is demo";
		FileOutputStream fos = new FileOutputStream("F:/Abc.txt");
		FileWriter fow = new FileWriter("F:/Abc.txt");
		fow.write(msg);
		System.out.println(fow.getEncoding());
	}
}

public class Check {

	public static void main(String[] args) {
		
		ReadAndWrite rw = new ReadAndWrite();
		
		try {
			rw.readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			rw.saveFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed successfully!");
		
	}

}
