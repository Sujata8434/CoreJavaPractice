//Program: To understand input using scaneer
//@author : Sujata Kumari
//@Date :14 oct 2022 

import java.util.Scanner; //import the scanner class

	//creating a class
	class AverageDemo2
	{
			//main method
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in); //create a scanner object
			
			// declaring and initializing local variables	
			System.out.println("Enter number1");
			float number1= sc.nextFloat();
			
			System.out.println("Enter number2");
			float number2= sc.nextFloat();
			
			System.out.println("Enter number3");
			float number3= sc.nextFloat();
			
			float sum= number1+number2+number3;
			float average= sum/3;
			System.out.println("Average of three number is: "+ average);


	} // end of main method
} // end of class AverageDemo2