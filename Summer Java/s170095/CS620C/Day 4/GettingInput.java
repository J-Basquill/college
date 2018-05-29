
/**
 * This application demonstrates the use of the Scanner class 
 * in order to obtain input from the user of your program.
 * 
 * @author Joe Duffin
 * @version 04/09/2013
 */


// you need to import the Scanner class from the java.util library before using it in your code
import java.util.Scanner; 

public class GettingInput
{
    public static void main(String []args)
	{
        // Creates an object of type Scanner using the class constructor while 
        // passing the System.in vaue to the constructor.
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter your first name and press enter");
        String myName = myScanner.nextLine();
        
        System.out.println("Hi " + myName);
        
        System.out.println("Please enter a number and press enter : ");
        String myNumber = myScanner.nextLine();
        
        System.out.println("you entered the number " + myNumber);
    
    }
}
