package thiskeyword;

//this keyword refers to the current class instance variable. 
//In this program, we are printing the reference variable and this, output of both variables are same.


public class A1 {
		void m(){  
		System.out.println(this);//prints same reference ID  
		}  
		public static void main(String args[]){  
		A1 obj=new A1();  
		System.out.println(obj);//prints the reference ID  
		obj.m();  
		}  
		  


}
