
/**
 * Lab 104
 * 
 * @author James Basquill
 * @author 17186285
 * @version 13/09/17
 */
public class lab104
{
   public static void main(String[] args)
   {
       char[][] charArray = new char[5][5];
       fill2D(charArray, '1');
       print2D(charArray);
       print2DIndices(charArray);
       /*charArray[1][1]='1'; charArray[1][2]='1'; charArray[1][3]='1'; charArray[2][2]='1';
       System.out.println();
       print2D(charArray);*/
   }
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
   public static void print2DIndices(char[][] toPrint)
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
