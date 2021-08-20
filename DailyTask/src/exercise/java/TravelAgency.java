package exercise.java;

import java.util.Scanner;

public class TravelAgency {
	
	String mode;
	String destn;
	double rate;
	int num;
	int i,j;
	double totalRate;
 
	static Scanner sc=new Scanner(System.in);
	
	void destination() {
						
			System.out.println("\nWelcome to ABC travel agency\n");
			System.out.println("Please select your destination\n1.Pune\n2.Mumbai\n3.Delhi\n");
			i=sc.nextInt();
			
			if(i==1) {
				destn="Pune";
				System.out.println("Please enter the mode of travelling you want\n1.Roadways\n2.Airways\n");
				j=sc.nextInt();
				if(j==1) {
					rate=7000;
					mode="Roadways";
				}
				else if(j==2) {
					rate=13000;
					mode="Airways";
				}
				else {
					System.out.println("Please enter valid inputs");
				}
				
			}
			else if(i==2) {
				destn="Mumbai";
				System.out.println("Please enter the mode of travelling you want\n1.Roadways\n2.Airways\n");
				j=sc.nextInt();
				if(j==1) {
					rate=10000;
					mode="Roadways";
				}
				else if(j==2) {
					rate=17000;
					mode="Airways";
				}
				else {
					System.out.println("Please enter valid inputs");
				}
				
			}
			else if(i==3) {
				destn="Delhi";
				System.out.println("Please enter the mode of travelling you want\n1.Roadways\n2.Airways\n");
				j=sc.nextInt();
				if(j==1) {
					mode="Roadways";
					rate=17000;
					
				}
				else if(j==2) {
					mode="Airways";
					rate=25000;
					
				}
				else {
					System.out.println("Please enter valid inputs");
				}
				
			}
			else {
				System.out.println("Please enter valid inputs");
			}
			System.out.println("\nYou selected the destination "+destn);
			System.out.println("\nYour travelling rate is "+rate);
			System.out.println("\n");
			
	}
	
	void passengerCount() {
		
		System.out.println("Enter the no. of passengers:");
		num=sc.nextInt();
	}
	
	void totalRate() {
		totalRate=rate*num;
	}
		
	void display() {
		
		System.out.println("\n------------TICKET-------------\n");
		System.out.println("Destination : "+destn);
		System.out.println("Mode: "+mode);
		System.out.println("Cost per each passenger: "+rate);
		System.out.println("Total Passengers: "+num);
		System.out.println("Total Cost : "+totalRate);
		
	}

}
