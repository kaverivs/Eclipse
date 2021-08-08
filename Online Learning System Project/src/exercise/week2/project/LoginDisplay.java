package exercise.week2.project;

import java.util.Scanner;

public class LoginDisplay extends Display {
	
	protected static String n;
	protected static String e;
	protected static String psw;
	
	 void display() {
		 
		System.out.println("\n\tMy eLearning App!!\n");	
		System.out.println("The best choice for those who are enthusiastic on latest technologies");	
		System.out.println("\n-------------------------------FREE LOGIN----------------------------------\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name :");
		n=sc.next();
		System.out.println("Please enter your email id :");
		e=sc.next();
		System.out.println("Please enter the password:");
		psw=sc.next();
		
	//invoking the class Login and passing the user input
		
		Login login=new Login();
		login.setName(n);
		login.setEmail(e);
		login.setPswd(psw);
		Display d1=new TraineeOldDisplay();
		d1.display();
	}

}
