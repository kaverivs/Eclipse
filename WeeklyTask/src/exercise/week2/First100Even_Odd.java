package exercise.week2;

public class First100Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First100Even_Odd d=new First100Even_Odd();
		d.evenDisplay();
		d.oddDisplay();
		
	}
	
	public void evenDisplay(){
		System.out.println("\nEven numbers\n");
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}
	}
	
	private void oddDisplay() {
		// TODO Auto-generated method stub
		System.out.println("\n\nOdd numbers\n");
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.print(" "+i);
			}	
		}
	}
}
