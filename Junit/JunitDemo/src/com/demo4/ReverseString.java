package com.demo4;

import java.util.Scanner;

public class ReverseString {
	
	static String string;
	public static String Orginal() {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		string=sc.next();
		return string;
	}
	
	public static String reverse(String string) {
		
		
		int length=string.length();
		String output="";
		
		for(int i=length-1;i>=0;i--) {
			char ch=string.charAt(i);
				if(ch==' ') {
					output=output+' ';
				}
				else {
				output=output+ch;
				}
		}
		System.out.println("Orginal string : "+string);
		System.out.println("Reversed string: "+output);
		return output;
	}

}
