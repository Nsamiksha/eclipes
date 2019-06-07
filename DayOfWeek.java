package algorith;

import Utility.util;

public class DayOfWeek {
	
	
	
	public static void main(String arg[]) 
	{ 
	    System.out.print("Enter the Date "); 
	    int date = util.printint();
	    System.out.print("Enter the Month ");
	    int month=util.printint();
	    System.out.print("Enter the Year ");
	    int year = util.printint();
	    int day = util.dayofweek(date, month, year);
	   String dayString;
        switch (day) { 
        case 1: 
            dayString = "Monday"; 
            break; 
        case 2: 
            dayString = "Tuesday"; 
            break; 
        case 3: 
            dayString = "Wednesday"; 
            break; 
        case 4: 
            dayString = "Thursday"; 
            break; 
        case 5: 
            dayString = "Friday"; 
            break; 
        case 6: 
            dayString = "Saturday"; 
            break; 
        case 7: 
            dayString = "Sunday"; 
            break; 
        default: 
            dayString = "Invalid day"; 
            break; 
	} 
        System.out.println(dayString);
	}
}
	
	
	

