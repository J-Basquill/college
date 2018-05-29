
/**
 * Lab 101, program to test recursive methods
 * 
 * @author James Basquill
 * @author 17186285
 * @version 14/09/17
 */
public class myApp
{
    public static void main(String[]args)
    {
        int[] array = new int[10];
        for(int i=0;i<array.length;i++)
        {
            array[i] = 1+(int)(Math.random()*20);
        }
        printArray(array);
        
        int[] factArray = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            factArray[i] = factorial(array[i]);
        }
        printArray(factArray);
        
        int[] sigArray = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            sigArray[i] = sigma(array[i]);
        }
        printArray(sigArray);
    }
    /**
     * Method to find factorial of an integer
     * @param n the integer we are calculating the factorial of
     * @return Returns the result of the calculation
     */
    public static int factorial(int n)
    {
        int result = 0;
        if(n<=1)
        {
            return 1;
        }
        else
        {
            result = n*(factorial(n-1));
            return result;
        }
    }
    /**
     * Method to find sigma of an integer
     * @param n the integer we are calculating the sigma of
     * @return Returns the result of the calculation
     */
    public static int sigma(int n)
    {
        int result = 0;
        if(n<=0)
        {
            return 0;
        }
        else
        {
            result = n+(sigma(n-1));
            return result;
        }
    }
    public static void printArray(int[] toPrint)
    {
        System.out.println(" ");        
        for(int i=0;i<toPrint.length;i++)
        {
            System.out.print("["+toPrint[i]+"],");
        }
    }
}
