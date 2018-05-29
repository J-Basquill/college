/**
 * This is a demonstration of arrays of type String
 * This program shows two ways of creating an array.
 * (1) declaring and the String array type and assigning it a list of comma separated Strings surrounded by braces.
 * (2) declaring and array type of String and ask for a certain number of memory areas to stores Strings.
 * Both of these creating techniques obtain actual memory boxes from the computer system.
 * 
 * @author Joe Duffin
 * @version 08/09/2013
 */
public class SimpleArraysStrings
{
    public static void main(String args[]){
    
        // mylist will store a  machine address of a String array and then creates and
        // initialises this array. NB : This declaration has to be done all at once.
        String [] weekDays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        
        String [] myStrings = new String[3];
        
        for (int i=0; i<weekDays.length;i++)
        {
            System.out.println(weekDays[i]);
        } 
        
        // if you haven't initialised on the declaration line you must create individual String elements.
        myStrings[0] = new String ("hello");
        myStrings[1] = new String ("It's a nice day");
        System.out.println(myStrings[0]+ "  " + myStrings[1]);
        
    }
}

