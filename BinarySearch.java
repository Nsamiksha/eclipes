package algorith;

import java.util.Arrays;

import Utility.util;

public class BinarySearch {
	
	public static void main(String[] args) { 
		
		System.out.println("Enter the size of array");
		int a =util.printint();
		int[] arr = new int[a];

		System.out.println("Enter the elements of array for sorting");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = util.printint();
		}

		System.out.println("Enter the element for search");
		int x = util.printint();

		Arrays.sort(arr);

		int result = util.binarySearch(arr, 0, a-1, x);
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 

}
