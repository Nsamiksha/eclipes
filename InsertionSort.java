package algorith;

import Utility.util;

public class InsertionSort {

	public static void main(String[] args)  {

		System.out.println("Enter the size of array");
		int a = util.printint();
		System.out.println("Enter the elements of array for sorting");
		int[] arr = util.printIntarray(a);
		
		int[] insertion = util.InsertionSort(arr);
	
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








