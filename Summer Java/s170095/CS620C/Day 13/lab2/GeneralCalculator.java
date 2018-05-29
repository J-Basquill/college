/**
 * Program to demonstrate method call for different mathematical operations
 * @author James Basquill
 * @author 17186285
 * @version 13/09/17
*/
public class GeneralCalculator{

    public static void main (String [] args)
    {
    
        int x = 7;
        int y = 2;
        
        int result = addTwoNumbers (x,y);
        System.out.println("Two numbers added --> " + result);
        
        result = subtractTwoNumbers(x,y);
        System.out.println( "Two subtracted added --> " + result);
        
        result = calculateModbyTen(x,y);
        System.out.println( "Two modded by ten --> " + result);

    
    } // end of main
    /**
     * Method to add two integer together
     * @param a, first integer to be added
     * @param b, second integer to be added
     * @return Returns the sum of the integers
     */
    public static int addTwoNumbers(int a, int b)
    { 
    
        int result = a+b; 
        return result;
    } 
    /**
     * Method to subtract one integer from another
     * @param a, first integer
     * @param b, integer to be subtracted from the first
     * @return Returns the result of the subtraction
     */
    public static int subtractTwoNumbers(int a, int b)
    {
    
        int result = a-b;
        return result;
    }   
    /**
     * Method to multiply two integer
     * @param a, the first integer
     * @param b, the second integer
     * @return Returns the product of the two integers
     */
    public static int multiplyTwoNumbers(int a, int b)
    {
    
        int result = a * b;
        return result;
    }
    /**
     * Method to calculate the mod of two integers and multiply it by 10
     * @param a, the first integer
     * @param b, the integer to divide by for the modulus
     * @return Returns to vaule of the mod*10
     */
    public static int calculateModbyTen(int a, int b)
    {
        int result = (a%b)*10;
        return result;
    }
} // end of class