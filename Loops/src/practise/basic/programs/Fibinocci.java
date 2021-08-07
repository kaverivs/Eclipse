package practise.basic.programs;

import java.util.Scanner;

public class Fibinocci {
	public static void main(String[] args) {
		Fibinocci f=new Fibinocci();
		f.fib();
	}
	public void fib() {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the count ");
		int count=sc.nextInt();
		int n1=0, n2=1, n3;
		n3=n1+n2;
		count=count-3;
		System.out.println("---Fibinocci series---\n");
		System.out.print(n1+","+n2+","+n3);
		while(count>0) {			
			n1=n2;
			n2=n3;
			n3=n1+n2;
			count=count-1;
			System.out.print(","+n3);
		}
		sc.close();	
	}
	
}
