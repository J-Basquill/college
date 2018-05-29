/* James Basquill
No number as yet*/

import java.util.Scanner;

public class lab106
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of array");
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		
		int max = 0;
		int maxindex = 0;
		
		
		
		for(int i=0; i<arraySize; i++)
		{
			System.out.print("Please enter value for index "+i+" : ");
			array[i] = sc.nextInt();
			
			if(array[i]>max)
			{
				max = array[i];
				maxindex = i;
			}
		}
		
		System.out.println("The highest value entered is "+max+" in index "+maxindex+"\n");
		
		
		System.out.print("The indices at which 5 can be found are");
		for(int i=0; i<arraySize; i++)
		{
			if(array[i]==5)
			{
				System.out.print("\t"+i);
			}
		}
	}
}
