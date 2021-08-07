package exercise.week1;

public class LargestAmong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestAmong3 obj=new LargestAmong3();
		obj.largest();
	}

	private void largest() {
		// TODO Auto-generated method stub
		short a=49,b=98,c=24;
		System.out.println("\na="+a+"\nb="+b+"\nc="+c+"\n");
		if (a>b) {
			if(a>c) {
				System.out.println(a+" is largest");
			}
			else {
				System.out.println(c+" is largest");
			}
		}
		else {
			System.out.println(b+" is largest");
		}
		
	}

}
