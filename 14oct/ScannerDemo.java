//Program: To understand input using Scanner
//@author : Sujata Kumari
//@Date :14 oct 2022 


	//importing util package for scanner class
	import java.util.Scanner;
	
	// declaring a class
	class ScannerDemo
		{
			// main method
			public static void main(String args[])
			{
				//creating object of scanner class
				Scanner sc= new Scanner(System.in);
				
				// declaring and initializing local variables	
	
				System.out.println("Enter your name: ");
				String name= sc.next(); // To take string input
				
				System.out.println("Enter your age");
				int age= sc.nextInt(); //To take integer input
				
				System.out.println("Enter you gender Male/Female");
				char gender= sc.next().charAt(0); //To take charter input
				
				
				System.out.println("Enter your marks");
				float marks= sc.nextFloat(); //To take float input
				
				System.out.println("Enter your Pass(True/False)");
				boolean pass= sc.nextBoolean(); //To take boolean input
				
	
				System.out.println("-------------------------------------");
				System.out.println("Here is your details");
				System.out.println("Name :" +name);
				System.out.println("Gender :" +gender);
				System.out.println("Age :" +age);
				System.out.println("Marks :" +marks);
				System.out.println("Pass :" +pass);
				
	
 
		}
        //end of main mehod
	}
	//end of class ScannerDemo
	
	