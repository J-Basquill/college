import java.util.Scanner;
/**
 * Lab 101
 * 
 * @author James Basquill
 * @author 17186285
 * @version 13/09/17
 */
public class lab101
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        double[] randomArray = new double[25];
        for(int i=0;i<randomArray.length;i++)
        {
            randomArray[i] = (int)(Math.random()*101);
        }
        printArray(randomArray);
        
        double input=0.0d;
        boolean flag = false;
        while(flag==false)
        {
            System.out.print("\nPlease enter a number between 0 and 100 : ");
            input = sc.nextDouble();
            if(input>=0&&input<=100)
            {
                flag=true;
            }
        }
        int checkResult = checkArray(randomArray, input);
        System.out.println(input+" appears in the array "+checkResult+" time(s)");
    }
    /**
     * Method to print an array
     * @param toPrint, the method to be printed
     */
    public static void printArray(double[] toPrint)
    {
        for(int i=0;i<toPrint.length;i++)
        {
            System.out.print(toPrint[i]+" ");
        }
    }
    /**
     * Method to check an array for an integer and return how many times it appears
     * @param toCheck, the array to be investigated
     * @param lookFor, the double we wish to look for
     * @return Returns the amount of times lookFor appears
     */
    public static int checkArray(double[] toCheck, double lookFor)
    {
        int count = 0;
        for(int i=0;i<toCheck.length;i++)
        {
            if(toCheck[i]==lookFor)
            {
                count++;
            }
        }
        return count;
    }
}
