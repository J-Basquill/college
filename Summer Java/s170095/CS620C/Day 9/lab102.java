/* James Basquill
17186285*/

public class lab102
{
	public static void main(String[] args)
	{
		int[] numbers = {2,10,0,5,17,8,10,23,9};	//declare array
		int search = 20;
		boolean flagSearch = searchArray(numbers,search);
		if(flagSearch==true)
		{
			System.out.println(search+" is in the array");
		}
		else
		{
			System.out.println(search+" is not in the array");  
		}
	}
	
	public static boolean searchArray(int[]array, int x)	//method for summing arrays
	{
		boolean flag = false;
		//return flag;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==x)
			{
				flag = true;
				break;
			}
			else
			{
				flag = false;
				
			}
		}
		return flag;
	}
}