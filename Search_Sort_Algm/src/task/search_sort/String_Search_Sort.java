package task.search_sort;

public class String_Search_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"orange","apple","banana","grapes","mango"};
		System.out.println("\nBefore sorting...\n");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
	    String_Search_Sort obj=new String_Search_Sort();
	    obj.sort(arr);
	    obj.Search(arr);
	}

	private String [] sort(String [] array)
	{
		int length=array.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {				
				if (array[i].compareTo(array[i+1])>0)
                {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } 
			}
			
		}
		System.out.println("\nPrinting Sorted List ...\n");  
	    for(int i=0;i<5;i++)  
	    {  
	    	
	    	array[i]=array[i];
	        System.out.println(array[i]);  
	    }
		return array; 
	}
	
	private void Search(String[] array) {
		int length=array.length;
		for(int i=0;i<length;i++) {
			if(array[i]=="grapes") {
				System.out.println("\nArray contain grapes at index "+i);
				System.out.println("Array contain grapes at length "+(i+1));
			}
		}
	}

}