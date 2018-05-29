/**
 * Program to test the Rectangle class created for lab
 * 
 * @author James Basquill
 * @author 17186285
 * @version 11/9/17
 */
public class RectangleArray
{
    public static void main (String[] args)
    {
        Rectangle[] labArray = new Rectangle[10];
        for(int r=0; r<labArray.length;r++)
        {
            labArray[r] = new Rectangle();
            System.out.println("Rectgangle "+r+" has length "+labArray[r].getLength()+" and width "+labArray[r].getWidth()+" and is "+labArray[r].getColour());
        }
        
    }
}
