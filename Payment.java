package algorith;

import Utility.util;

public class Payment {

	public static void main(String[] args) {
	
		 System.out.println("enter the amount of principal ");
		 int p = util.printint();
		 System.out.println("enter the number of year");
		 int y = util.printint();
		 System.out.println("enter the rate ");
		 double r = util.printdouble();
		 double payment = util.monthlypayment(p,y,r);
		 System.out.println("monthly payment to pay ");
		 System.out.println(payment + " Rs");
		
	}

}
