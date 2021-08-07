package practise.loop;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number\n ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n,rem;
		double result=0;
		while (temp>0) {
			rem=temp%10;
			result=result+Math.pow(rem,3);
			temp=temp/10;
		}
		if(result==n) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an armstrong number");	
		}
	}

}
