package exercise.week2.project;

abstract class Display {

	
	abstract void display();

	//For those who are already registered
	void end() {
		System.out.println("\n\nYour new Session is uploaded.\nPlease watch and enhance your knowledge!!!");
	}
	
	//for new trainees
	void newReg() {
		
		System.out.println("\nYour learning portal is open now.");
		System.out.println("\nDon't wait for tomorrow...Get up and Get it done today itself!!!\n");
	}
}
