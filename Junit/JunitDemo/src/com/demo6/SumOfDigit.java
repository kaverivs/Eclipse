package com.demo6;

import java.util.Scanner;

public class SumOfDigit {
	
	int n, sum=0;

	public int sum() {
		System.out.println("Enter the number\n ");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int temp=n,rem;
		while (temp>0) {
			
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println("sum : "+sum);
		return sum;
	}

}
