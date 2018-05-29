
/**
 * Write a description of class BrokenArrow here.
 * 
 * @author (James Basquill) 
 * @author (17186285)
 * @version (1.2)
 */
public class BrokenArrow
{

    public static void main(String [] args)
    {
        String message = "Hello programmer";                //was commented out
        doSomething();// Calling the doSomeThing method     //no semicolon
        doSomethingElse(message);                           //declared String in parameters
    }

     /**
     * This is a trivial method that just prints a message to the screen.
     * <p>usage: doSomething() </p>
     * @param empty
     * @return void
     */
    public static void doSomething()
    {
           System.out.println("This is a trivial method");
        
    }
     /**
     * This is a trivial method that just prints a message to the screen.
     * <p>usage: doSomethingElse("hello you") </p>
     * <p>output to the screen: hello you
     * @param phrase The phrase to be printed to the screen.
     * @return void
     */
    public static void doSomethingElse(String phrase){  //static modifier was missing
    
        System.out.println(phrase);
    }
     
}