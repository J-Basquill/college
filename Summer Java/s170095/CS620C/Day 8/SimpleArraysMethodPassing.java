/**
 * This is a demonstration of an int array being passed to a method to have its 
 * values changed. Information is passed in java methods by value. In this case 
 * the value passed is the machine memory address of the array in memory.
 * 
 * @author Joe Duffin
 * @version 08/09/2013
 */
public class SimpleArraysMethodPassing
{
    public int value = 0;
    
    public static void main(String args[])
    {
    
        // myNumbers stores the machine address of an integer array which is created in memory 
        // and intialised in sequence with the values below
        int[] myNumbers = {51,62,3,7,9,15,27,29,2,0,10}; 
        
        for(int i= 0;i< myNumbers.length; i++)
        {
            System.out.println("Array element: [" + i +"] contains : " + myNumbers[i]); 
        }    
        
        changeContents(myNumbers); //call this method to begin executing at this point.
        
        for(int i= 0;i< myNumbers.length; i++)
        {
            System.out.println("Array element: [" + i +"] contains : " + myNumbers[i]); 
        }   
        
        
    }
    // This method will change the contents of the array referred to by the variable myList
    public static void changeContents(int [] myList)
    {
        // set each and every array element to 99.
        for (int i=0;i<myList.length;i++)
        {
            myList[i] = 99;
        }
    
    }
}

