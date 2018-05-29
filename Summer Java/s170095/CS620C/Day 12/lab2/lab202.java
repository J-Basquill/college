
/**
 * Lab 2 on Day 12 of CS620C.
 * 
 * @author James Basquill
 * @author 17186285
 * @version 12/9/17
 */
public class lab202
{
    public static void main (String[]args)
    {
        int[][] myDataGrid =    {{43,0,7,9,12},         //declare and initalising a 2dArray
                                 {4,-5,8,17,99},
                                 {-2,36,48,76,15}};
        print2D(myDataGrid);                            //various method calls
        addValueToArray(myDataGrid, 7);
        print2D(myDataGrid);
        
        int[][] myOtherList = new int[myDataGrid.length][myDataGrid[0].length];     //new 2dArray
        copyContents(myDataGrid, myOtherList);
        print2D(myOtherList);
    }
    /**
     * Method to print a 2dArray
     * @param toPrint, formal parameter for 2dArray to be printed
     */
    public static void print2D(int[][] toPrint)         
    {
        System.out.println(" ");
        for(int r=0;r<toPrint.length;r++)
        {
            System.out.println(" ");
            for(int c=0;c<toPrint[r].length;c++)
            {
                System.out.print(toPrint[r][c]+"\t");
            }
        }    
    }
    /**
     * Method to add to each index in a 2dArray
     * @param array, array to which add is to be added to each index
     * @param add, integer to be added to the indices in array
     */
    public static void addValueToArray(int[][] array, int add)  
    {
        for(int r=0;r<array.length;r++)
        {
            for(int c=0;c<array[r].length;c++)
            {
                array[r][c] += add;
            }
        } 
    }
    /**
     * Method to copy one 2dArrays indices to another
     * @param copy, 2DArray to be copied
     * @param paste, 2DArray for the values to be assigned to
     */
    public static void copyContents(int[][] copy, int[][]paste) 
    {
        for(int r=0;r<copy.length;r++)
        {
            for(int c=0;c<copy[r].length;c++)
            {
                paste[r][c] = copy[r][c];
            }
        } 
    }
}
