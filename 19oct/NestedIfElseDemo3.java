
//Program: To find person can donate blood or not
//@author : Sujata Kumari
//@Date :19 oct 2022 
//impoting package
import java.util.Scanner;
//creating class
public class NestedIfElseDemo3
{
	//main method started
   public static void main(String args[])
   {
	   //creating an object of scanner class
       Scanner sc= new Scanner(System.in);
	   //declaring veriables
	   int age;
	   float weight;
	   char gender;
	   //taking input
       System.out.println("Enter your age");
       age= sc.nextInt();

       
//using if else
	if(age>=18)
	{
			System.out.println("Enter your gender :(m/f)");
			gender= sc.next().charAt(0);
			
			System.out.println("Enter your weight");
			weight= sc.nextFloat();
			
			if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
			
				
			System.out.println("You can donate blood...");
			else	
			 System.out.println("You are under weight! please start having healthy diet...");
			
		
	}//end of if condition
			else
			System.out.println("You are too young to donate blood...");
			
	
   }//end of main 
}//end of class
