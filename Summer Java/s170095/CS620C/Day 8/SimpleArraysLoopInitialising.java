/**
 * This is a demonstration of arrays of type int.
 * This program shows two ways of accessing the contents of an array using a loop.
 * 
 * @author Joe Duffin
 * @version 08/09/2013
 */
public class SimpleArraysLoopInitialising
{
    public static void main(String args[]){
   
        // myNumbers stores the machine address of an yet to be created integer array (array of ints).
        int[] myNumbers;
        
        myNumbers = new int[10];
        
        // This loop is used to intialise or set to zero each element of the myNumbers array.
        // Notice the loop "knows" its own length using myNumbers.length
        for(int i= 0;i< myNumbers.length; i++)
        {
           // Access the ith element of the myNumbers array and set it to zero
            myNumbers[i] = 0; 
        } 
        
        // This loop is used to print each element in the myNumbers array and print it to the screen.
        for(int i= 0;i< myNumbers.length; i++)
        {
            System.out.println("Array element: [" + i +"] contains : " + myNumbers[i]); 
        }    
        
    }
}