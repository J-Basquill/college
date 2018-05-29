/**
 * General class with maths functions.
 * (1) MySigma(number) returns the Sigma function of number
 * 
 * @author Joe Duffin
 * @author 97273884
 * @version 14/02/2014
 */
import java.util.Scanner; //import the Scanner class from the java.util library before using it in your code

public class GeneralMaths
{

    public static void main(String [] args)
    {
       Scanner myInput = new Scanner (System.in);
       System.out.println("Please enter a number in order to calculate its Sigma value : ");
       int n = myInput.nextInt();
       int value = mySigma(n); // calculate the Sigma value of n and store it in the variable value.
       System.out.println("The value of Sigma "+ n +" is "+ value);
    }

     /**
     * This method calculates the sigma value for a positive integer.
     * The sigma value for any integer n is the sum of the integers from 
     * 0 to n.
     * <p>usage: int y = mySigma(3) </p>
     * <p> y will have the value of 3+2+1 -> 6 <p>
     * @param n number for which sigma will be calculated.
     * @return int the sigma of n
     */
    public static int mySigma(int n)
    {
        int result=0;
        for (int i=1;i<=n;i++){
         result = result + i;
        }     
        return result;
    }
}