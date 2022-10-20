//Program: To calcuate average of three numbers using command line argument
//@author : Sujata Kumari
//@Date :14 oct 2022 


//creating a class
class AverageDemo
	{
		//main method
		public static void main(String args[])
			{
				//declaring local variable
				 float number1= Float.parseFloat(args[0]);
				 float number2= Float.parseFloat(args[1]);
				 float number3= Float.parseFloat(args[2]);
				 
				 //calculating the average of three number
				 float average=number1+number2+number3/3;
				 System.out.println("Average of three numbers is: "+average);
				 
	} // end of main method
} // end of class AverageDemo