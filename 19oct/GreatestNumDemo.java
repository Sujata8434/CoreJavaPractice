//WAP to check the year is leap year or not


//Program: WAP to print the grade according to the percentage
//@author : Sujata Kumari
//@Date :19 oct 2022 

import java.util.Scanner;
class GreatestNumDemo
{
public static void main(String args[])
{
//declaring the object of scanner 
Scanner sc= new Scanner(System.in);

	//taking input
	System.out.println("Pleas enter 1st Number:");
	int number1= sc.nextInt();
	System.out.println("Pleas enter 2nd Number:");
	int number2= sc.nextInt();
	System.out.println("Pleas enter 3rd Number:");
	int number3= sc.nextInt();


	//using ifelse for calculating year is leap or not
		if(number1>number2&& number1>number3)
			System.out.println("Number1 is greater");
				else if(number2>number1&& number2>number3)
					System.out.println("Number2 is greater");
						
			else
				System.out.println("Number3 is greater ");
 }//end of main 
} // end of class