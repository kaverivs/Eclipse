package exception.parent.overriding;

public class Child {
	static class TestExceptionChild3 extends Parent{  
		  void msg()throws Exception{System.out.println("child");}  
		  
		  public static void main(String args[]){  
		   Parent p=new TestExceptionChild3();  
		   try{  
		   p.msg();  
		   }catch(Exception e){}  
		  }  
	}
	
}
