package proState;

import java.util.Base64;
import java.util.Scanner;

// Problem-Statement: Encode and Decode the String

public class Encode_Decode_2 {

	public static void main(String[] args) {

//		String sample = "Hello My Name is Omkar Ingawale";
		
		System.out.print("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String sample = sc.nextLine();
		
		System.out.println("Original String : " + sample);

		// Encode into Base64 Format
		String BaseBase64Format = Base64.getEncoder().encodeToString(sample.getBytes());
		
		// Print the Encoded String
		System.out.println("The Encoded String : " + BaseBase64Format);
		
		// Decode into Base64 Format
		String encodedString = BaseBase64Format;
		
		byte[] sample1 = Base64.getDecoder().decode(encodedString);
		
		String actualSample = new String(sample1);
		
		// Print the Decodede String
		System.out.println("The Decoded String : " + actualSample);
		
	}

}
