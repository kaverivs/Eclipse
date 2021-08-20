package oop.concept.exercise;
import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nEnter the first string");
		Scanner sc= new Scanner(System.in);
		String str1=sc.next();
		System.out.println("\nEnter the second string");
		String str2=sc.next();
		
		//concatenation
		String output1=concat(str1,str2);
		System.out.println("Concatenation - "+output1);
		
		//substring
		String	output2=substring(output1);
		System.out.println("Substring - "+output2);
		
		//length
		String output3=length(str1);
		System.out.println("length of "+str1+ " - "+output3);
		
		//upper and lower case
		String output4=upperOrLower(str1);
		System.out.println("Starting with - "+output4);
		
		//comparing
		String output5=compare(str1,str2);
		System.out.println(output5);
		
		
	}

	private static String length(String str1) {		
		// TODO Auto-generated method stub
		System.out.println("\n----Length of string----\n");
		String length=String.valueOf(str1.length());
		return length;
	}

	private static String compare(String str1, String str2) {
		// TODO Auto-generated method stub
		System.out.println("\n----comparing string----\n");
		String result;
		if(str1.equals(str2)) {
			 result="true";
		}
		else {
			 result="false";
		}
		return result;
	}

	private static String upperOrLower(String str1) {
		// TODO Auto-generated method stub
		System.out.println("\n----uppercase or lowercase----\n");
		char c=str1.charAt(0);
		String result;
		System.out.println(c);
		if(c>='A'&& c<='Z') {
			result="Uppercase";
		}
		else if (c>='a'&& c<'z') {
			result="Lowercase";
		}
		else {
			result="Invalid string";
		}
		return result;
	}

	private static String substring(String str1) {
		// TODO Auto-generated method stub
		System.out.println("\n----substring----\n");
		System.out.println("\nenter the starting index to get substring :");
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("enter the last endindex to get substring :");
		int j=sc.nextInt();
		String subString=str1.substring(i, j);
		return subString;
	}

	private static String concat(String str1,String str2) {
		// TODO Auto-generated method stub
		System.out.println("\n----concatenation----\n");
		String result=str1+str2;
		return result;
	}
	
	

}
