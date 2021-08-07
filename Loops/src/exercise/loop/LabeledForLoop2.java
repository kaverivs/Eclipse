package exercise.loop;

public class LabeledForLoop2 {
	public static void main(String[] args) {  
	    aa:  
	        for(int i=1;i<=3;i++){  
	            bb:  
	                for(int j=1;j<=3;j++){  
	                    if(i==2&&j==2){  
	                        break bb;  //If you use break bb;, it will break inner loop only which is the default behavior of any loop.
	                    }  
	                    System.out.println(i+" "+j);  
	                }  
	        }  
	}  
}
