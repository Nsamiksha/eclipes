package algorith;

import Utility.util;

public class BubbleSort {

	public static void main(String[] args)  {
		
		System.out.println("Enter the size of array");

		int a = util.printint();
		int[] arr = new int[a];

		System.out.println("Enter the elements of array for sorting");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = util.printint();
		}
		
		int[] sort = new int[a];
		sort = util.bubblesort(arr);
		System.out.println("BUBBLE SORTING");
		System.out.print("[");
		for(int i = 0; i<sort.length ; i++){
			System.out.print( sort[i] + "\t");  
		}
		System.out.print("]");
		System.out.println();	


	}


}




