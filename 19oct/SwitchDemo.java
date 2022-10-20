/*
Program: WAP to print the day
@author: Sujata kumari
@Date: 19 oct 2022  
*/


import java.util.Scanner;
//declaring a class
class SwitchDemo
{
	// method to print the day
	static void printDay(int d) // formal/dummy arguments
	{	

	   //switch case
	   switch(d)
	   {
		   case 1:System.out.println("Monday");
		          break;
		   case 2:System.out.println("Tuesday");
		          break;
		   case 3:System.out.println("Wednesday");
		          break;
		   case 4:System.out.println("Thursday");
		          break;
		   case 5:System.out.println("Friday");
		          break;
		  case 6:System.out.println("Saturday");
		          break;
		  case 7:System.out.println("Sunday");
		          break;
		  default: System.out.println("You have entered wrong input");

	   }//end of switch case
	   
	}//end of method printDay

		public static void main(String args[])	
		{
			//declaring the object of scanner
			Scanner sc= new Scanner(System.in);
			
			int day;
			System.out.println("Enter the number of day");
			day= sc.nextInt();
			//calling method to print day
			printDay(day);

		}//end of main method
}//end of SwitchDemo	
