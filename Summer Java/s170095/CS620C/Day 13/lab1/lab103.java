
/**
 * Lab 103
 * 
 * @author James Basquill
 * @author 17186285
 * @version 13/09/17
 */
public class lab103
{
   public static void main(String[] args)
   {
       char[][] charArray = new char[5][5];
       fill2D(charArray, '*');
       print2D(charArray);
       charArray[1][1]='1'; charArray[1][2]='1'; charArray[1][3]='1'; charArray[2][2]='1';
       System.out.println();
       print2D(charArray);
   }
   /**
    * Method to fill a 2D array with a particular character
    * @param toFill, the 2d array to be filled
    * @param filler, the character we wish to input to each index of the array
    */
   public static void fill2D(char[][]toFill, char filler)
   {
       for(int r=0;r<toFill.length;r++)
       {
           for(int c=0;c<toFill[r].length;c++)
           {
               toFill[r][c] = filler;
           }
       }
   }
   /**
    * Method to print a 2d array
    * @param toPrint, the method to be printed
    */
   public static void print2D(char[][] toPrint)
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
}
