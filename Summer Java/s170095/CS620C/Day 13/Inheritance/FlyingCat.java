
/**
 * The class FlyingCat illustrates the idea of code reuse and inheritance in java object 
 * oriented programming. The FlyingCat reuses behaviour and attributes from the class Cat through 
 * inheritance in the same way you may inherit some physical attribute from your parents.
 * Although the FlyingCat class has only wingLenth as a class variable defined it also has 
 * access to the methods and attributes of the Cat class because it inherits them.
 * Java does this by using the key word extends followed by the name of the class whose methods
 * and attributes the class wants to inherit.
 * Although the Flying class only has one method defined in it i.e. printWingLength, this class 
 * has access to the methods and attributes defined in the Cat class due to this concept of 
 * inheritance.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlyingCat extends Cat
{
    // instance variable
    private int wingLength;

    /**
     * Constructor for objects of class FlyingCat
     */
    public FlyingCat(String catName, int catAge,double catWeight, int wLength )
    {
        
        // call the constructor of the parent class. This must be called first in 
        // the constructor of the FlyingCat Class
        super(catName,catAge,catWeight);
        
        // initialise instance variables
        wingLength = wLength; 
        
    }

    public void printWingLength(){
        System.out.println("This cat has " + wingLength + " cm wings");
    } 

} // end of the class
