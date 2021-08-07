
package exercise.week2.project;

abstract class LoginCheck extends Display implements CourseTrainee{
	
//check whether the login credentials are already registered or not

	int res;
	TraineeOld t=new TraineeOld();
	
	@Override
	public int emailChecker() {		
		if(((LoginDisplay.e).equals(t.getEmail()))) {
			res=pswdChecker();
			if(res==1) {
				return 1;
			}
			else {
				return 2;
			}
		}
		else {
			return 0;
		}
	}	
	
	private int pswdChecker() {
		// TODO Auto-generated method stub
		if(((LoginDisplay.psw).equals(t.getPswd()))) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
