package exercise.java;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMICalculator obj = new BMICalculator();
		obj.inputs();
	}

	private void inputs() {
		// TODO Auto-generated method stub
		System.out.println("Enter your gender:");
		Scanner scan=new Scanner(System.in);
		String gender = scan.next();	
		System.out.println("Enter your age : ");
		Scanner scan1=new Scanner(System.in);
		int age = scan1.nextInt();		
		
		BMICalculator obj1= new BMICalculator();	
		float bmi=obj1.bmi();
		
		obj1.result(gender,age,bmi);
		scan.close();	
		scan1.close();	
	}

	private float bmi() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in m:");
		float height=sc.nextFloat();
		System.out.println("Enter your weight in kg :");
		float weight=sc.nextFloat();
		float b= weight/(height*height);
		System.out.println("\nBMI is "+b+"\n");
		sc.close();
		return b;			
	}
	
	private void result(String gender, int age, float bmi) {
		// TODO Auto-generated method stub		
		switch (gender) {
		
		case "male":
			 {				 
				if(bmi<18.5) {		
					System.out.println("Under weight - Malnutrition Risk");		
				}
				else if((bmi>=18.5) && (bmi<=24.9)) {
					System.out.println("Normal weight - Healthy ");	
				}
				else if ((bmi >= 25.0) && (bmi <=29.9))
	            {
	                System.out.println("Over weight - Enhanced risk ");
	            }
				else if(bmi>30.0)
				{
					System.out.println("Obese - High risk ");
				}
				break;
			}
			
		case "female":
			{	
				if(bmi<18.5) {		
					System.out.println("Under weight - Malnutrition Risk");		
				}
				else if((bmi>=18.5) && (bmi<=24.9)) {
					System.out.println("Normal weight - Healthy ");	
				}
				else if ((bmi >= 25.0) && (bmi <=29.9))
	            {
	                System.out.println("Over weight - Enhanced risk ");
	            }
				else if(bmi>30.0)
				{
					System.out.println("Obese - High risk ");
				}
				break;
			}
			default : 
				System.out.println("Please enter a valid input");
		}
	}

}
