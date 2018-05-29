
/**
 * This class illustrates the use of a public static method
 * defined inside another class named StringProcessing
 * Notice that in order to use this method we use the name 
 * of the class StringProcessing followed by the "." dot operator
 * followed by the name of the method (calling the method) with
 * the correct number of actual paramaters according to the way 
 * it was designed.
 * 
 * @author Joe Duffin
 * @author 880312347
 * @version 3/03/2014
 */
public class TestStringProcessing
{
    public static void main(String [] args)
    {
       System.out.println("In main of TestStringProcessing about to make a call to a static method");
       StringProcessing.writeString("Helen",5); // static method call
       System.out.println("This line of coded to be executed after the static method call");
       
    }
}
       