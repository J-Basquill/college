
/**
 * This program will test the use of static method which are 
 * defined in the class GeneralMaths.
 * 
 * @author Joe Duffin   
 * @author 78838434
 * @version 14/02/2014
 */
public class myTester
{

    public static void main(String [] args)
    {
        System.out.println("Running the main method of the myTester class");
        System.out.println("I'm going to us a method from the GeneralMaths class");
        int number = 4;
        
        int x = GeneralMaths.mySigma(number); // I'm using a static method here.
        
        System.out.println("The Sigma value of "+number+ " is : " + x);
    }

}