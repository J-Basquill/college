

import java.util.Scanner;

public class StringProcessingUserInput
{
    public static void main(String [] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the String you want repeated ");
        String myStr = myScanner.nextLine();
        
        System.out.println("Please enter the number of times you wanted it repeated : ");
        int myNum = myScanner.nextInt();
        
        System.out.println("Welcome: About to call a method");
        writeString(myStr,myNum);
        System.out.println("Goodbye");
        
    }
    
     /**
     * This method prints a message to the screen a number of times.
     *<p>usage: writeString("word",10) </p>
     *<p>This call writes the string "word" to the screen ten times.
     * @param myString this is the string to be written to the screen
     * @param num the number of times to write the string to the screen.
     * @return void
     */
    public static void writeString( String myString, int num) 
    {
        int i;
        
        for(i=1;i<=num;i++){
           
            System.out.println(myString + " : " + i);
        }
    }
}