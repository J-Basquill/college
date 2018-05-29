
/**
 * Program to test the Rectangle class created for lab
 * 
 * @author James Basquill
 * @author 17186285
 * @version 11/9/17
 */
public class TestShapes
{
    public static void main (String[] args)
    {
        Rectangle box = new Rectangle(5, 6, "blue");
        Rectangle crate = new Rectangle(9,2, "red");
        
        System.out.println("The box is "+box.getLength()+" by "+box.getWidth()+" and is "+box.getColour());
        System.out.println("The crate is "+crate.getLength()+" by "+crate.getWidth()+" and is "+crate.getColour());
        
        box.setLength(4); box.setWidth(5); box.setColour("Green");
        
        System.out.println("The box is "+box.getLength()+" by "+box.getWidth()+" and is "+box.getColour());
        
        System.out.println("The area of the box is "+box.area()+" and the perimeter is "+box.perimeter());
        System.out.println("The area of the crate is "+crate.area()+" and the perimeter is "+crate.perimeter());
    }    
}
