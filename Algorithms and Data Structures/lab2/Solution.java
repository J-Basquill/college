import java.util.Scanner;

public class Solution
{
   public static void main(String [] args)
   {
       Scanner sc = new Scanner(System.in);
       
       int[] array = new int[3];
       for(int i=0;i<array.length;i++)
       {
           array[i] = sc.nextInt();
       }
       /*int min = array[0];
       int max = array[0];
        for(int i=0;i<array.length;i++)
       {
           if(array[i]<min)
           {
               min = array[i];
            }
           if(array[i]>max)
           {
               max = array[i];
            }
       }*/
       
       int diff1 = Math.abs(array[0]-array[1]);
       int diff2 = Math.abs(array[0]-array[2]);
       int diff3 = Math.abs(array[1]-array[2]);
       
       int sumDiff0 = diff1+diff2;
       int sumDiff1 = diff1+diff3;
       int sumDiff2 = diff2+diff3;
       
       if(sumDiff0>sumDiff1&&sumDiff0>sumDiff2)
       {
           System.out.println(array[0]);
       }
       else if(sumDiff1>sumDiff0&&sumDiff1>sumDiff2)
       {
           System.out.println(array[1]);
       }
       else if(sumDiff2>sumDiff0&&sumDiff2>sumDiff1)
       {
           System.out.println(array[2]);
       }
       else
       {
           System.out.println("NA");
       }
   }
   
}
