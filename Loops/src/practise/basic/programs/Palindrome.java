package practise.basic.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome obj=new Palindrome();
		obj.StringPalindrome();		
	}

	

	private void StringPalindrome() {
		// TODO Auto-generated method stub

		System.out.println("Enter a string : ");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			char ch=input.charAt(i);
			reverse=reverse+ch;
		}
		
		System.out.println(reverse);
		if(input.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		sc.close();
	}
	
	

}
