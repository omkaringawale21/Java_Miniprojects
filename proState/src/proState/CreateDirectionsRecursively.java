package proState;

import java.io.File;

/*
 * Create Directions Recursively
 * @Author Omkar Ingawale
 */

public class CreateDirectionsRecursively {

	static void file(String md, String path, int depth){
		
		// Directory depth stores the numbers
		if(depth == 0){
			return;
		}
		
		// Decrementing the depth by 1
		depth -= 1;
		
		// Checking if the path exists
		if(path.length() == 0){
			System.out.println("Path does not exists!");
		}else{
			
			// Appending next directory would be md = md + " \\ " + path.charAt(0) for windows
			md = md + "/" + path.charAt(0);
			
			// Removing the frist character from path string
			path = path.substring(1);
			
			// Creating file object
			File f = new File(md);
			
			// If the directory already exists
			if(f.exists()){
				System.out.println("The Directory already exists");
			}else{
				// Creating the directory
				boolean val = f.mkdir();
				if(val){
					System.out.println(md + " created succesfully!");
				}else{
					System.out.println("Unable to create Directory!");
				}
			}
		}
		// Called Recursively
		file(md, path, depth);
	}
	
	public static void main(String[] args) {
		
		// Creating a class object
//		CreateDirectionsRecursively ob = new CreateDirectionsRecursively();
		
		// Path for windows -> "F:\\OmkarTXT\\"
//		ob.file("F:\\OmkarTXT", "OMKAR", 5);
		
		// Static Method hence called like ClassName.MethodName
		CreateDirectionsRecursively.file("F:\\OmkarTXT", "OMKAR", 5);
		
	}
	
}
