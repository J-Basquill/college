/* James Basquill
17186285*/

public class lab101
{
	public static void main(String[] args)
	{
		int[] numbers = {2,10,0,5,17,8,10,23,9};	//declare array
		int sum = addUpArray(numbers);				//method call 
		System.out.println("The sum of the elements in numbers is "+sum);
	}
	
	public static int addUpArray(int[] array)	//method for summing arrays
		{
			int result = 0;
			for(int i=0; i<array.length;i++)
			{
				result += array[i];				//sum calc
			}
			return result;						//return result for sum
		}
}