package practise.loop;

import java.util.Scanner;

public class InvertedPyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner( System.in);
		System.out.println("\nEnter the no. of lines :");
		int n=sc.nextInt();
		
		
		//Inverted pyramid star
		for(i=n;i>0;i--) {
			for ( j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
