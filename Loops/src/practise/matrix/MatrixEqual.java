package practise.matrix;

import java.util.Scanner;

public class MatrixEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j; 
		boolean flag=true;
		System.out.println("\n------first matrix-----");
		Scanner sc=new Scanner( System.in);		
		System.out.println("\nEnter the no. of rows :");
		int r1=sc.nextInt();
		System.out.println("\nEnter the no. of columns :");
		int c1=sc.nextInt();			
				
		
		System.out.println("\nEnter the element for the first matrix");
		int first[][]=new int [r1][c1];
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++) {
				first[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n------second matrix-----");
		
		System.out.println("\nEnter the no. of rows :");
		int r2=sc.nextInt();
		System.out.println("\nEnter the no. of columns :");
		int c2=sc.nextInt();			
				
		
		System.out.println("\nEnter the element for the second matrix");
		int second[][]=new int [r2][c2];
		
		for(i=0;i<r2;i++) {
			for(j=0;j<c2;j++) {
				second[i][j]=sc.nextInt();
			}
		}

		for(i=0;i<first.length;i++) {
			for(j=0;j<second[i].length;j++) {
				if(first[i][j]!=second[i][j]) {
					flag=false;
					break;
				}
			}
		}
		if (flag==true) {
			System.out.println("First matix and second matrix are equal");
		}
		else {
			System.out.println("First matix and second matrix are not equal");
		}
	}

}
