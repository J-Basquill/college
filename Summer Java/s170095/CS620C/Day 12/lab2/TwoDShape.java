
/**
 * 2D Shapes
 * 
 * @author James Basquill
 * @author 17186285
 * @version 12/9/17
 */
public class TwoDShape
{
   private String shapeType;
    /**
     * Default constructor for objects of class TwoDShape
     */
    public TwoDShape()
    {
        shapeType = "Two dimensional shape";
    }
    /**
     * Constructor for objects of class TwoDShape
     */
    public TwoDShape(String a)
    {
        shapeType = a;
    }

    /**
     * Getter method for shapeType
     * @return     The shape type
     */
    public String getShapeType()
    {
        return shapeType;
    }
    
    /**
     * Setter method for shapeType
     * @param a, the new shapeType
     */
    public void setShapeType(String a)
    {
        shapeType = a;
    }    
}
