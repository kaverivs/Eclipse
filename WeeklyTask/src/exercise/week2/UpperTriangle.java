

// 4. MATRIX PROGRAM LIST

package exercise.week2;

import java.util.Scanner;

public class UpperTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size :");
		int r=sc.nextInt();
		System.out.println("enter the column size :");
		int c=sc.nextInt();
		int matrix[][]=new int[r][c];
		System.out.println("enter the elements:");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<r;i++) {
			System.out.println("\n");
			for(j=0;j<c;j++) {
				if(i<=j) {
					System.out.printf("%d\t",matrix[i][j]);
				}
				else {
					System.out.print("0\t");
				}
			}
		}
		
	}

}
