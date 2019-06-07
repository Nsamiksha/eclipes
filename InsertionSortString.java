package algorith;

import Utility.util;

public class InsertionSortString {
	
	public static void main(String[] args)  {

		System.out.println("Enter the size of string array");
		
		int a = util.printint();
		
		System.out.println("Enter the elements of string array for sorting");
		
		String[] arr = util.printstringarray(a);
		
		String[] insertion = util.InsertionSortString(arr);
	
		System.out.println("INSERTION SORT OF GIVEN NUMBERS");
		
		System.out.print("\n");
		System.out.print("[");
		for(int i = 0; i<insertion.length ; i++){
			System.out.print( insertion[i] + "\t");  
		}
		System.out.print("]");
		System.out.println();	
	}

}

