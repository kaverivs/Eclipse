package thiskeyword;

public class RealUsageStudent4 {
	int rollno;  
	String name,course;  
	float fee;  
	RealUsageStudent4(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	RealUsageStudent4(int rollno,String name,String course,float fee){ 		  
		this.fee=fee; 
		this(rollno,name,course);//reusing constructor
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);
		}  

}
