
/**
 * Lab 101
 * 
 * @author James Basquill
 * @author 17186285
 * @version 14/09/17
 */
public class lab101
{
    public static void main(String[] args)
    {
        int[] myNumbers = {33,5,29,89,19,1,7,6,77,22,11};
        int min = findSmallest(myNumbers);
        int max = findLargest(myNumbers);
        int [] minMax = findLargestandSmallest(myNumbers);
        System.out.println("Minimum is "+min);
        System.out.println("Maximum is "+max);
        for(int i=0;i<minMax.length;i++)
        {
            System.out.print(minMax[i]+"\t");
        }
        int[][] minmax = findLargestandSmallest2D(myNumbers);
        for(int i=0; i<minmax.length;i++)
        {
            System.out.println(" ");
            for(int j=0;j<minmax[0].length;j++)
            {
                System.out.println(minmax[i][j]);
            }
        }
    }
    /**
     * Method to find the largest value in an array
     * @param toSearch the array to be searched
     * @return Returns the largest value found in the array
     */
    public static int findLargest(int[] toSearch)
    {
        int max = toSearch[0];
        for(int i=0;i<toSearch.length;i++)
        {
            if(toSearch[i]>max)
            {
                max = toSearch[i];
            }
        }
        return max;
    }
    /**
     * Method to find the smallest value in an array
     * @param toSearch the array to be searched
     * @return Returns the smallest value found in the array
     */
    public static int findSmallest(int[] toSearch)
    {
        int min = toSearch[0];
        for(int i=0;i<toSearch.length;i++)
        {
            if(toSearch[i]<min)
            {
                min = toSearch[i];
            }
        }
        return min;        
    }
    
    /**
     * Method to fins both the smallest and largest value in an array and output them in another array
     * @param toSearch the array to search
     * @return Returns an array with two indices, the first which is the smallest value found, the second which is the largest value found
     */
    public static int[] findLargestandSmallest(int[] toSearch)
    {
        int [] minMax = {toSearch[0],toSearch[0]};
        for(int i=0;i<toSearch.length;i++)
        {
            if(toSearch[i]<minMax[0])
            {
                minMax[0] = toSearch[i];
            }
            else if(toSearch[i]>minMax[1])
            {
                minMax[1] = toSearch[i];
            }
        }
        return minMax;
    }
    
    /**
     * Method to finds both the smallest and largest value in an array and output them in a 2D array
     * @param toSearch the array to search
     * @return Returns a 2D array with two indices, the first which is the smallest value found, the second which is the largest value found
     */
    public static int[][] findLargestandSmallest2D(int[] toSearch)
    {
        int [][] minMax = { {toSearch[0]},
                            {toSearch[0]}};
        for(int i=0;i<toSearch.length;i++)
        {
            if(toSearch[i]<minMax[0][0])
            {
                minMax[0][0] = toSearch[i];
            }
            else if(toSearch[i]>minMax[1][0])
            {
                minMax[1][0] = toSearch[i];
            }
        }
        return minMax;
    }
}
