
/**
 * Program to create and initialize 50 boolean variables as 'true'
 * 
 * @author James Basqill
 * @author 17186285
 * @version 11/9/17
 */
public class lab101
{
   public static void main(String[] args)
   {
    boolean [] myArray = new boolean[40];   //open boolean array with 50 slots
    for(int i=0;i<myArray.length;i++)
        {
           myArray[i] = true;               //assign true to each index in myArray
        }
    printArray(myArray);                    //method call to print the array
    }
    
    /**
     * Method to print an array  
     * @param The array to be printed
     */
    public static void printArray(boolean[] myPrint)
    {
        for(int i=0; i<myPrint.length;i++)
        {
            System.out.println("Index "+i+" is "+myPrint[i]);
        }
    }    
}
