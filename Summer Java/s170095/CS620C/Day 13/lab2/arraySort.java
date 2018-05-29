
/**
 * Write a description of class arraySort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arraySort
{
    public static void main(String[]args)
    {
        int[] array = {12,223,232,666,1433,0,-34,14,43,554};
        int temp = 0;
        int limit = array.length;
        for(int i=0;i<array.length;i++)
        {
            limit--;
            for(int j=0;j<limit;j++)
            {
                if(array[j]>array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
