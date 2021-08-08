package exercise.week2.project;

import java.util.Scanner;

public class CourseDisplay extends Display  {
	
	private int register;
	protected static double amnt;
	protected static String course;
	protected static int discount;
	protected static int duration;
	protected static int weekly;
	protected static double finalFee;
	
	static Scanner sc=new Scanner(System.in);

//Display the course related details
	
	void display() {
		Course c=new Course();
		int n;
		System.out.println("-------------------------------HOME PAGE--------------------------------------");
		System.out.println("\nHI "+LoginDisplay.n.toUpperCase()+" !!!");
		System.out.println("\n**Welcome to My eLearning App**");
		System.out.println("\nTake the next step in your career with a world class learning experience");	
		System.out.println();
		System.out.println("select your favourite course-----AWAITING FIXED DISCOUNT OFFERS FOR EACH COURSE\n");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\nThe most in-demand courses in our e-Learning platform.");
		do {
			System.out.println("\n1.Artificial Intelligence and machine learning\n2.Data science\n3.SAP hybris\n"
					+ "4.Java full Stack Developer\n5.Cloud Technology\n");			
			n=sc.nextInt();
			switch(n) {
				case 1:
				{
					c.setAmnt(85000);
					c.setDuration(130);
					c.setWeekly(8);	
					c.setCourse("Artificial Intelligence and machine learning");
					c.setDiscount(35);
					finalFee=totalCourseFee(c.getAmnt(),c.getDiscount());
					c.setFinalFee(finalFee);
					System.out.println("\n------------------------------COURSE DETAILS----------------------------------\n");
					System.out.println(c.toString());
					break;
			}
				case 2:
				{
					c.setAmnt(50000);
					c.setDuration(90);
					c.setWeekly(9);	
					c.setCourse("Data science");
					c.setDiscount(20);
					finalFee=totalCourseFee(c.getAmnt(),c.getDiscount());
					c.setFinalFee(finalFee);
					System.out.println("\n------------------------------COURSE DETAILS----------------------------------\n");
					System.out.println(c.toString());
					break;
				}
				case 3:
				{
					c.setAmnt(45000);
					c.setDuration(78);
					c.setWeekly(8);	
					c.setCourse("SAP hybris");
					c.setDiscount(15);
					finalFee=totalCourseFee(c.getAmnt(),c.getDiscount());
					c.setFinalFee(finalFee);
					System.out.println("\n------------------------------COURSE DETAILS----------------------------------\n");					
					System.out.println(c.toString());
					break;
				}
				case 4:
				{
					c.setAmnt(57000);
					c.setDuration(106);
					c.setWeekly(10);	
					c.setCourse("Java full Stack Developer");
					c.setDiscount(25);
					finalFee=totalCourseFee(c.getAmnt(),c.getDiscount());
					c.setFinalFee(finalFee);
					System.out.println("\n------------------------------COURSE DETAILS----------------------------------\n");					
					System.out.println(c.toString());
					break;
				}
				case 5:
				{
					c.setAmnt(55000);
					c.setDuration(112);
					c.setWeekly(7);	
					c.setCourse("Cloud Technology");
					c.setDiscount(21);
					finalFee=totalCourseFee(c.getAmnt(),c.getDiscount());
					c.setFinalFee(finalFee);
					System.out.println("\n------------------------------COURSE DETAILS----------------------------------\n");
					System.out.println(c.toString());
					break;
				}
				
				default:
					System.out.println("Invalid entry.");
					break;
				
			}//switch close
						
			if(n>=1 && n<=5) {
				System.out.println("\n\nDo you want to continue?\n1.Continue\n2.Back\n");
				register=sc.nextInt();
				if(register<0||register>2) {
					System.out.println("Invalid entry. please try again.");
				}
			}
			else if(n>5 || n<1 || n<0) {
				System.out.println("Please enter a valid course");
				register=2;
			}
			else{
				System.out.println("Some error occured.Please try again!!");
				register=2;
			}
				
		}while(register!=1); //do while close	
		
		amnt=c.getAmnt();
		course=c.getCourse();
		duration=c.getDuration();
		discount=c.getDiscount();
		weekly=c.getWeekly();
		finalFee=c.getFinalFee();
		
		Display d3 =new RegistrationDisplay();	
		d3.display();
}

//method to discount the course fee
	
public double totalCourseFee(double amount,int discount) {
	// TODO Auto-generated method stub
	double d=discount;
	d= d/100;
	double temp=amount*d;
	double fee=amount-temp;
	return fee;
	
}



}
