package exercise.string.array;

public class StringFunctions {

	static float floatVar=4.7f;
	static int intVar=9567;
	static String stringVar="Java World";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.printf("\nThe value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);

		String fs;
		fs = String.format("\nThe value of the float variable is " +
		                 "%f, while the value of the integer " +
		                 "variable is %d, and the string " +
		                 "is %s", floatVar, intVar, stringVar);
		System.out.println(fs);
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("\nThe length of the txt string is: " + txt.length());
		
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt1.toLowerCase());   // Outputs "hello world"
		
		String txt2 = "\nPlease locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate")); // Outputs 7
		
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
	}

}
