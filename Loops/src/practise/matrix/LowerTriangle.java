package practise.matrix;

import java.util.Scanner;

public class LowerTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int r=sc.nextInt();
		System.out.println("Enter the size of column :");
		int c=sc.nextInt();
		System.out.println("\nEnter the elements\n");
		int matrix[][]=new int[r][c];
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				matrix[i][j]=sc.nextInt(); 
			}
		}
		
		for(i=0;i<r;i++) {
			System.out.println("\n");
			for(j=0;j<c;j++) {				
				if(i>=j) {
					System.out.printf("%d\t",matrix[i][j]);
				}
				else {
					System.out.print("0\t");
				}
			}
		}
	}

}
