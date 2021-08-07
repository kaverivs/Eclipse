package exercise.week2.project;

public class TraineeOldDisplay extends LoginCheck {
	
	// display all details
	public void display() {
		
		TraineeOld t= new TraineeOld();
		int result=emailChecker();
		if(result==1) {
			System.out.println("--------------------------------HOME PAGE---------------------------------------------");
			System.out.println("\nHI "+t.getName().toUpperCase()+" !!!");
			System.out.println("\n**Welcome to My eLearning App**");
			System.out.println("\nTake the next step in your career with a world class learning experience");	
			
			
			System.out.println("\n------------------------------MY PROFILE------------------------------------------------\n");
			System.out.println("Name :" +t.getName()+"\nAge : " +t.getAge() + "\nEmail id : " +t.getEmail() + "\nContact No. : " 
			+t.getContactNo() + "\nStatus : "+ t.getStatus() + "\nMotive : " + t.getMotive());
			
			
			System.out.println("\n------------------------------ACTIVE COURSE---------------------------------------------\n");
			System.out.println("Course name : " + t.getCourseName() + "\nCourse fee : " + t.getCourseFee() + 
					"\nCourse duration : "+t.getDuration()+ "\nSession per week : "+t.getWeekly()+"\nDiscount : "+t.getDiscount()+"\nFinal fee : "
							+ ""+t.getFinalFee()+"\nJoined Date : "+t.getDate()+"\nCurrent Learning status:"+t.getLearningStatus()+" days\n" );
			
			
			System.out.println("\n------------------------------THE COURSES YOU WATCHED-----------------------------------\n");
			System.out.println("1. "+t.getHistory()[0]+"\n2. "+t.getHistory()[1]+"\n3. "+t.getHistory()[2]+"\n");
			
			
			System.out.println("\n------------------------------SAVED COURSES---------------------------------------------\n");
			System.out.println("1. "+t.getSaved()[0]+"\n2. "+t.getSaved()[1]+"\n3 ."+t.getSaved()[2]);
			
			Display d= new TraineeOldDisplay();
			d.end();
		}
		else if(result==2){
			System.out.println("\nInvalid credential. Please try again!!!\n");
			Display d=new LoginDisplay();
			d.display();
		} 
		else{
			Display d=new CourseDisplay();
			d.display();
		}
	}

}
