package exercise.java;

public class HRMngmntMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRMngmnt h=new HRMngmnt();
		h.employee(147777,"Anu", null, 2, 40000, 10, 12, "Average");
		h.display();
		h.newJoineeList();
		h.salaryIncr();
		h.salaryDecr();
		h.performanceRating();
		

	}

}
