package exercise.week1;

public class QuotientReminder {
	private int a=113, b=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuotientReminder obj=new QuotientReminder();
		obj.quotient();
		obj.reminder();
	}

	private void reminder() {
		// TODO Auto-generated method stub
		int rem=a%b;
		System.out.println("Reminder = "+rem);
	}

	private void quotient() {
		// TODO Auto-generated method stub
		int quotient = a/b;
		System.out.println("Quotient = "+quotient);
	}

}
