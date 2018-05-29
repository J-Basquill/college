/**
 * This is a class program for making squares
 * @author James Basquill
 * @author 17186285
 * @version 11/9/17
 */
public class Square extends TwoDShape
{
    /**
     * The attributes for our squares
     * @param length, the length of sides
     * @param area, the area of the square
     * @param perimeter, the perimeter of the square
     */
    private int length;
    private int area;
    private int perimeter;
    
    /**
     * The class constructor for Square 
     * @param l, the input for length
     */
    public Square(int l)
    {
        length = l;
    }
    
    public Square (int l, String shape)
    {
        super (shape);
        length = l;
    }  
    
    /**
     *  Getter method for length
     *  @return Returns current length of the square
     */
    public int getLength()
    {
        return length;
    }
    
    /**
     *  Setter method for length
     *  @param l, the updated length for Square
     */
    public void setLength(int l)
    {
        length = l;
    }
    
    /**
     *  Method to calculate area with current value for length
     */
    public int getArea()
    {
        area = length*length;
        return area;
    }
    
    /**
     *  Method to calculate perimeter with current value for length
     */
    public int getPerimeter()
    {
        perimeter = (4*length);
        return perimeter;
	}
}