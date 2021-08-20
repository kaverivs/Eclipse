package object.initialization;

public class ByMethodClass {
	int length;
	int breadth;
	int area;
	
	void rectangle(int l,int b){
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
