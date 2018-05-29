public class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle james;
		james = new Rectangle(5,3);
		int length = james.getLength();
		int breadth = james.getBreadth();
		int area = james.area();
		int perimeter = james.perimeter();
		
		System.out.println("The length of the Rectangle is "+length+", \nwith breadth equal to "+breadth+" \nSo the area equal to "+area+", \nand perimeter of "+perimeter);
	}
}