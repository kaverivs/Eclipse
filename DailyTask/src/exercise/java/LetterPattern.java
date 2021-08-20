package exercise.java;

import java.util.Scanner;

public class LetterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LetterPattern obj=new LetterPattern();
		obj.patternK(n);
		//obj.patternA(n);
		//obj.patternV(n);
		obj.patternE(n);
		sc.close();
	}


	//K
	private void patternK(int n) {

		String s="K";
		System.out.println("\n"+s+"\n\n");
		int size=n*2-1;
		for(int i=0;i<n/2;i++){
			System.out.print(" ");
			System.out.print("*");
			for(int j=(size)/2;j>=i;j--){
				System.out.print(" ");
			}			
			System.out.print("*");
			System.out.println();
		}
		for(int i=(n/2);i>=0;i--){
			System.out.print(" ");
			System.out.print("*");
			for(int j=i;j<=(size/2);j++){
				System.out.print(" ");
			}		
			System.out.print("*");
			System.out.println();
		}
	}
	
	//A
	private void patternA(int n) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		for(i=1;i<=n;i++) {
			System.out.println(" ");
			for(j=1;j<=n;j++) {				
				if((i==n)&&(j==1)||((j==n)&&(i==n))||(i==1)&&(j==n/2)) {
					System.out.print("*");
				}				
				else {
					System.out.print(" ");
					
				}
				for(k=i+1;k;k++) {
					if(k==) {
						System.out.print("*");
					}
				}
										
			}
			
			
			System.out.println();
		}
		
		
		
	}

	private void patternV(int n) {
		
		int i,j;
		String s="V";
		System.out.println("\n"+s+"\n\n");
		int size=n*2-1;
		for(i=1;i<=n;i++) {
			System.out.println(" ");
			for(j=1;j<=n*2;j++) {
				if((i==1)&(j==1)){
					System.out.print("*");
				}
				else if((j==i)) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				while(j==size) {
					System.out.print("*");
					size--;
				}
			}
		}
		System.out.println();
		
	}
	
	private void patternE(int n) {

		int i,j;
		String s="E";
		System.out.println("\n"+s+"\n\n");
		int size=n*2-1;
		for( i=0;i<n;i++){
			System.out.print(" ");
			for(j=0;j<n;j++) {
				if((i==0)||(i==n-1)||(i==(n-1)/2)) {
					System.out.print(" ");
					System.out.print("*");
				}
			}			
			System.out.println("*");
			System.out.println();
		}	
		/*for(i=1;i<=n;i++) {
			System.out.print(" ");
			//System.out.println("*");
			for(j=1;j<=n;j++) {
				if((i==1)||(i==n)||(i==n/2)) {
					System.out.print(" ");
					System.out.print("*");
				}
				else if(j==1) {
					System.out.println("*");
				}
			}
		}*/
		System.out.println();
	}
}
