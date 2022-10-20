//WAP to check the year is leap year or not


//Program: To understand Ifelse
//@author : Sujata Kumari
//@Date :19 oct 2022 

import java.util.Scanner;
class LeapYearDemo
{
public static void main(String args[])
{
//declaring the object of scanner 
Scanner sc= new Scanner(System.in);

//taking input
System.out.println("Please enter any year:");
int year= sc.nextInt();


//using ifelse for calculating year is leap or not
	if(year%400==0)
		System.out.println("Leap year ");
			else if(year%100==0)
				System.out.println("Leap year ");
					else if(year%4==0)
							System.out.println("Leap year ");
		else
			System.out.println("Is not a leap year ");
 }//end of main 
} // end of class