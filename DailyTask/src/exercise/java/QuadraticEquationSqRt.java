package exercise.java;
import static java.lang.Math.*;
public class QuadraticEquationSqRt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =1;
		int b=2;
		int c=1; 
		float result=(b*b)-(4*a*c);
		double sqrt =sqrt(result);
		if(a!=0) {
		if (result>0) {
			double d1 =(-b+sqrt)/(2*a); 
			double d2= (-b-sqrt)/(2*a);
			System.out.println(" The square roots are :"+ d1 +","+d2);
		}
		else if(result==0) {
			double d1 =-b/(2*a);
			System.out.println("The square root is : "+d1);
		}
		else {
			System.out.println("No real roots");
		}
	}
	
	else {
		System.out.println("infinity, no real roots");
	}
	}
}
