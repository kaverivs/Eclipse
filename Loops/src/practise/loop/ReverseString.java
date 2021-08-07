package practise.loop;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String string=sc.next();
		
		int length=string.length();
		String output="";
		
		for(int i=length-1;i>=0;i--) {
			char ch=string.charAt(i);
				if(ch==' ') {
					output=output+' ';
				}
				else {
				output=output+ch;
				}
		}
		System.out.println("Orginal string : "+string);
		System.out.println("Reversed string : "+output);
		sc.close();
	}

}  