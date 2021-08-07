package practise.loop;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		Scanner sc=new Scanner( System.in);
		System.out.println("\nEnter the no. of rows :");
		int r=sc.nextInt();
		System.out.println("\nEnter the no. of columns :");
		int c=sc.nextInt();			
				
		
		System.out.println("\nEnter the element for the first matrix");
		int first[][]=new int [r][c];
		System.out.println("\n------first matrix-----");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				first[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\nEnter the element for the second matrix");
		int second[][]=new int [r][c];
		System.out.println("\n------second matrix-----");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				second[i][j]=sc.nextInt();
			}
		}
		
		//resultant matrix
		int result[][]=new int[r][c];
		
		//operations
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				
				result[i][j]=first[i][j]+second[i][j];
				
			}
		}
		System.out.println("\n----The resultant sum matrix----\n");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				
				System.out.print(result[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
