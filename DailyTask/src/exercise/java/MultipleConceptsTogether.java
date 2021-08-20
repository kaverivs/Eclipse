package exercise.java;

import java.util.Scanner;

public class MultipleConceptsTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleConceptsTogether obj= new MultipleConceptsTogether();
		obj.stringDemo();
	}	


	private void stringDemo() {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements in array");
		String array[]=new String[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.next();
		}
		String reverse=" ";
		String rev=" ";
		System.out.println("Enter the index number");
		int j=sc.nextInt();
		do {
			String str=array[j];
			
			for(int i=str.length()-1;i>=0;i--) {
				char ch=str.charAt(i);
				reverse=reverse+ch;	
			}
		}while(j<0);
			rev=rev+"\t"+reverse+"\t";
		
		System.out.println("Reverse :"+rev+" ");
		sc.close();
		MultipleConceptsTogether obj= new MultipleConceptsTogether();
		obj.stringVowels(rev);
	}
	private void stringVowels(String english) {
		// TODO Auto-generated method stub
		int v_count=0;
		int c_count=0;
		
		for (int i=0;i<english.length();i++) {
			char c = english.charAt(i);
			if((c>='A' && c<= 'Z') ||(c>='a' && c<='z')) {
				if((c=='a') || (c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A') || (c=='E')||(c=='I')||(c=='O')||(c=='U')){
					v_count=v_count+1;	
				}
				else {
					c_count=c_count+1;
				}
			}
		}
		System.out.println("\nVowel -- count : "+v_count);
		System.out.println("\nConsonant -- count : "+c_count);
		
	}
	

}
