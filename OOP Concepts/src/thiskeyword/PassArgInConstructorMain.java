package thiskeyword;

public class PassArgInConstructorMain {
	int data=10;  
	PassArgInConstructorMain(){  
		PassArgInConstructor b=new PassArgInConstructor(this);  
	   b.display();  
	  }  
	  public static void main(String args[]){  
		  PassArgInConstructorMain a=new PassArgInConstructorMain();  
	  }  
}
