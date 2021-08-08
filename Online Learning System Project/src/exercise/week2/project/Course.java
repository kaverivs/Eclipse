package exercise.week2.project;

public class Course {
	
	//instance variable
	private String course;
	private int duration;
	private int discount;
	private double amnt;
	private double finalFee;
	private int weekly;
	
	
	//Getters and Setters
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getAmnt() {
		return amnt;
	}
	public void setAmnt(double amnt) {
		this.amnt = amnt;
	}

	public double getFinalFee() {
		return finalFee;
	}

	public void setFinalFee(double finalFee) {
		this.finalFee = finalFee;
	}
	public int getWeekly() {
		return weekly;
	}

	public void setWeekly(int weekly) {
		this.weekly = weekly;
	}
	
	
//Default constructor
	public Course() {
		super();
	}
	

//toString function to return the values
	@Override
	public String toString() {
		return "Course name : "+course+"\nCourse duration : "+duration+""
				+ " days\nSession per week : "+weekly+" hours\nCourse Fee : "+amnt+"\nDiscount : "+discount+
				"%\nFinal course fee : "+finalFee+" (after discount)";
	}

	
	
	
		
}
	


