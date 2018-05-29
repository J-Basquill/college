
/**
 * Write a description of class BrokenArrow here.
 * 
 * @author (your name) 
 * @author (your student id)
 * @version (a version number or a date)
 */
public class BrokenArrow
{

    public static void main(String [] args)
    {
        //String message = "Hello programmer";
        doSomething()// Calling the doSomeThing method
        doSomethingElse(String message);
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
    public void doSomethingElse(String phrase){
    
        System.out.println(phrase);
    }
     
}