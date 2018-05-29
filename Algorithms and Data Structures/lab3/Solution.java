import java.util.Scanner;
/**
 * Write a description of class Solution here.
 * 
 * @author James Basquill
 * @author 17186285
 * @version 13/10/2017
 */
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double sum = 0;
        int[] array = new int[length];
        for(int i = 0; i<length; i++)
        {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        double average = (sum/length);
        //System.out.println("average "+average);
        
        double diff = Math.abs(average-array[0]);
        int closest = 0;
        for(int i = 0; i<length; i++)
        {
            
            if(diff>(Math.abs(average-array[i])))
            {
                //System.out.println("there is a lesser difference "+array[i]);
                diff = Math.abs(average-array[i]);
                closest = i;
            }
        }
        System.out.println(array[closest]);
    }
}
