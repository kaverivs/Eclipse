package practise.loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n\n ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1,factorial=1;
		while (i<=n) {
			factorial=factorial*i;
			i++;
		}
		System.out.println("factorial : "+factorial);
	}

}
