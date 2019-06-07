package algorith;

import Utility.util;

public class BinarySwap {
	
	public static void main(String[] args) 
    {	String nibble1 = "";
    	String nibble2 = "";
    	String temp = "";
    	String nibble3 = "";
        String binary = util.tobinarybyte();
        System.out.println("Decimal to Binary convertion is :" + binary);
        for(int i = 0;i<4;i++) {
        	char c = binary.charAt(i);
        	nibble1 = nibble1 + c + "" ;
        }
       // System.out.println(nibble1);
        for(int i = 4; i<8 ;i++) {
        	char d = binary.charAt(i);
        	nibble2 = nibble2 + d + "" ;
        }
        
      //  System.out.println(nibble2);
        temp=nibble1;
        nibble1=nibble2;
        nibble2=temp;
        //System.out.println(nibble1);
        //System.out.println(nibble2);
        nibble3= nibble3 + nibble1 + nibble2 ;
        System.out.println("Nibble Swaping : " + nibble3);
        int decimal = util.todecimal(nibble3);
        System.out.println("After Swaping convertion is :" + decimal);
        util.isPowerOfTwo(decimal);
}
}
