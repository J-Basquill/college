
/**
 * This program creates a cat using the Cat Class as the template.
 * It then calls methods on the instance the Cat Class named cat1
 * in order to print out its name, age and weight.
 * Notice that you use the '.' operator after the object identifier name cat1
 * followed by the method name in order to call the appropriate method
 * which is part of the behaviour of the object cat1.
 * This program also creates an instance of the FlyingCat class named cat2 which is related
 * genealogically to the Cat class. Notice cat2 the FlyingCat can use the same methods as
 * cat1.
 * 
 * @ author Joe Dufin 
 * @version 10-9-2013
 */
public class CatOwnerApp
{
    public static void main(String []args)
    {
        //Create the object cat1 by using the Cat constructor
        Cat cat1 = new Cat("Snowy", 15, 5); 
        
        cat1.printName();
        cat1.printAge();
        cat1.printWeight();
		
		/************ method calls of added methods ************************/
		cat1.setAge(22);
		int x = cat1.getAge();
		System.out.println("The New age of the cat is " + x);
        /********************************************************************/
		
		
        // Create the object cat2 by using the FlyingCat constructor
        FlyingCat cat2 = new FlyingCat("Awesome Cat",20,10,50);
        
        cat2.printName();
        cat2.printAge();
        cat2.printWeight();
        cat2.speak(); // we did not ask cat1 to speak
    
    }
    
}