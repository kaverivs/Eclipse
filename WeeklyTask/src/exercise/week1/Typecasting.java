package exercise.week1;

public class Typecasting {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Typecasting obj1= new Typecasting();
		obj1.charString();
		obj1.charInt();
		obj1.intLong();
		obj1.booleanString();
		obj1.intString();
		obj1.intDouble();
		obj1.stringDouble();
		obj1.primitiveToObject();
		obj1.objectToPrimitive();
	}
	
	private void charString() {	
		
		System.out.println("---------Char to string & string to char----------");
		char char1='a';
		String name="Java";
		System.out.println("\ncharacter : "+char1+"\nString : "+name);
		
		//Converts String to char using index
		char char2=name.charAt(2);
		System.out.println("\nString to Char using index 2 : " +char2);
		
		//converts char to string
		String str=Character.toString(char1);
		System.out.println("Char to String : "+str);
	}

	private void charInt() {	
		
		System.out.println("\n----------Char to int & int to char------------");
		char char1='A', char2='1';	
		System.out.println("\nchar1 : "+char1+"\nchar2 : "+char2);
		
		// converts char to int --got ASCII value
		int a=(int)char1, b=char2; 
		System.out.println("\nChar to Int : int1 = "+a+"  int2 = "+b);
		
		int total= a+b;
		System.out.println("(Sum = "+total+")");
		
		// converts int to char
		char output=(char)(total); // 65+49=114 -- r
		System.out.println("Int to Char : sum = "+output);
	}
	
	private void intLong() {
		
		System.out.println("\n----------int to long & long to int------------");
		int x=78, y=900;
		System.out.println("\nx : "+x+"\ny : "+y);
		
		long product=x*y; //converts int to long
		System.out.println("\nInt to Long : multiply = "+product);
		int z=(int)product; // Converts long to int --- type casting(narrowing)
		System.out.println("Long to Int : z = "+z);
	}
	
	private void booleanString() {
		
		System.out.println("\n----------Boolean to String & String to Boolean------------");
		boolean b=true;
		String s="not true";
		System.out.println("\nb= "+b+"\ns = "+s);
		
		String boolean1=String.valueOf(b); //converts boolean to string
		System.out.println("\nBoolean to string : "+boolean1);
		boolean string1=Boolean.parseBoolean(s); //converts string to boolean
		System.out.println("String to boolean : "+string1);	
	}
	
	private void intString() {
		
		System.out.println("\n----------int to String & String to int------------");
		int x=29;
		String s="96";
		System.out.println("\nx= "+x+"\ns = "+s);
		
		String s1=String.valueOf(x);//converts int to string
		System.out.println("\nInt to string : "+s1);
		int i=Integer.parseInt(s);//converts string to int
		System.out.println("String to int : "+i);	
	}
	
	private void intDouble() {
		
		System.out.println("\n----------int to Double & Double to int------------");
		int x=666, y=29;
		System.out.println("\nx= "+x+"\ny = "+y);
		
		double z=(x*y);// converts int to double
		System.out.println("("+x+"*"+y+")/2.5 = "+z);
		System.out.println("\nInt to double : "+z);
		int output =(int) z;//converts double into int
		System.out.println("Double to int : "+output);		
	}
	
	private void stringDouble() {
		
		System.out.println("\n----------int to Double & Double to int------------");
		double d=44.8970;
		String s="12.3698";
		System.out.println("\nd = "+d+"\ns = "+s);
		
		String str=String.valueOf(d);//converts double to string
		System.out.println("\nDouble to String : "+str);		
		double db=Double.parseDouble(s);//converts String to double
		System.out.println("String to Double : "+db);		
	}
	
	private void primitiveToObject() {
		System.out.println("\n----------Primitive to Object------------");
		
		short s=12;
		int a=13;
		long b=58;
		float c=2.6f;
		double d=2.86954d;
		boolean e =false;
		
		//Primitive to Object 		
		Integer i =Integer.valueOf(a);		
		Integer i1= Integer.valueOf(s);
		Long i2= Long.valueOf(b);
		Float f1=Float.valueOf(c);
		Double d1= Double.valueOf(d);
		Boolean b1= Boolean.valueOf(e);
				
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(b1);	
	}
	private void objectToPrimitive() {
		System.out.println("\n------------Object to Primitive--------------");
		
		Integer i =Integer.valueOf(5);
		Integer i1= Integer.valueOf(15);
		Long i2= Long.valueOf(1236);
		Float f1=Float.valueOf(85.9f);
		Double d1= Double.valueOf(789456.3d);
		Boolean b1= Boolean.valueOf(true);
		
		//Object to Primitive 
		short s=i.shortValue();
		int a=i1.intValue();
		long b=i2.longValue();
		float c=f1.floatValue();
		double d=d1.doubleValue();
		boolean e=b1.booleanValue();
				
		System.out.println(s);		
		System.out.println(a);		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
