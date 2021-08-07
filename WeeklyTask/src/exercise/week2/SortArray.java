package exercise.week2;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int Array[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			Array[i]=sc.nextInt();
		}
		Arrays.sort(Array);
		System.out.println("\nAfter sorting\n");
		for(int i=0;i<n;i++) {
			System.out.print(" "+Array[i]);
		}
		
	}

}
