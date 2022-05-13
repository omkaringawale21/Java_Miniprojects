package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

//protected void finalize()throws Throwable{
//}

public class Try_Catch {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("F:/Document.txt");
			System.out.println(fis.read());
			System.out.println("File read successfully!");
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File close successfully!");
		}
		System.out.println("File task completed!");
		
	}

}
