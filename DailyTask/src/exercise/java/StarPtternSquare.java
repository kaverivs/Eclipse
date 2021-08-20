package exercise.java;

import java.util.Scanner;

public class StarPtternSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		StarPtternSquare obj1=new StarPtternSquare();
		obj1.usingForLoop();
		obj1.usingWhile();
		obj1.usingDoWhile();
	}

	private void usingDoWhile() {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n------DO WHILE LOOP-----");
		System.out.println("\nEnter n :");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the symbol :");
		char c=sc.next().charAt(0);
		int i=1; 
		do {
			int j=1;
			do {
				System.out.print(c);
			}while(j++<n);			
			System.out.println();
		}while(i++<n);
	}

	private void usingWhile() {
		// TODO Auto-generated method stub
		System.out.println("\n\n------ WHILE LOOP-----");
		System.out.println("\nEnter n :");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the symbol :");
		char c=sc.next().charAt(0);
		int i=0; 
		while(i++<n) {
			int j=0;
			while(j++<n) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	private void usingForLoop() {
		// TODO Auto-generated method stub
		System.out.println("\n\n------FOR LOOP-----");
		System.out.println("Enter n :");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the symbol :");
		char c=sc.next().charAt(0);
		int i, j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
