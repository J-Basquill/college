
/**
 * Program to test Utility.
 * 
 * @author James Basquill 
 * @author 17186285
 * @version 12/9/17
 */
public class utilityTest
{
    public static void main(String[] args)
    {
        int a = Utility.timesTwo(4);
        System.out.println(a);
        
        int b = Utility.mySigma(6);
        System.out.println(b);
        
        double c = Utility.getAverage(10, 18);
        System.out.println(c);
    }
}
