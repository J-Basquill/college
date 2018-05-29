
/**
 * This class demonstrates how to declare a two 
 * dimensional (2 D) array.
 * 
 * @author Joe Duffin 
 * @author 883720028
 * @version 20/02/2014
 */
public class My2DArrayProcessor1
{
    public static void main(String [] args)
    {
        //Declare and create a 3 x 4 array (3 rows by 4 columns)
        int[][] myValues= { {23,38,14,7},
                            {-3, 0,14,4},
                            { 9, 13,0,3}, 
                           }; 
        System.out.println("Just printing out the indices used to access the individual array elements");
        System.out.println("Example: [0][0] is row 0 column 0 \n");
                                          
        for (int row = 0; row < 3; row++){
            
            for (int column = 0; column < 4; column++){
            
                System.out.print(" [" + row + "][" + column +"] ");
            }
            System.out.println();
        }     
                                               
        System.out.println("\n About to print out the actual contents of the array myValues \n");  
        for (int row = 0; row < 3; row++){
            
            for (int column = 0; column < 4; column++){
            
                System.out.print(" "+ myValues[row][column]);
            }
            System.out.println();
        }         
        
        System.out.println("\n Once again About to print out the actual contents of the array myValues \n");        
        for (int row = 0; row < myValues.length; row++){
            
            for (int column = 0; column < myValues[0].length; column++){
            
                System.out.print(" "+ myValues[row][column]);
            }
            System.out.println();
        }      
    } // End main 
} // End Class