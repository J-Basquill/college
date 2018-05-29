import java.util.*;
/**
 * Write a description of class Solution here.
 * 
 * @author James Basquill
 * @author 17186285
 * @version 2017/10/27
 */
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();
        int target = sc.nextInt();
        int iterations = 1000000;
        int tails = 0;
        int result;
        int target_met = 0;
        for(int i =0; i<iterations; i++){
            for(int j=0; j<flips; j++){
                result = (int)Math.round((Math.random()));
                //System.out.println(result);
                if(result == 1){
                    tails++;
                    if(tails==target){
                        target_met++;
                        tails = 0;
                        break;
                    }
                }
                else{
                    tails = 0;
                }
            
        }
    }
    //float percentage = ((float)target_met/(iterations/100));
    //System.out.println(Math.round(percentage));
    /*if(flips == 0){
        System.out.println("0");
    }
    else{*/
        int percentage = (int)((float)target_met/(iterations/100));
        System.out.println(percentage);
    /*}*/
   }
}
