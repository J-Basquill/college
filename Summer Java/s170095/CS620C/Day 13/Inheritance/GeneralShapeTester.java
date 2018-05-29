
/**
 * This Class will instantiate objects of the different shape types and test 
 * their methods.
 * 
 * @author Joe Duffin
 * @author 881038837
 * @version 08/03/2014
 */
public class GeneralShapeTester
{

    public static void main(String [] args)
    {
        // create a square with a length 5 and colour "Purple" (the square constructor here uses the superclass constructor)
        Square mine = new Square(5, "Purple"); 
        
        // using the inherited method getColour defined in TwoDShape
        System.out.println("The colour of the square is " + mine.getColour()); 
        
        // using the inherited method setColour defined in TwoDShape
        mine.setColour("Orange"); 
        
        // examining the new colour of the square object using the inherited getColour method defined in class TwoDShape
        System.out.println("\n\n The colour of the square is " + mine.getColour()); 
        
        Circle myCircle = new Circle(1, "Green");
        
        System.out.println("\n\n The colour of the circle is "+myCircle.getColour());
    }
     
}