package practise.loop;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the a string:");
		Scanner sc= new Scanner(System.in);
		String english=sc.next();
		String vowels="";
		String consonants="";
		int v_count=0;
		int c_count=0;
		
		for (int n=0;n<english.length();n++) {
			char c = english.charAt(n);
			if((c>='A' && c<= 'Z') ||(c>='a' && c<='z')) {
				if((c=='a') || (c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A') || (c=='E')||(c=='I')||(c=='O')||(c=='U')){
					v_count=v_count+1;	
					vowels=vowels+" "+c;
				}
				else {
					consonants=consonants+" "+c;
					c_count=c_count+1;
				}
			}
			else{
				System.out.println("\nInvalid character");
			}
		}
		System.out.println("\nVowel -- count : "+v_count);
		System.out.println("Vowels in "+english+" : "+vowels);
		System.out.println("\nConsonant -- count : "+c_count);
		System.out.println("Consonants in "+english+" : "+consonants);
	}

}
