
/**
 * This class shows how you can have a non-recangular 2D array.
 * 
 * @author Joe Duffin
 * @author 883970073
 * @version 20/02/2014
 */
public class MyNonRectangular2DArray
{

    public static void main(String [] args)
    {
       // initialize the number of rows only 
       int [][] myArray = new int[3][]; 
       
       myArray[0] = new int[3]; // initialize the number of columns myArray[0] is a reference to an array
       myArray[1] = new int[4]; // in each row 
       myArray[2] = new int[5]; 
       
       // This loops sets each element in the 2d array to the value 10 and then prints out this value
       for (int row =0; row < myArray.length; row++) {
           
          for (int column=0; column < myArray[row].length; column++) {

                myArray[row][column] = 10; // set the array element to 10
                System.out.print(" " + myArray[row][column]);
          }      
          
          System.out.println("");
       }
    }  
}