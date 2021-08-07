package exercise.week2.project;

public class Registration {

//Instance variable
	
	private int age;
	private String phn;	
	private String status;
	private String motive;
	
//Getters and Setters
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMotive() {
		return motive;
	}
	public void setMotive(String motive) {
		this.motive = motive;
	}
	
//parameterized constructor
	public Registration(int age, String phn, String status, String motive) {
		super();
		this.age = age;
		this.phn = phn;
		this.status = status;
		this.motive = motive;
	}
	
//Default constructor
	public Registration() {
		super();
	}
	
}
