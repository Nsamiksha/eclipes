package algorith;

import Utility.util;

public class Vending {
	public static void main (String args[]) {
	  System.out.println("Enter the no. of amount remains as change");
	  int n = util.printint();
	  System.out.println("The return amount is distributed as");
	  Rupees(n);
	 
	}
	public static void Rupees(int n)
	{
	  try
	{
	 
	  int[] notes= new int[]{1,2,5,10,50,100,500,1000};
	  int[] notecounter=new int[8];
	  for(int i =7; i>=0;i--)
	{ 
	  if(n>= notes[i])
	 {
	  notecounter[i]= n/notes[i];
	  n = n-notecounter[i]*notes[i];
	  
	 }
	}
	 for(int i =7; i>=0;i--)
	{ 
	  if(notecounter[i]!=0)
	 {
	  System.out.println(notes[i] + " :: "
	                    + notecounter[i]);
	  
	 }
	}
	}
	catch(Exception e)
	{
	  System.out.println("Exception : " + e);
	}
	}
	}

