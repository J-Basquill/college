/**This is a program to test our circle class.
 * @author James Basquill
 * @author 17186285
 * @version 1.2
 */
public class CircleTest
{
	public static void main(String[] args)
	{
		Circle test = new Circle(1);
		double radius = test.getRadius();
		double area = test.area();
		double circumference = test.circumference();
		
		Circle project = new Circle(5);
		double rad2 = project.getRadius();
		double area2 = project.area();
		double cir2 = project.circumference();
		
		System.out.println("The radius of the first circle is "+radius+", \nwith area equal to "+area+", \nand circumference of "+circumference);
		System.out.println("\nThe radius of the second circle is "+rad2+", \nwith area equal to "+area2+", \nand circumference of "+cir2);
	}
}