/**
 * This is a demonstration of arrays of type int.
 * This program shows how to access the contents of an array using a loop.
 * 
 * @author Joe Duffin
 * @version 08/09/2013
 */
public class SimpleArraysLoopPrinting
{
    public static void main(String args[]){
    
        // secondlist stores the machine address of an integer array which is created in memory 
        // and intialised in sequence with the values below
        int[] myNumbers = {51,62,3,7,9,15,27,29,2,0,10}; 
        
        for(int i= 0;i< myNumbers.length; i++)
        {
            System.out.println("Array element: [" + i +"] contains : " + myNumbers[i]); 
        }    
        
    }
}
