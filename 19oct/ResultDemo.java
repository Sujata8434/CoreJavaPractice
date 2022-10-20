//WAP to calculate the percentage of a given student marks from subjects


//Program: To understand Ifelse
//@author : Sujata Kumari
//@Date :19 oct 2022 
//impoting package
import java.util.Scanner;
//creating a class
public class ResultDemo
{
	//main method started
   public static void main(String args[])
   {
	   //creating an object of scanner class
       Scanner sc= new Scanner(System.in);
	   //taking input
       System.out.println("Enter the number of subject Hindi");
       float Hindi= sc.nextFloat();
		
       System.out.println("Enter the number of subject  English");
       float  English= sc.nextFloat();

       System.out.println("Enter the number of subject  Maths");
       float  Maths= sc.nextFloat();
	   
       float percentage= ((Hindi + English + Maths)/300.0f)*100;
       System.out.println("Percentage=" +percentage);

	if(percentage>=40)
	{
	System.out.println("Congratulations you have clear your exam");
	}
	else
	{
	System.out.println("Sorry! You have Fialed");
	}//end of if-else condition
   
   }//end of main 
   
}//end of class
