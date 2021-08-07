package exercise.week1;

import static java.lang.Math.sqrt;

public class QuadraticEquationRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =12;//a=0---infinity
		int b=25;//b=2--no real roots
		int c=6; 
		System.out.println("a="+a+"\nb="+b+"\nc="+c);
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
