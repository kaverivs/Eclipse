package com.demo6;

import java.util.Scanner;

public class Average {
	int n,d;
	int sum=0;
	int i=1;
	public int avg() {
		System.out.println("Enter the total number :\n");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1, sum=0;
		while (i<=n) {
			 System.out.println("Enter the number : ");
			 d=sc.nextInt();
			 sum=sum+d;
			 i++;			 
		 }
		System.out.println(sum);
		System.out.println(n);
		int avg=sum/n;
		System.out.println("Average :"+avg);
		return avg;
	}
}
