/*James Basquill
17186285*/
import java.util.Scanner;
public class starTriangles
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int rows = sc.nextInt();
		
		
		for(int i=0;i<rows;i++)
		{
			System.out.println();
			for(int j=-1;j<i;j++)
			{
				System.out.print("*");
			}
		}
	}
}