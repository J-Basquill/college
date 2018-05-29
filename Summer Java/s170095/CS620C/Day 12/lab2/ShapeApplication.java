
/**
 * Write a description of class ShapeApplication here.
 * 
 * @author James Basquill
 * @author 17186285
 * @version 13/09/17
 */
public class ShapeApplication
{
    public static void main(String[]args)
    {
        Circle myCircle = new Circle(5);
        String shapeCategory = myCircle.getShapeType();
        System.out.println("The Circle shape has a parent class described as : "+shapeCategory);
    }
}
