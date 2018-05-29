/*James Basquill
17186285*/
import java.util.Scanner;
public class starRectangle
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Please enter the number of columns");
		int cols = sc.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			System.out.println();
			for(int j=0;j<cols;j++)
			{
				System.out.print("*");
			}
		}
	}
}