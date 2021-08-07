package exercise.week1;

public class OurChoice_TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String light="Red";
		
		switch(light) {
			case "Green":
				System.out.println("GO ON");	
				break;
			case "Yellow":
				System.out.println("SLOW DOWN / CAUTION");	
				break;
			case "Red":
				System.out.println("STOP");	
				break;
			case "No traffic light":
				System.out.println("CHECK THE ROAD AND PROCEED WITH CAUTION");
				break;
			default:
				System.out.println("Please enter a valid colour.");
		}
		
	}

}
