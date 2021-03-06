package proState;

/*
 * Problem Statement : To reverse a String but without using reversing method whole of the String program.
 *                     But one word only word can be reversed, not whole of the String has been reversed.
 * @Author : Omkar Ingawale
 */

class ReverseString1 {

	public static String[] reversing(String[] s, int k){
			
		if(k % 2 == 0){
			int j = k / 2;
			while(j <= k - 1){
				String temp = s[k - j - 1];
				s[k - j - 1] = s[j];
				s[j] = temp;
				j = j + 1;
			}
		}else{
			int j = (k / 2) + 1;
			while(j <= k - 1){
				String temp = s[k - j - 1];
				s[k - j - 1] = s[j];
				s[j] = temp;
				j += 1;
			}
		}
			
		return s;
			
	}
	
	public static void main(String[] args) {
		
		String rev = "getting good at coding needs a lot of practice";
		
		System.out.println("Before reversing : " + rev);
		
		String[] strRev = rev.split("\\s");
		
		strRev = reversing(strRev, strRev.length);
		
		rev = String.join(" ", strRev);
		
		System.out.println("After reversing : " + rev);
		
		
		
	}

}
