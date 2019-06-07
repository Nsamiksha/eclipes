package algorith;

import Utility.util;
public class Palindrome {

	public static void main(String[] args) {
		
		//prime numbers from 1 to 1000
 		int[] sam = util.primenumbers();
		int i = 0;
		System.out.println("Prime numbers from 1 to 100 are :");
		for ( i = 0; i<sam.length; i++)   {
			System.out.print(sam[i] + " ");
		}
		
		// palindrome from prime numbers
		System.out.print("\n");
		int[] pal = util.palindrome(sam);
		System.out.println("Palindrome numbers from PRIME numbers are :");
		for (i = 0; pal[i]!=0; i++)   {
			System.out.print(pal[i] + " ");
		}
		//anagram from prime numbers
		System.out.println("\n");
		int[] ana = util.anagram(sam);
		System.out.println("Anagram numbers from PRIME numbers are :");
		for (i = 0; i< ana.length; i++)   {
			System.out.print(ana[i] + " ");
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	