package thiskeyword;

public class PassArgInMethod {
	void m(PassArgInMethod obj){  
		System.out.println("method is invoked");  
	}  
	void p(){  
		m(this);  
	}  
	public static void main(String args[]){  
		PassArgInMethod s1 = new PassArgInMethod();  
		s1.p();  
	}  
		  

}
