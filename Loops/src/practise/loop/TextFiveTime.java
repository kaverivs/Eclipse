package practise.loop;

import java.util.Scanner;

public class TextFiveTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word :\n");
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		for(int i=1;i<=5;i++) {
			System.out.println(text);
		}
		sc.close();
	}

}
