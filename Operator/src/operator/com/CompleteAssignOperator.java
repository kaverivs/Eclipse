package operator.com;

public class CompleteAssignOperator {
	public static void main(String as[])
	{
	    int a = 30;
	    int b = 10;
	    int c = 0;
	      c = a + b;
	System.out.println("c = a + b = " + c );
	      c += a ;
	System.out.println("c += a  = " + c );
	      c -= a ;
	System.out.println("c -= a = " + c );
	      c *= a ;
	System.out.println("c *= a = " + c );
	      a = 20;
	      c = 25;
	      c /= a ;
	System.out.println("c /= a = " + c );
	      a = 20;
	      c = 25;
	      c %= a ;
	System.out.println("c %= a  = " + c );
	      c <<= 2 ;
	System.out.println("c <<= 2 = " + c );
	      c >>= 2 ;
	System.out.println("c >>= 2 = " + c );
	      c >>= 2 ;
	System.out.println("c >>= 2 = " + c );
	      c &= a ;
	System.out.println("c &= a  = " + c );
	      c ^= a ;
	System.out.println("c ^= a   = " + c );
	      c |= a ;
	System.out.println("c |= a   = " + c );
	    }
}





