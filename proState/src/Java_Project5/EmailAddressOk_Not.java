package Java_Project5;

import java.util.ArrayList;
import java.util.regex.Pattern;

// Problem-Statement:- Check if Email Address is Valid or Not.
// Regular Expression or Regex is an API for defining String patterns that can be used for searching,
// manipulating and editing a String in Java.
// Email validation and passwords are a few areas of Strings where Regex is widly used to define the constraints.

public class EmailAddressOk_Not {

	public static boolean isValid(String email){
		
		// This is Regex Expression for to check Email address valid or not
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
	                        "[a-zA-Z0-9_+&*-]+)*@" +
				            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                        "A-Z]{2,7}$";
		
		Pattern pat = Pattern.compile(emailRegex);
		
		if(email == null){
			return false;
		}
		
		return pat.matcher(email).matches();
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> address = new ArrayList<>();
		
		address.add("omkaringawale21@gmail.com");
		address.add("omkaringawale2108@gmail.com");
		address.add("writing.oneStarCompany.org");
		
		for(String i : address){
			if(isValid(i)){
				System.out.println(i + " :- Yes");
			}else{
				System.out.println(i + " :- No");
			}
		}
			
	}

}

