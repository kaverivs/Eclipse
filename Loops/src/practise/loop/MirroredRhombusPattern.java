package practise.loop;

import java.util.Scanner;

public class MirroredRhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner( System.in);
		System.out.println("\nEnter the no. of lines :");
		int n=sc.nextInt();
		
		
		//Mirrored Rhombus  star pattern
		System.out.println("\n");
		for(i=1;i<=n;i++) {
			for(j=n-i;j<=n;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//HOLLOW RHOMBUS STAR PATTERN
		System.out.println("\n");
		for(i=1;i<=n;i++) {
			for(j=n-i;j<=n;j++) {
				System.out.print(" ");				
			}
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
