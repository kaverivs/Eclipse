package exercise.week1;

public class OurChoice_TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurChoice_TernaryOperator obj1= new OurChoice_TernaryOperator();
		obj1.ternaryOperator();
		obj1.unaryArithmeticOperator();
	}
	
	private void ternaryOperator() {
		// TODO Auto-generated method stub
		System.out.println("\n---Ternary Operator Output----");
		String animal="Giraffe";
		boolean result =((animal.charAt(6))=='e' )? true:false ; {
			System.out.println(result);
		}
	}
	
	private void unaryArithmeticOperator() {
		// TODO Auto-generated method stub
		System.out.println("\n----Unary, Arithmetic Operator----");
		int a=6, b=3;
		System.out.println("a = "+a+"  b = "+b);
		
		int a1=(a++);
		int b1=(--b);
		System.out.println("\na1 = "+a1+"  b1 = "+b1);
		
		int result =a1-b1;//6-2 = 4
		System.out.println("Difference = "+result+"\n");
		System.out.println("a = "+a);//6-->7 -post increment
		System.out.println("b = "+b);//3-->2 -pre decrement
		
	}


}
