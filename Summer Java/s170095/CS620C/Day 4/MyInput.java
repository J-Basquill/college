import java.util.Scanner;

public class MyInput
{
    public static void main(String args[]) 
    {


    Scanner myScan = new Scanner(System.in); // creates a scanner object, links it to the input device
    
    int number; // declare an int variable which will hold the number entered by the user	    

    System.out.println("Enter a number :  "); // ask the user to enter a number

    number = myScan.nextInt();  // uses the nextInt() method call to obtain an int value from the user.

    System.out.println("Enter a second number :  ");
	
	int number2 = myScan.nextInt();
	
	int sum = number+number2;
	int prod = number*number2;
	
	System.out.println("The two values you have entered is " + number+" "+number2); // tell the user what s/he entered 
	System.out.println(" The sum of the two values is "+sum);
	System.out.println("The product od the two values is "+prod);
	
    /*
      update this program so that it takes in two numbers.
      It then outputs the result of the numbers added together and the result of the 
      numbers multiplied by each other.

    */	


    } // end of main method
} // end of class
