package exercise.week1;

public class OurChoice_LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='q';
		if(ch>='a'&& ch<='z') {
			System.out.println("Lowercase");
		}
		else if(ch>='A'&& ch<='Z'){
			System.out.println("Uppercase");
		}
		else {
			System.out.println("Invalid character");
		}

	}

}
