/* James Basquill
No number as yet*/

public class lab205
{
	public static void main(String[] args)
	{
		for(int outer=1; outer <=15; outer++)							//outer loop for a count of 15
		{
			System.out.println("Outer loop is on loop "+outer);			
			for(int inner=6; inner>=1; inner--)							//reverse inner loop for count of 6
			{
				System.out.println("\tInner loop is on loop "+inner);
			}
		}
	}
}