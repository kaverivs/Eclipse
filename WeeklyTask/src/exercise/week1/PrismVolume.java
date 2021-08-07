package exercise.week1;

public class PrismVolume {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrismVolume obj= new PrismVolume();
		obj.baseArea();
	}

	private void baseArea() {
		// TODO Auto-generated method stub
		double a=2, b=4, h=6;
		System.out.println("\na = "+a+"\nb = "+b+"\nh = "+h);
		double volume=(a*b*h)/2;	
		System.out.println("\nVolume of Prism : "+volume);
	}
}
