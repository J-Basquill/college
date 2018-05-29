/**
 * The StringProcessing class has method(s) used to manipulate strings.
 * 
 * @author Joe Duffin
 * @author Student ID 7277989
 * @version 10/02/2014
 */
public class StringProcessing
{
    public static void main(String [] args)
    {
        System.out.println("Welcome: In main method of Class StringProcessing: About to call a method WriteString");
        writeString("Hello",7);
        System.out.println("Goodbye");
        //doSomething();
    }
    
     /**
     * This method prints a message to the screen a number of times.
     *<p>usage: writeString("word",10) </p>
     *<p>This call writes the string "word" to the screen ten times.
     *The method is declared as a static method and can be called using
     *the StringProcessing.writeString("hello",3) in another method. </p>
     * @param myString this is the string to be written to the screen
     * @param num the number of times to write the string to the screen.
     * @return void
     */
     public static void writeString( String myString, int num) 
    {   
        for(int i=1;i <= num;i++){
           
            System.out.println(myString + " : " + i);
        }
    }
    // We need to use the static access modifier to call this method
    // from the main method within this class or as a static method
    // call from another class like a TestClass using the <ClassName>.<methodName>
    // E.g. StringProcessing.doSomething();
    public static void doSomething(){ 
        System.out.println("Just printing to the screen");
    }
}