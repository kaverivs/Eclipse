package com.demo3;

import java.util.Scanner;

public class Armstrong {
	public static String result() { 
		System.out.println("Enter the number\n ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n,rem;
		String output;
		double result=0;
		while (temp>0) {
			rem=temp%10;
			result=result+Math.pow(rem,3);
			temp=temp/10;
		}
		if(result==n) {
			output="Armstrong number";
			System.out.println(output);
		}
		else {
			output ="Not an armstrong number";
			System.out.println(output);

		}
		return output;
	}
}
