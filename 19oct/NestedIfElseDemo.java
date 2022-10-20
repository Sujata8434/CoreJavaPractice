
//Program: To find person can donate blood or not according to their age and weight
//@author : Sujata Kumari
//@Date :19 oct 2022 

//impoting package
import java.util.Scanner;
//creating a class
public class NestedIfElseDemo
{
	//main method started
   public static void main(String args[])
   {
	   //creating an object of scanner class
       Scanner sc= new Scanner(System.in);
	   //declaring variable
	   int age;
	   float weight;
	   //taking input
       System.out.println("Enter your age");
       age= sc.nextInt();

       
//using ifelse 
	if(age>=18)
	{
	System.out.println("Enter your weight");
       weight= sc.nextFloat();
	
		if(weight>=50)//comparing
		
		System.out.println("You can donate blood...");
		
	else
	
	System.out.println("You are under weight! please start having healthy diet...");
	}
	else
	{
	System.out.println("You are too young to donate blood...");
	}
	
   }//end of main method
}//end of class NestedIfElseDemo
