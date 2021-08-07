
// 5. STRINGS PROGRAM LIST

package exercise.week2;

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
		System.out.println("\n");
		if(input.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println(reverse+" is a palindrome");
		}
		else {
			System.out.println(reverse+" is not a palindrome");
		}
		sc.close();
	}
	
	

}
