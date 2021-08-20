package thiskeyword;

//this() : to invoke current class constructor
//Calling default constructor from parameterized constructor:
public class InvokeConstructor {		
	InvokeConstructor(){
		System.out.println("hello a");
		}  
	InvokeConstructor(int x){  
	this();  
	System.out.println(x);  
	}  
}
