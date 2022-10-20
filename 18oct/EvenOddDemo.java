//WAP to check a number is even or odd


//Program: To understand Ifelse
//@author : Sujata Kumari
//@Date :18 oct 2022 

import java.util.Scanner;
class EvenOddDemo
{
public static void main(String args[])
{
//declaring the object of scanner 
Scanner sc= new Scanner(System.in);

//taking input
System.out.println("Please enter any number:");
int number= sc.nextInt();


//using ifelse for calculating age and comparing
if(number%2==0)
{
System.out.println("Number is Even ");

}
else
System.out.println("Number is Odd ");
 }//end of main 
} // end of class