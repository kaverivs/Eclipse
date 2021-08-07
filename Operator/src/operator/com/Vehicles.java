package operator.com;

public class Vehicles {

}
class Cars extends Vehicles{
	public static void main(String args[]) {
		Vehicles a= new Cars();
		boolean result = a instanceof Cars;
		System.out.println(result);
	}
}
