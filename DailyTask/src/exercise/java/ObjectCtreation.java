package exercise.java;

public class ObjectCtreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectNew obj= new ObjectNew();
		String n=obj.name="Anu";
		int a=obj.age=8;
		System.out.println(a);
		if(a>=0 && a<120) {
			if(a<18) {
				System.out.println(n+" is not eligible for vote");
			}
			else {
				System.out.println(n+" is eligible for vote");
			}
			}
			else {
				System.out.println("Please enter a valid age");
			}
	}

}


 class ObjectNew{
	 
	 String name ;
	 int age;
	
}