
/**
 * Program to create a 30 index array pf randomized numbers between 0-100
 * 
 * @author James Basquill
 * @author 17186285
 * @version 13/9/17
 */
public class lab102
{
    public static void main(String[]args)
    {
        int[] randomArray = new int[30];
        for(int i=0;i<randomArray.length;i++)
        {
            randomArray[i] = (int)(Math.random()*101);
        }
        int[] zeroArray = new int[30];
        for(int i=0;i<zeroArray.length;i++)
        {
            zeroArray[i] = 0;
        }
        for(int i=0;i<zeroArray.length;i++)
        {
            System.out.println(randomArray[i]+"\t"+zeroArray[i]);
        }
        for(int i=0;i<zeroArray.length;i++)
        {
            zeroArray[i] = randomArray[i];
            System.out.println(randomArray[i]+"\t"+zeroArray[i]);
        }
        for(int i=0;i<zeroArray.length;i++)
        {
            randomArray[i] += 10;
            zeroArray[i] += 20;
            System.out.println(randomArray[i]+"\t"+zeroArray[i]);
        }
    }
}
