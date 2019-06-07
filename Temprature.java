package algorith;

import Utility.util;

public class Temprature {
	public static void main(String[] arg) {
		
	
	  System.out.println("Enter the numerber to choose conversion ");
	  System.out.println("1.fahrenheit to Celsius ");
	  System.out.println("2.Celsius to fahrenheit ");
	  int option = util.printint();
	  System.out.println("enter the value of temprature ");
	  int temp = util.printint();
	  if(option==1) {
		  double fah = util.fahrenheit(temp);
		  System.out.println("temprature in Celsius");
		  System.out.println(fah + "°C ");
	  }
	  if(option==2) {
		  double cel = util.Celsius(temp);
		  System.out.println("temprature in fahrenheit");
		  System.out.println(cel + "°F ");
	  }
}
}