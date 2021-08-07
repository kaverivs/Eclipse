package search.elements;

import java.util.Scanner;

public class NumberSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {23,3,78,39,10};
		int item, location = -1;  
	    
	    int arr[]=new int [5];
	    for(int i=0;i<5;i++)  
	    {  
	    	for (int j = 0; j <5-i-1; j++) 
	        {  
	        	if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } 
	        }  
	    }  
	    System.out.println("Printing Sorted List ...");  
	    for(int i=0;i<5;i++)  
	    {  
	    	
	    	arr[i]=array[i];
	        System.out.println(arr[i]);  
	    }  
	    
	    
	    System.out.println("Enter the item which you want to search");  
	    Scanner sc = new Scanner(System.in);  
	    item = sc.nextInt(); 
	    location = binarySearch(arr,0,5,item);  
	    if(location != -1)  
	    System.out.println("the location of the item is "+location);  
	    else   
	        System.out.println("Item not found");  
	    }  
	



	public static int binarySearch(int[] a, int beg, int end, int item)  
	{  
	    int mid;  
	    if(end >= beg)   
	    {     
	        mid = (beg + end)/2;  
	        if(a[mid] == item)  
	        {  
	            return mid+1;  
	        }  
	        else if(a[mid] < item)   
	        {  
	            return binarySearch(a,mid+1,end,item);  
	        }  
	        else   
	        {  
	            return binarySearch(a,beg,mid-1,item);  
	        }  
	      
	    }  
	    return -1;   
	}  

}
