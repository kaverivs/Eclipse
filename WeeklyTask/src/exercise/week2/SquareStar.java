

// 8.PATTERNS PROGRAM LIST

package exercise.week2;

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner( System.in);
		System.out.println("\nEnter the no. of lines :");
		int n=sc.nextInt();
		
//square star
		
		System.out.println("\n");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
//hollow square
		
		System.out.println("\n");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}

}
