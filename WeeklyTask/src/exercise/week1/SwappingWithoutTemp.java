package exercise.week1;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30, b=15;
		System.out.println("\nBEFOR SWAPPING - a:"+a+", b:"+b);
		
	/* Add first variable with second and store it in first. 
	*  Then subtract second variable from first and store output in second.
	*  And finally subtract first variable from second and store the result in first
	*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\nAFTER SWAPPING - a:"+a+", b:"+b);
	}

}
