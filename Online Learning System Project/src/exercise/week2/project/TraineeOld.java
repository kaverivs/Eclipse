package exercise.week2.project;


public class TraineeOld  {
	
//personal details
	private String name="Jane";
	private int age=32;
	private String email="jane@gmail.com";
	private String pswd="jane123";
	private String contactNo="9623239907";
	private String status="Working";
	private String motive="To amplify my career growth";
	
//current course details
	private String courseName="Data Science";	
	private int duration=90;
	private double courseFee=50000;
	private int weekly=9;
	private int discount=20;
	private String date="21/05/2021";
	private int daysCompleted=58;
	private double finalFee=40000;
	private int learningStatus=(duration-daysCompleted);	
	
//Saved courses & watched courses
	private String history[]= {"SQL Database/Coding","Data Science Fundementals with Python and SQL","Introduction to Data Science"};
	private String saved[]= {"Applied Data Science with python ","Artificial Intelligence and machine learning","Practical Data Science"};
	
	
//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getPswd() {
		return pswd;
	}
	public String getContactNo() {
		return contactNo;
	}
	public String getStatus() {
		return status;
	}
	public String getMotive() {
		return motive;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getDuration() {
		return duration;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public int getWeekly() {
		return weekly;
	}
	public int getDiscount() {
		return discount;
	}
	public String getDate() {
		return date;
	}
	public int getDaysCompleted() {
		return daysCompleted;
	}
	public double getFinalFee() {
		return finalFee;
	}
	public int getLearningStatus() {
		return learningStatus;
	}
	public String[] getHistory() {
		return history;
	}
	public String[] getSaved() {
		return saved;
	}
	

//default constructor
	public TraineeOld() {
		super();
	}
}
 