package exercise.week1;

public class OurChoice_Celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurChoice_Celcius obj1=new OurChoice_Celcius();
		obj1.FarenheitToCelcius();
		obj1.KelvinToCelcious();
	}

	private void FarenheitToCelcius() {
		// TODO Auto-generated method stub
		double tempf = 96d;
		double tempc =((tempf-32)*5)/9;
		System.out.println("\nTempF = "+tempf+"\nTempC = "+tempc);
	}

	private void KelvinToCelcious() {
		// TODO Auto-generated method stub
		double tempk = 327.56f;
		double tempc= tempk-273.15;
		System.out.println("\nTempK = "+tempk+"\nTempC = "+tempc);	
	}

}
