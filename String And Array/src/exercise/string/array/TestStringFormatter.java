package exercise.string.array;

public class TestStringFormatter {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	 
		System.out.println(StringFormatter.reverseString("my name is khan"));  
		System.out.println(StringFormatter.reverseString("I am sonoo jaiswal"));
	}
	public static class StringFormatter {  
		public static String reverseString(String str){  
		   StringBuilder sb=new StringBuilder(str);  
		   sb.reverse();  
		   return sb.toString();  
		}  
	}  
}


