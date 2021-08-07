package exercise.week1;
import static java.lang.Math.*;
public class CylinderTotalSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CylinderTotalSurfaceArea obj= new CylinderTotalSurfaceArea();
		obj.totalSurfaceArea();
	}

	private void totalSurfaceArea() {
		// TODO Auto-generated method stub
		double r=4,h=3;
		System.out.println("\nRadius = "+r+"\nHeight = "+h);
		double area=(2*PI*r*r)+(2*PI*r*h);
		System.out.println("\nTotal surface area of Cylinder is "+area);
	}

}
