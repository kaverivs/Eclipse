package exercise.java;

import java.util.Scanner;

public class OopConceptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OopConceptMain x= new OopConceptMain();
		x.voteEligibility();
	}

	private void voteEligibility() {
		// TODO Auto-generated method stub
		OopConceptAttributes y= new OopConceptAttributes();
		System.out.println("Enter your name");
		Scanner sc= new Scanner(System.in);
		String n=y.setName(sc.next());
		System.out.println("Enter your age");
		int a=y.setAge(sc.nextInt());
		if(a>=0 && a<120) {
		if(a<18) {
			System.out.println(n+" is not eligible for vote");
		}
		else {
			System.out.println(n+" is eligible for vote");
		}
		}
		else {
			System.out.println("Please enter a valid age");
		}
		sc.close();
	}
}
