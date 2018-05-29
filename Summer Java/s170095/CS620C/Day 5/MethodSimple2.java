/**
 * This program illustrates the essential aspects of declaring a method 
 * and using this method in the main method of the application.
 * 
 * @author Joe Duffin 
 * @version 4/09/2013
 */
public class MethodSimple2
{
	public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 6;
        // This is a method call or a method invocation.
        // Notice that this method is designed to take two int parameters
        
        addNumbers(num1, num2); // this is a method call or a method invocation.
    }
    /**
     * This method takes two integers, adds them together and
     * prints the result to the screen
     */
    // The first line below is the method signature.
    // void means that it does not return any values. 
    // Notice also that the method is designed to take two parameters a and b
    public static void addNumbers(int a, int b)
    {
        int result = a + b;
        System.out.println("Two numbers added together : " + result);
    }
}