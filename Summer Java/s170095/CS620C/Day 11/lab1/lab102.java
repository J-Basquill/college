
/**
 * Program to create and initialize 50 boolean variables as 'true'
 * except for every third index, which is false.
 * @author James Basqill
 * @author 17186285
 * @version 11/9/17
 */
public class lab102
{
   public static void main(String[] args)
   {
    boolean [] myArray = new boolean[40];   //open boolean array with 50 slots
    int mod = 0;
    for(int i=0;i<myArray.length;i++)       //every index is true except for every third one
        {
            mod = (i+1)%3;
            if(mod==0)
                {
                    myArray[i]=false;
                }
            else
            {
                myArray[i]=true;
            }
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
