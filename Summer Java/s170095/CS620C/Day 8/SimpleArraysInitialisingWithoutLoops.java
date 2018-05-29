/**
 * This is a demonstration of arrays of type int.
 * This program shows how to set the array element values one by one.
 * 
 * @author Joe Duffin
 * @version 08/09/2013
 */
public class SimpleArraysInitialisingWithoutLoops
{
    public static void main(String args[]){
   
        // myNumbers stores the machine address of an yet to be created integer array (array of ints).
        int[] myNumbers;
        
        myNumbers = new int[10];
        
        myNumbers[0] = 2; // This is the first element in the int array
        myNumbers[1] = 2; 
        myNumbers[2] = 2; 
        myNumbers[3] = 2; 
        myNumbers[4] = 2; 
        myNumbers[5] = 2; 
        myNumbers[6] = 2; 
        myNumbers[7] = 2; 
        myNumbers[8] = 2; 
        myNumbers[9] = 2; // This is the last element in the int array. Notice the value of the array index.
        
        
        // This loop is used to print each element in the myNumbers array and print it to the screen.
        for(int i= 0;i< myNumbers.length; i++)
        {
            System.out.println("Array element: [" + i +"] contains : " + myNumbers[i]); 
        }    
        
    }
}