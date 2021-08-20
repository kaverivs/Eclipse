package thiskeyword;

//calling parametrized constructor from default constructor
public class InvokeParamConstructor {
	InvokeParamConstructor(){  
		this(5);  
		System.out.println("hello a");  
		}  
	InvokeParamConstructor(int x){  
		System.out.println(x);  
		}  
		

}
