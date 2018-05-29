/**
 * Method to test the Dog class
 * @author James Basquill
 * @author 17186285
 * @version 11/9/17
 */
public class DogTest
{
    public static void main(String[]args)
    {
        Dog spike = new Dog();                          //construct a new Dog
        Dog droopy = new Dog("terrier", false, 5);      //and a second
        Dog scooby = new Dog("labrador", false, 3);     //and a third 
        
        System.out.println("Spike is a "+spike.getAge()+" year old "+spike.getBreed()+" and is he dangerous: "+spike.getDanger());
        
        spike.setBreed("bulldog");                      //set Spikes three attributes
        spike.setDanger(true);
        spike.setAge(4);
        
        System.out.println("Spike is a "+spike.getAge()+" year old "+spike.getBreed()+" and is he dangerous: "+spike.getDanger());
        System.out.println("Droopy is a "+droopy.getAge()+" year old "+droopy.getBreed()+" and is he dangerous: "+droopy.getDanger());
        System.out.println("Scooby is a "+scooby.getAge()+" year old "+scooby.getBreed()+" and is he dangerous: "+scooby.getDanger());
    }
}    