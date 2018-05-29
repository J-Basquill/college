
/**
 * This program illustrates passing a 2D array to methods.
 * 
 * @author Joe Duffin        
 * @author 887293922
 * @version 20/02/2014
 */
public class My2DArrayProcessor3
{
    public static void main(String [] args)
    {
       int [][] myTable = createNew2DArray(50,5,10); // creates a new array and returns its reference, stored in myTable
       
       My2DArrayProcessor2.print2DArray(myTable); // Using the static method already written in the previous class file
       
    }

     /**
     * This method creates a new, 2D array, initialises its array elements
     * and returns the array.
     * <p>usage: int[][] myData = createNew2Darray(17,4,5) </p>
     * <p> Creates a new 4*5 2D array and fills the array elements with 17
     * @param intialValue the value to give to each array element
     * @param rows the number of rows in the array
     * @param columns the number of columns in the array
     * @return the reference to the newly created 2D array
     */
    public static int[][] createNew2DArray(int initialValue, int numRows, int numColumns){
        
            int[][] localArray = new int[numRows][numColumns]; // create a new array with information passed to the method.
        
            for (int i = 0; i < localArray.length; i++){
                
                for (int j = 0; j < localArray[0].length; j++){
                
                     localArray[i][j] = initialValue; // give each and every element of the array the value in initialValue
                }
            }     
            
            return localArray; // return the link reference of the newly created and initialised array.
    }   
}