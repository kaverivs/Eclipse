package oop.concept.exercise;
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nenter the first number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("\nenter the second number");
		int b=sc.nextInt();
		int sum=sum(a,b);
		
		System.out.println("\nSUM : "+sum);
		int sub=difference(a,b);
		System.out.println("\nDIFFERENCE : "+sub);
		int product=multiplication(a,b);
		System.out.println("\nPRODUCT : "+product);
		int quotient=divide(a,b);
		System.out.println("\nQUOTIENT : "+quotient);
		int reminder=modulus(a,b);
		System.out.println("\nREMINDER : " +reminder);
		sc.close();
	}

	private static int modulus(int a, int b) {
		// TODO Auto-generated method stub
		int c=a%b;	
		return c;
	}

	private static int divide(int a, int b) {
		// TODO Auto-generated method stub
		int c=a/b;	
		return c;
	}

	private static int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		int c=a*b;	
		return c;
	}

	private static int difference(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;	
		return c;
	}

	private static int sum(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;	
		return c;
	}
	
	

}
