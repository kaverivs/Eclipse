package object.initialization;

public class ByConstructorClass {
	
	int length;
	int breadth;
	int area;
	
	ByConstructorClass(int l,int b) {
		// TODO Auto-generated constructor stub
		length=l;
		breadth=b;
		area=l*b;
	}
	void display(){
		System.out.println("length : "+length);
		System.out.println("breadth: "+breadth);
		System.out.println("Area of rectangle :"+area);
	}

}
