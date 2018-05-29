
/**
 * This program illustrates passing a 2D array to methods.
 * 
 * @author Joe Duffin        
 * @author 887293922
 * @version 20/02/2014
 */
public class My2DArrayProcessor2
{
    public static void main(String [] args)
    {
         //Declare and create a 3 x 4 array (3 row and 4 column)
        int[][] myValues= { {23,38,14,7},
                            {-3, 0,14,4},
                            { 9, 13,0,3}, 
                           }; 
        System.out.println("This code segment uses method calls to first prints the array contents,");
        System.out.println("then it doubles the array contents and finally prints the array again to show the changes. \n");
        
        print2DArray(myValues); //print out the contents of the array.
        
        doubleContents(myValues); // double the values in each element
        
        System.out.println("\n\n\n");
        
        print2DArray(myValues); // print out the array gain to see the result
         
    }

     /**
     * This method pretty prints a 2D array to the screen.
     * <p>usage: print2DArray(sampleArray) </p>
     * <p> Prints out the contents of the array in matrix format
     * @param tempArray the two dimensional array to be printed.
     * @return void
     */
    public static void print2DArray(int [][] tempArray){
        
            for (int row = 0; row < tempArray.length; row++){
                
                for (int column = 0; column < tempArray[0].length; column++){
                
                     System.out.print(" "+tempArray[row][column]); //Print value in array element
                }
                System.out.println();
            }     
    }
    
    /**
     * This method doubles the values stored in the 2D array passed to it.
     * <p>usage: doubleContents(sampleArray) </p>
     * <p> Doubles contents of each element in the array. 
     * @param tempArray the two dimensional array to be processed.
     * @return void
     */
    public static void doubleContents(int [][] tempArray){
        
            for (int row = 0; row < tempArray.length; row++){
                
                for (int column = 0; column < tempArray[0].length; column++){
                     // double the value in the array element,
                     tempArray[row][column] *=2;  // same as tempArray[row][column] = tempArray[row][column] * 2;
                }
            }     
    }     
}