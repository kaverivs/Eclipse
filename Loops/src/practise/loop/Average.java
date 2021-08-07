package practise.loop;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the total number :\n");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1, sum=0;
		while (i<=n) {
			 System.out.println("Enter the number : ");
			 int d=sc.nextInt();
			 sum=sum+d;
			 i++;			 
		 }
		double avg=sum/n;
		System.out.println("Average :"+avg);
	}

}
