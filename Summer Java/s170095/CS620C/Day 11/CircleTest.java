public class CircleTest
{
	public static void main(String[] args)
	{
		Circle james;
		james = new Circle(1);
		double radius = james.getRadius();
		double area = james.area();
		double circumference = james.circumference();
		
		System.out.println("The radius of the circle is "+radius+", \nwith area equal to "+area+", \nand circumference of "+circumference);
	}
}