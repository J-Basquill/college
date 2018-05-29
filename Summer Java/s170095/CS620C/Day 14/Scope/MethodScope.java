
/**
 * This program shows how local method variables and formal parameters are not available 
 * outside of the method. They only exist for the duration of the method call
 * This method also shows how a variable declared and initialised in a code block is not 
 * accessible outside the code block {   }.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MethodScope
{
    public static void main(String [] args){
    
         int x = getSum(5,7); 
         System.out.println("The sum is : " + x);
         
         System.out.println("Method variables are not available outside the method");
         //System.out.println("Vaules of a, b and result :" + a + " " + b + " " + result);
         
            {
                
                int y = 7;
            }
            // variable y is out of scope at this point.
            
            System.out.println("The variable y is unavailable outside its creation code block ");
            //System.out.println("The value of y is : " + y);
            
            int y = 8;  //we can create a variable of the same name because the previous y was out of scope.
         
    
    }
    
    
    public static int getSum(int a, int b){
    
        int result = a + b;
        return result;
        
    }
}
