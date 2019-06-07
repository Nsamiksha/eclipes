package algorith;

import Utility.util;

public class Test {
	
	    public static void main(String [] args) {

	    	 String[] array1 = util.WordFileReading();
	    	 System.out.println("enter the word to search from the list");
	    	 String s1 = util.printstring();
	    	 
	    	 int result = util.binarySearchStringFile(array1, s1);
	 		if (result == -1) 
	 			System.out.println("Element not present"); 
	 		else
	 			System.out.println("Element found at index " + result); 
	}


}
