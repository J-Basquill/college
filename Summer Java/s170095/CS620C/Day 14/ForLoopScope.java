
/**
 * Write a description of class forLoopScope here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForLoopScope
{
    public static void main(String [] args){
    
        int x;
        for (x=0;x<3;x++){
        
            System.out.println("printing the value of x : " + x);
        }
       
        System.out.println("It is ok to print x as it was declared outside the loop " + x);
        
        for (int count=0; count <2;count ++){
        
            System.out.println("value of variable count is " + count);
        }
        
        //System.out.println("It is an error to try and access  variable count here : " + count);
    }
}