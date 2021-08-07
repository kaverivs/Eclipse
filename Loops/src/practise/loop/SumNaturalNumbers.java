package practise.loop;

import java.util.Scanner;

public class SumNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n\n ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		//int sum=n*(n+1)/2;//without loop
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
		sc.close();
	}

}
