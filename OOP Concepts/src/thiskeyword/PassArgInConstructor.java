package thiskeyword;
//this: to pass as argument in the constructor call
public class PassArgInConstructor {  
	PassArgInConstructorMain obj;  
	PassArgInConstructor(PassArgInConstructorMain obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
}
