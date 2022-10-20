/*
Program: WAP to print the remarks according to grade
@author: Sujata kumari
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class SwitchDemo2
{
	// method to print the remarks
	static void printRemarks(char gr) // formal/dummy arguments
	{	

	   //switch case
	   switch(gr)
	   {
		   case 'A':System.out.println("Excellent performance");
		          break;
		   case 'B':System.out.println("Very good....");
		          break;
		   case 'C':System.out.println("Good....you can do better");
		          break;
		   case 'D':System.out.println("Fair.....you need to do work hard");
		          break;
		   case 'F':System.out.println("Fail.. Work hard next time");
		          break;
		  default: System.out.println("You have entered wrong input");

	   }
	   
	}
		// main method started 
		public static void main(String args[])	
		{
			//declaring the object of scanner
			Scanner sc= new Scanner(System.in);
			
			char grade;
			System.out.println("Enter the grade");
			grade= sc.next().charAt(0);
			//calling method to print day
			printRemarks(grade);
			
		}//end of main method
}//end of SwitchDemo2
			
