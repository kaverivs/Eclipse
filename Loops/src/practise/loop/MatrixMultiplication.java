package practise.loop;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k, sum=0;
		System.out.println("\n------first matrix-----");
		Scanner sc=new Scanner( System.in);
		System.out.println("\nEnter the no. of rows :");
		int r1=sc.nextInt();
		System.out.println("\nEnter the no. of columns :");
		int c1=sc.nextInt();	
		
		
		System.out.println("\n-----second matrix-----");
		System.out.println("\nEnter the no. of rows :");
		int r2=sc.nextInt();
		System.out.println("\nEnter the no. of columns :");
		int c2=sc.nextInt();	
		
		
		//check whether the column size of first matrix is equal to the row size of second matrix.
		if((c1!=r2) ){
			System.out.println("\n---Condition is not satisfied --- "
					+ "\ncolumn size of first matrix should be equal to the row size of second matrix");
		}
		
		else{
			System.out.println("------------------------");
			System.out.println("\nEnter the element for the first matrix");
			int first[][]=new int [r1][c1];
			
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++) {
					first[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("\nEnter the element for the second matrix");
			int second[][]=new int [r2][c2];
			
			for(i=0;i<r2;i++) {
				for(j=0;j<c2;j++) {
					second[i][j]=sc.nextInt();
				}
			}	
			
			//resultant matrix
			int result[][]=new int[r1][c2];
			
			//operations
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					for(k=0;k<c1;k++) {
						sum=sum+first[i][k]*second[k][j];
					}
					result[i][j]=sum;
					sum=0;
				}
			}
			System.out.println("\n----The resultant matrix----\n");
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					
					System.out.print(result[i][j]+"  ");
				}
				System.out.println();
			}
		}
		
		
	}

}
