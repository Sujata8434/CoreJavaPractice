//WAP to calculate the percentage of a given student ,this marks from 5 subjects must be
//taken as input from keyboard(marks are out of 100)

//Program: To understand input using scaneer
//@author : Sujata Kumari
//@Date :14 oct 2022 
//import packages
import java.util.Scanner;
//creating a class
public class CalculatorDemo
{
	//main method started
   public static void main(String args[])
   {
	   //creating an object of scanner class
       Scanner sc= new Scanner(System.in);
	   //taking input from usre
       System.out.println("Enter the number of subject Hindi");
       float Hindi= sc.nextFloat();

       System.out.println("Enter the number of subject  English");
       float  English= sc.nextFloat();

       System.out.println("Enter the number of subject  Maths");
       float  Maths= sc.nextFloat();

       System.out.println("Enter the number of subject Science");
       float Science= sc.nextFloat();

       System.out.println("Enter the number of subject Computer");
       float Computer= sc.nextFloat();
		//calculating percentage 
       float percentage= ((Hindi + English + Maths + Science + Computer)/500.0f)*100;
       System.out.println("Percentage=" +percentage);

   }//end of main method 
}//end of class
