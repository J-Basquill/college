
/**
 * Write a description of class TerenerayTest here.
 * 
 * @author Joe Duffin 
 * @version 15-9-2013
 */
public class TernaryTest
{
    public static void main(String args[]){
    
       int x = (5 < 10)? 17 : 99 ;
       
       /*
        * x is assigned a value of either 17 or 99. How do we determine which one it is?
        * The left hand side of the ":" is what happens if the boolean condition is true
        * The right hand side of the ":" is what happens if the boolean condition is false
        * 
        * int x takes on the value 17 or 99. If the boolean condition is true then x 
        * takes on the value of 17.
        * if the boolean condition is false then x takes on the value 99.
        * In this case the boolean condition (5<10) is true so x is assigned the value on 
        * the left hand side of the ":" which is 17.
        * 
        */
       
       System.out.println("The value of the variable is " + x);
       
       /* Another example
        * 
        * the variable gateSign will take on the value 'y' if the boolean expression (count > 100) 
        * is true and it will take on the value 'n' if the boolean expression (count > 100) is false.
        * In this case (count > 100) evaluates to false so the gateSign variable evaluates to false.
        * 
        */
       
       int count = 25;
       
       char gateSign = (count > 100)? 'y' : 'n';
       
       
       System.out.println(" The status of the flag is --> " + gateSign);
       
    }
    
    
}
