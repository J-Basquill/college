
/**
 * This program demonstrates the scope of java variales.
 * 
 * @author Joe Duffin 
 * @version 09/09/2013
 */
public class TestScope1
{
    // class variable
    public static int x; 
    
    public static void main(String []args){
    
        x  = 25;
        
        System.out.println("the value of x is : " + x);
        
        printValue();
        

    
    
    }
    
    public static void printValue(){
    
        System.out.println("In the printValue method the value of x is : " + x);

    }
    
    
    

    
}
