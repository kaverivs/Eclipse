package exercise.java;

public class HRMngmnt {
	
	int empId;
	String empName;
	String account;
	int experience;
	double salary;
	int totalLeave;
	int leaveTaken;
	String performance;
	double salary1;
	
	void employee(int id,String n,String acc,int exp, double sal,int leave,int l,String perf) {
		empId=id;
		empName=n;
		account=acc;
		experience=exp;
		salary=sal;
		totalLeave=leave;
		leaveTaken=l;
		performance=perf;
	}
	
	void display() {
		System.out.println("\n------EMPLOYEE DETAILS-----\n");
		System.out.println("Employee id :"+	empId);
		System.out.println("Employee name :"+empName);
		System.out.println("Account name :"+account);
		System.out.println("Experience :"+experience);
		System.out.println("Salary :"+salary);
		System.out.println("Total leave :"+totalLeave);
		System.out.println("No. of leave taken :"+leaveTaken);
		System.out.println("Performance :"+performance);
	}
	void newJoineeList() {
		System.out.println("\n");
		if(experience==0) {
			System.out.println("Employee status :New Employee");
		}
		else {
			System.out.println("Employee status : Old Employee");
		}
	}
	
	
	void salaryIncr() {
		System.out.println("\n");
		salary1=salary+experience*4000;
		double s=salary1-salary;
		System.out.println("Incremented amount :"+s);
		System.out.println("Current salary : "+salary1);
		System.out.println("\n");
	}
	
	void salaryDecr() {
		//System.out.println("Current salary :" +salary1);
		if(leaveTaken>totalLeave) {
			salary1 =salary-(leaveTaken-totalLeave)*200;
			double s= salary-salary1;
			System.out.println("Salary deducted per leave :"+s);
			System.out.println("Final Salary :"+salary1);
		}
		else {
			System.out.println("No salary decremented : "+salary);
		}
	}
	
	void performanceRating() {
		System.out.println("\n");
		if(performance=="Average") {
			System.out.println("Employee performance rating : 3 star");
		}
		else if(performance=="Above average") {
			System.out.println("Employee performance rating : 4 star");
		}
		else if(performance =="Excellant") {
			System.out.println("Employee performance rating : 5 star ");
		}
		else if(performance =="Below average") {
			System.out.println("Employee performance rating : 2 star");
		}
		else if(performance =="Poor") {
			System.out.println("Employee performance rating : 1 star ");
		}
		else {
			System.out.println("Error came in calculating performance ");
		}
	}
	
	
}
	


