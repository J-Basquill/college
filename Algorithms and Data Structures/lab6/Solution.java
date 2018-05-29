import java.util.*;
/**
 * Write a description of class Solution here.
 * 
 * @author James Basquill
 * @author 17186285
 * @version 2017/11/10
 */
public class Solution
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       int arrayLen = sc.nextInt();
       int toPrint = sc.nextInt();
       String blank = sc.nextLine();
       String[] array = new String[arrayLen];
       for(int i = 0; i < arrayLen; i++){
           array[i] = sc.nextLine();
       }
       //System.out.println(array[0]);              
       // printArray(array);
       for (int i = 1; i <array.length;i++){
           int temp = array[i].length();
           String strTemp = array[i];
           int check = i;
           while(check>0&&array[check-1].length() >= temp){
               array[check] = array[check-1];
               check--;
            }
            array[check] = strTemp;
        }
          
        // printArray(array);
        
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j].length()==array[i].length()&&array[j].compareToIgnoreCase(array[i])>0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       System.out.println(array[toPrint-1]);

   }
   
   /*public static void swap(int a, int b){
       int temp = array[a];
       array[a] = array[b];
       array[b] = temp;
    }*/
    
    public static void printArray(String[] print){
        for(int i = 0; i < print.length; i++){
            System.out.println(print[i]);
        }
    }
}
