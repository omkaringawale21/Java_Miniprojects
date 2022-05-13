package com.learningTestNG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class String_Reversing {

	public static void main(String[] args) {
		
		// Reversing the string individuals world(Method-1)
		String rev = "i am omkar ingawale";
		char[] temparray = rev.toCharArray();
//		List<Character> input = new ArrayList<>();
		List<Character> input = new LinkedList<>();
		for(char c:temparray){
			input.add(c);
		}
		Collections.reverse(input);
		ListIterator li = input.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		}
		
		// Reversing the string individuals world(Method-2)
//		String rev = "i am omkar ingawale";
//		String splitter[] = rev.split(" ");
//		char[] temparray = rev.toCharArray();
//		char temp;
//		int left, right = 0;
//		right = temparray.length - 1;
//		
//		for(left=0; left<right; left++ , right--){
//			temp = temparray[left];
//			temparray[left] = temparray[right];
//			temparray[right] = temp;
//		}
//		for(char k:temparray){
//			System.out.print(k);
//			System.out.println();
//		}
		
		// Reversing the string individuals world(Method-3)
//		String rev = "i am omkar ingawale";
		// Reversing the string
//		StringBuilder input = new StringBuilder();
		
		// Append a string into StringBuilder input
//		input.append(rev);
		
		// Reverse StringBuilder input
//		input.reverse();
		
//		System.out.println(input);
		
	}

}
