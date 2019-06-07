package algorith;

import Utility.util;

public class BubbleSortString {
	
	    public static void main(String[] args) {
	    	System.out.println("enter the size of array");
	    	int num = util.printint();
	    	System.out.println("enter the elements of array");
	        String[] list= util.printstringarray(num);
	       String[] array = util.BubbleSortString(list);
	        for(int i=0; i<array.length; i++) {

	            System.out.println(array[i]);
		        }
	    }
	
	   
}


