
/**
 * Lab 201
 * 
 * @author James Basquill
 * @author 17186285
 * @version 13/09/17
 */
public class lab202
{
   public static void main(String[] args)
   {
       int[][] intArray = new int[5][5];
       fill2D(intArray, 1);
       print2D(intArray);
       print2DIndices(intArray);
   }
   public static void fill2D(int[][]toFill, int filler)
   {
       for(int r=0;r<toFill.length;r++)
       {
           for(int c=0;c<toFill[r].length;c++)
           {
               toFill[r][c] = filler;
           }
       }
   }
   public static void print2D(int[][] toPrint)
   {
       for(int r=0;r<toPrint.length;r++)
       {
           System.out.println(" ");
           for(int c=0;c<toPrint[r].length;c++)
           {
               System.out.print(toPrint[r][c]+" ");
           }
       }
   }
   public static void print2DIndices(int[][] toPrint)
   {
       for(int r=0;r<toPrint.length;r++)
       {
           System.out.println(" ");
           for(int c=0;c<toPrint[r].length;c++)
           {
               System.out.print("["+r+","+c+"]");
           }
       }
   }
}
