import java.util.Scanner;
/**
 * Program to calculate the Luhns algorithm for credit cards
 * 
 * @author James Basquill
 * @author 17186285
 * @version 29/09/17
 */
public class Solution
{
    public static void main(String[] args)
    {
        int length = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        long cardInt = sc.nextLong();
        length = String.valueOf(cardInt).length();
        if(length>=4&&length<=30)
        {
            long[] cardNum = new long[length];
           
            for(int i=length-1;i>=0;i--)
            {
                cardNum[i] = cardInt%10;
                cardInt/= 10;
            }
            
            for(int i=cardNum.length-2;i>=0;i-=2)
            {
                cardNum[i]*=2;
                if(cardNum[i] > 9)
                {
                    cardNum[i]-=9;
                }
            }
            int sum = 0;
            for(int i=0; i<cardNum.length-1;i++)
            {
                sum+=cardNum[i];
            }
            int result = sum*9;
            result = result%10;
            
            if(result==cardNum[cardNum.length-1])
                {
                    System.out.println("VALID");
                }
            else
                {
                    System.out.println("INVALID");
                }
        }
    }
}
