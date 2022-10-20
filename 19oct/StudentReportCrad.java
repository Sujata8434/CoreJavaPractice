
/*
Program: WAP to print report card
@author: Sujata kumari
@Date: 19 oct 2022  
*/

//import packages 
import java.util.Scanner;
	//declaring a class
	class StudentReportCrad
	{
		static void calcPercentage(float m1,float m2, float m3)
		{
			float percentage;
			 //calculating percentage
			percentage= ((m1+m2+m3)/300)*100;
			
			//checking student has pass the exam or not
			
			// calling method using cal grade
			calcGrade(percentage);
		}
	//method to calculate grade
	static void calcGrade(float percentage)//formal /dummy arguments
	{
		char grade; 
     // checking percentage to cal grade
		if(percentage>=85)
	grade='A';
		else if(percentage>=75)
			grade='B';
			else if(percentage>=55)
				grade='C';
				else if(percentage>=40)
					grade='D';
					else 
						grade='F'; // assigning
					// end of ifelse
					
						if(grade=='F') // comparing
							System.out.println("Sorry you have not cleared your exam.... ");
						else
						System.out.println("You have claerd the exam with grade: "+grade);
						
						//calling method to calcGrade
						printRemarks(grade);
					}
				//end of method calcGrade

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

	   } // end of switch case
	} //end of printRemark
	
			//main started
			public static void main(String args[])
			{
			//dclaring the object of scanner
			Scanner sc= new Scanner(System.in);
			
			//declaring three variables to store the marks
			float marks1,marks2,marks3;
			//taking input
				System.out.println("Enter the marks of subject1:");
				marks1= sc.nextFloat();
				System.out.println("Enter the marks of subject2:");
				marks2= sc.nextFloat();
				System.out.println("Enter the marks of subject3:");
				marks3= sc.nextFloat();
				
				//calling method of calcPercentage
				calcPercentage(marks1,marks2,marks3);
				
	}
	}
	