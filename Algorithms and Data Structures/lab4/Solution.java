import java.util.Scanner;
/**
 * Write a description of class Solution here.
 * 
 * author: James Basquill
 * author: 17186285
 * version: 2017/10/20
 */
public class Solution
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter your range");
        int length = 1002;
        boolean[] sieve = new boolean [length];
        for(int i = 2; i< sieve.length;i++)
        {
            sieve[i] = true;
        }
        
        for(int i = 2; i < sieve.length;i++)
        {
            if(sieve[i] == true)
            {
                //System.out.println(i+" is a prime number.");
                for(int j = i+i; j< sieve.length; j+=i)
                {
                    //System.out.println(j+" check");
                    sieve[j] = false;
                }
            }
        }
        int check = sc.nextInt();
        int pre = 0;
        int post = 0;
        for(int i= check; i>=0; i--)
        {
            if(sieve[i] == true)
            {
                pre=i;
                break;
            }
        }
        for(int i= check+1; i<sieve.length; i++)
        {
            if(sieve[i] == true)
            {
                post=i;
                break;
            }
        }
        int result = Math.abs(post-pre);
        System.out.println(result);
    }
}
