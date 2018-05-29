/**
 * This program illustrates the essential aspects of declaring a method 
 * and using this method in the main method of the application.
 * 
 * @author Joe Duffin 
 * @version 4/09/2013
 */
public class MethodSimple3
{
	public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 6;
        int num3 =0;
        // This is a method call or a method invocation.
        // Notice that this method is designed to take two int parameters
        // and also to return and int value (send back to where it was called)
        num3 = addNumbers(num1, num2); // this is a method call or a method invocation.
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is : " + num3);
    }

    /**
     * This method takes two integers, adds them together and
     * prints the result to the screen
     */
    // The first line below is the method signature.
    // the key word int before the method name means that it returns a value of type int. 
    // Notice also that the method is designed to take two parameters a and b
    public static int addNumbers(int a, int b)
    {
        int result = a + b
        return result; // if the method has a return type then it must have the word return in it.
    }
}
