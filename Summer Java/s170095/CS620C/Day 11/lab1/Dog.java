
/**
 * This is a class to describe a dog
 * 
 * @author James Basquill
 * @author 17186285
 * @version 11/9/17
 */
public class Dog
{
    String breed;           //what breed is this dog
    boolean isDangerous;    //is it dangerous or not
    int age;                //how old is it
    
    /**
     * Constructor for objects of class Dog
     */
    public Dog(String a, boolean b, int c)
    {
        breed=a;
        isDangerous=b;
        age=c;
    }
    /**
     * Default constructor for Dog
     */
    public Dog ()
    {
        breed="not available";
        isDangerous=true;
        age=1;
    }
    
     /**
     * Method to get the breed of Dog
     * 
     * @return the breed of the Dog 
     */
    public String getBreed()
    {
        return breed;
    }
     /**
     * Method to get the danger of Dog
     * 
     * @return the danger of the Dog 
     */
    public boolean getDanger()
    {
        return isDangerous;
    }
    /**
     * Method to get the age of Dog
     * 
     * @return the age of the Dog 
     */
    public int getAge()
    {
        return age;
    }
    
     /**
     * Method to set the breed of Dog
     * 
     * @param  a    The breed of Dog
     */
    public void setBreed(String a)
    {
        breed = a;
    }
       /**
     * Method to set the danger of Dog
     * 
     * @param  b    The danger of Dog
     */
    public void setDanger(boolean b)
    {
        isDangerous = b;
    }
       /**
     * Method to set the age of Dog
     * 
     * @param  c    The age of Dog
     */
    public void setAge(int c)
    {
        age = c;
    }
    
    /**
     * Method to print a simple statement
     */
    public void bark()
    {
       System.out.println("Woof! The dog has barked");
    }
}
