

//Program: To understand static grading
//@author : Sujata Kumari
//@Date :19 oct 2022 

import java.util.Scanner;
class StaticGrading
{
	// method to calculate grade
	static void calcGrade(float percentage) // formal/dummy arguments
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
		System.out.println("Sorry you have failed in your exam.... Better luck next time");
	else
	System.out.println("You have claerd the exam with grade: "+grade);
	
	
   }
   //main method started
	public static void main(String args[])
   {
	   //dclearing the object of scanner
       Scanner sc= new Scanner(System.in);
	   //declaring variables
	   
	   float per;
	   
	   //Taking input
	   System.out.println(" Enter the percentage");
        per= sc.nextFloat();
	   
		// calling method
		calcGrade(per); //actual argument
   }//end of main 
} // end of class
