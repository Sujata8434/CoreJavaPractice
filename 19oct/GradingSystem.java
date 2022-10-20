
//Program: To understand ladder ifelse
//@author : Sujata Kumari
//@Date :19 oct 2022 

import java.util.Scanner;
public class GradingSystem
{
   public static void main(String args[])
   {
       Scanner sc= new Scanner(System.in);
	   
	   float percentage;
	   char grade;
       System.out.println("percentage");
       percentage= sc.nextFloat();

       

	if(percentage>=85)
	grade='A';
		else if(percentage>=75)
			grade='B';
			else if(percentage>=55)
				grade='C';
				else if(percentage>=40)
					grade='D';
					else
						grade='F';
	if(grade=='F')
		System.out.println("Sorry you have failed in your exam.... Better luck next time");
	else
	System.out.println("You have claerd the exam with grade: "+grade);
	
	 }//end of main 
} // end of class