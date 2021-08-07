package practise.loop;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number\n ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		boolean b =false;
		int i=2;
		
		while(i<=n/2) {
			if(n%i==0) {
				b=true;
				break;
			}
			++i;
		}
		if(b==false) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
			
		}
		sc.close();
	}

}
