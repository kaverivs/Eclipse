package operator.com;

public class CompleteArithmeticOperator {
	public static void main(String as[])
    {
        int a, b, c;
        a=10;
        b=2;
        c=a+b;
        System.out.println("Addtion: "+c);
        c=a-b;
        System.out.println("Substraction: "+c);
        c=a*b;
        System.out.println("Multiplication: "+c);
        c=a/b;
        System.out.println("Division: "+c);
        b=3;
        c=a%b;
        System.out.println("Remainder: "+c);
        a=++a;
        System.out.println("Increment Operator: "+a);
        a=--a;
        System.out.println("decrement Operator: "+a);       

    }


}
