
/**
 * Lab 203 program to test method call and creating 2D arrays
 * 
 * @author James Basquill
 * @author 17186285
 * @version 14/09/17
 */
public class MathsTester
{
    public static void main(String[]args)
    {
        int x = 5;
        int y = 2;
        int result = toPowerOf(x,y);
        /*
         * 1. Open a stack frame
         * 2. Assign memory for formal parameters and variables
         * 3. Store return address
         * 4. Copy actual parameters to the formal parameters
         * 5. Execute code until you hit the end brace or return command
         * 6. Send reurn value back to return address
         * 7. Flow of control of execution returns to return address
         * 8. Stack frame is destroyed along with memory of variables and parameters
         */
        System.out.println(x+" to the power of "+y+" is "+result);
        
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=10;j++)
            {
                result = toPowerOf(j,i);
                System.out.println(j+" to the power of "+i+" is "+result);
            }
        }
        int[][] array2D = new int[10][3];
        int sum = 0;
        for(int r=0;r<array2D.length;r++)
        {
            for(int c=0;c<array2D[r].length;c++)
            {
                array2D[r][c] = toPowerOf(r+1,c+1);
                sum+= array2D[r][c];
            }
        }
        print2D(array2D);
        System.out.println("\nThe sum of all integers in the array is "+sum);
    }
    /**
     * Method to find the power of different integers
     * @param a first integer to find the power of b
     * @param b integer to determine times a is multiplied by itself
     * @return Returns result of calculation
     */
    public static int toPowerOf(int a, int b)
    {
        int result = 1;
        for(int i=0;i<b;i++)
        {
            result *=a;
        }
        return result;
    }
    
    public static void print2D(int[][]toPrint)
    {
        for(int r=0;r<toPrint.length;r++)
        {
            System.out.println(" ");
            for(int c=0;c<toPrint[r].length;c++)
            {
                System.out.print(toPrint[r][c]+"\t");
            }
        }
    }
}
