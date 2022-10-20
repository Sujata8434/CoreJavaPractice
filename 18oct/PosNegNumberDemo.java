//WAP to check a number is possitive or negative


//Program: To understand Ifelse
//@author : Sujata Kumari
//@Date :18 oct 2022 

import java.util.Scanner;
class PosNegNumberDemo
{
public static void main(String args[])
{
//declaring the object of scanner 
Scanner sc= new Scanner(System.in);

//taking input
System.out.println("Please enter any number:");
int number= sc.nextInt();


//using ifelse for calculating age and comparing
if(number>=0)
{
System.out.println("This number is possitive.. ");

}
else
System.out.println("This number is negative ");
 }//end of main 
} // end of class