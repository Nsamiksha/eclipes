package algorith;

import java.util.Arrays;

import Utility.util;

public class BinarySearchString {
public static void main(String[] args) { 
		
		System.out.println("Enter the size of array");
		int a =util.printint();
		String[] arr = new String[a];

		System.out.println("Enter the elements of array for sorting");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = util.printstring();
		}

		System.out.println("Enter the element for search");
		String x = util.printstring();

		Arrays.sort(arr);

		int result = util.binarySearchString(arr, x);
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 


}
