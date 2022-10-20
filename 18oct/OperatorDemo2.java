/*
Program: To understand Operator
@author: Shuruti Singhal
@Date: 18 oct 2022  
*/

//import packages 

import java.util.Scanner;
class OperatorDemo2
	{
		//main method started
		public static void main(String args[])
		{
		//declaring input
		int num1=92;
		int d=6;
		
		//taking input
		System.out.println("Quotient= " +num1/d);
		System.out.println("Remainder= " +num1%d);
		System.out.println(num1>92);
		
		 //a=3  : n output assigning the value to the variable a : 
		//a==3 : compare the value of a to 3 : true / false

		// a!=3
	 
	 int x=8, y=7;
	 System.out.println("AND:"+ (x&y));
	 System.out.println("OR:"+ (x|y));
	 System.out.println("NOT:"+ (~x));
	 System.out.println("XOR:"+ (x^y));
	 
	  boolean status;
	 System.out.println(status= (true&&false));

	System.out.println( (x>=6)||(y>=12));

	System.out.println(20<<2);// left shift(20 *(2^3)) 
	System.out.println(20>>3);// right shift(20/ (2^3))
	
	}//end of main method
	
}//end of class