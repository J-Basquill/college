
/**
 * This is the Cat class. It is a very brief software representation of a real cat.
 * The only attributes we have provided are age, weight,name and speakSound of the cat but
 * as you know there are any more features needed to describe a real world cat.
 * In software when we model real world objects we only every represent some of the real
 * world objects attributes and behaviours
 * 
 * @author Joe Duffin
 * @version 10-9-2013
 */
public class Cat
{
    // instance variables 
    private int ageInMonths;
    private double weightInKilos;
    private String name;
    private String speakSound = "Meow";
	
    /** Class constructor method which is called when this 
     * class template is being used to create Cat objects.
     * 
     * @param A string representation of the cat name
     * @param An int to store the age in months of the cat
     * @param A double to store the cat weight in Kilos
     */
    public Cat(String catName, int catAge,double catWeight)
    {
        // initialise instance variables
        weightInKilos = catWeight;
        ageInMonths = catAge;
        name = catName;
    }

    /**
     * Prints the name of the cat to the standard input.
     * This is not a normal method you would include in a class
     * definition. 
     */
    public void printName(){
        System.out.println("My name is " + name);
    }
    
    public void printAge(){
        System.out.println("I am " + ageInMonths + " months old");
        
    }
    
    public void printWeight(){
        System.out.println("I  am only " + weightInKilos + " Kilos");
    }
    
    public void speak(){
        System.out.println(speakSound);
    }
	
    /**
     * Returns the age of the cat in months.
     * @return the cat's age in whole number of months.
     * @version 1.2
     */
	public int getAge(){
		
		return ageInMonths;
	
	}
	 /**
     * Sets the age of the cat in months.
     * @param the cat's age in whole number of months.
     * @version 1.2
     */
	public void setAge(int catAge){
	
		ageInMonths = catAge;
	
	}
}
