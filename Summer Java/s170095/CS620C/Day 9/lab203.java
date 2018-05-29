/*James Basquill
17186285*/
import java.util.Scanner;
public class lab203
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int input = sc.nextInt();
		int[] array = new int[input];
		for(int i=0; i<input; i++)
		{
			array[i] = i+1;
		}
		
		
		for(int i=0;i<input;i++)
		{
			System.out.println();
			for(int j=0;j<=i;j++)
			{
				System.out.print(array[i]);
			}
		}
	}
}