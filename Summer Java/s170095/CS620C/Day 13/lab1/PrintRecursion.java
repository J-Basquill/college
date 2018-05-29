
/**
 * Write a description of class PrintRecursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintRecursion
{
    public static void main(String[]args)
    {
        printRecursion(4);
    }
    public static void printRecursion(int num)
    {
        if(num<1) 
        {}
        else
        {
            printRecursion(num-1);
            System.out.println(" ");
            for(int i=0;i<num;i++)
            {
                System.out.println("Rescursion in Action");
            }
            
        }
    }
}
