/* James Basquill
No number as yet*/


public class lab103
{
	public static void main(String[] args)
	{
		int[] array = {5,60,4,54,30,20,9};	//declare and assign array 
		int sum = 0;
		
		for(int i=0; i<7; i++)		//loop i through each index
		{
			sum += array[i];		//sum calc
			
			if(array[i]>50)		//branch for each index entry greater than 50
			{
				System.out.println("Index "+i+", "+array[i]+", is greater than 50");
			}
		}
		System.out.println("The sum of the array is "+sum);
		
		
		
		
		
	}
}