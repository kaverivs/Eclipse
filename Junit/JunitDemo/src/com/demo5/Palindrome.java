package com.demo5;

import java.util.Scanner;

public class Palindrome {
	
	public static int StringPalindrome() {
		// TODO Auto-generated method stub

		System.out.println("Enter a string : ");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			char ch=input.charAt(i);
			reverse=reverse+ch;
		}
		
		//System.out.println("reverse : "+reverse);
		if(input.toLowerCase().equals(reverse.toLowerCase())) {
			//System.out.println("palindrome");
			return 1;
		}
		else {
			//System.out.println("not palindrome");
			return 0;
		}
	}
}
