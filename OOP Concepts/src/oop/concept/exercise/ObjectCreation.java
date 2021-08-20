package oop.concept.exercise;

import java.util.Scanner;

public class ObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nenter the first number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("\nenter the second number");
		int b=sc.nextInt();
		System.out.println("\nenter the third number");
		int c=sc.nextInt();
		
		ObjectCreation obj=new ObjectCreation();
		//overloading
		obj.sum(a,b);
		
		double a1=a;
		double b1=b;
		obj.sum(a1,b1);
		
		obj.sum(a,b,c);
			
		//passing value
		obj.difference(25,5);
		
		int product=obj.multiplication(a,b);
		System.out.println("\n\nPRODUCT : "+product);
	}
	
	private void sum(double a, double b) {
		// TODO Auto-generated method stub
		Double s=a+b;	
		System.out.println("\nSUM METHOD WITH 2 ARGUMENTS BUT DIFFERENT DATA TYPES : "+s);
	}

	//have return value
	private void sum(int a, int b) {
		// TODO Auto-generated method stub
		int s=a+b;	
		System.out.println("\nSUM METHOD WITH 2 ARGUMENT : "+s);
	}
	
	private void sum(int a, int b,int c) {
		// TODO Auto-generated method stub
		int s=a+b+c;	
		System.out.println("\nSUM METHOD WITH 3 ARGUMENT : "+s);
	}
	
	//void-no return value
	private void difference(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;	
		System.out.print("\nDIFFERENCE: 25-5 = "+c);
	}
	
	
	private int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		int c=a*b;	
		return c;
	}

}
