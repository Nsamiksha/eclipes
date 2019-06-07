package algorith;

import Utility.util;

public class Sqrt {
	
	public static void main(String[] arg) {
		
		
		System.out.println("enter the value to find out sqrt root ");
		       String num = util.printstring();
		        double c = Double.parseDouble(num);
		        double epsilon = 1.0e-15;  
		        double t = c;              

		   
		        while (Math.abs(t - c/t) > epsilon*t) {
		            t = (c/t + t) / 2.0;
		        }

		     
		        System.out.println(t);
		    }

		
		
		
		
	}

