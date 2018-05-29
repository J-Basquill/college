
/**
 * Write a description of class DogArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogArray
{
    public static void main(String[]args)
    {
        Dog [][] DogArray = new Dog[10][10];
        for(int r=0;r<DogArray.length;r++)
        {
            for(int c=0;c<DogArray[r].length;c++)
            {
                DogArray[r][c] = Dog();
            }
        }
        print2D(DogArray);
    }
    
    public static void print2D(Dog[][]myPrint)
    {
        for(int r=0;r<myPrint.length;r++)
        {
            System.out.println(" ");
            for(int c=0;c<myPrint[r].length;c++)
            {
                System.out.print("\t"+myPrint[r][c]);
            }
        }  
    }
}