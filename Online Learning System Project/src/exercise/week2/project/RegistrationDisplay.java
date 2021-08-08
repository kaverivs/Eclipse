package exercise.week2.project;

import java.util.Scanner;

public class RegistrationDisplay extends CourseDisplay {
	
	static Scanner scan=new Scanner(System.in);
	
	void display() {
		
		System.out.println("\n----------------------------COURSE REGISTRATION----------------------------------------\n");
		System.out.println("");
		System.out.println("Hi "+LoginDisplay.n+",Please enter your details\n");
		System.out.println("Age : ");
		int age=scan.nextInt();	
		System.out.println("Contact number : ");
		String phn=scan.next();
		System.out.println("Status (Student/working/others): ");	
		String status=scan.next();	
		System.out.println("Motive : ");
		scan.nextLine();
		String motive=scan.nextLine();	
		
		//anonymous object created		
		new Registration(age,  phn, status,  motive);
		System.out.println("\nYour registration is successfully completed.\n");
		
		System.out.println("\n-----------------------------------MY PROFILE--------------------------------------------\n");
		System.out.println("\n---------------------ABOUT ME---------------------");
		System.out.println("\nName :" + LoginDisplay.n + "\nAge : " + age + "\nEmail id : " + LoginDisplay.e + "\nContact No. : " + phn + "\nStatus : "
				+ status + "\nMotive : " + motive );
		
		System.out.println("\n---------------------ABOUT COURSE-----------------");
		System.out.println("\nCourse name : " + course + "\nDuration : "+duration+" days\nSessions per week : "+weekly+" hrs\nCourse fee : "+amnt+
				"\nDiscount : "+discount+"\nFinal fee : " + finalFee + "\n");
		
		Display d= new RegistrationDisplay();
		d.newReg();
	}
}
