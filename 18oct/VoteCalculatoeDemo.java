//WAP to calculate a person can vote or not using age limitation
//Program: To understand Ifelse
//@author : Sujata Kumari
//@Date :18 oct 2022 

import java.util.Scanner;
class VoteCalculatoeDemo
{
public static void main(String args[])
{
//declaring the object of scanner 
Scanner sc= new Scanner(System.in);

//taking input
System.out.println("Please enter youe age:");
int age= sc.nextInt();


//using ifelse for calculating age and comparing
if(age>=18)
{
System.out.println("You can vote.. ");

}
else
System.out.println("You are too young to vote...so you cannot vote ");
 }//end of main 
} // end of class