package search.elements;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"orange","apple","banana","grapes","mango"};
		
		for(String item:arr) {
			if(item.contains("grapes")) {
				System.out.println("Array contain grapes");
			}
		}
	}

	

}
