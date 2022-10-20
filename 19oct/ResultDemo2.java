
//Program: WAP to calculate the percentage of a given student marks from subjects using command line
//@author : Sujata Kumari
//@Date :19 oct 2022 


public class ResultDemo2
{
   public static void main(String args[])
   {
			//taking input
				float Hindi= Float.parseFloat(args[0]);
				float English= Float.parseFloat(args[1]);
				float Maths= Float.parseFloat(args[2]);
				
				//calculating percentage 
			   float percentage= ((Hindi + English + Maths)/300.0f)*100;
			   System.out.println("Percentage=" +percentage);
			   
				//checking student is pass or not
				if(percentage>=40)
				{
				System.out.println("Congratulations you are Pass");
				}
				else
				{
				System.out.println("Sorry You are Fial");
				}
   }//end of main
}//end of class ResutDemo2
