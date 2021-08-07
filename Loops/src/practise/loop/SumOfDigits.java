package practise.loop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number\n ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n,rem;
		int sum=0;
		while (temp>0) {
			
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println("sum : "+sum);
	}

}
