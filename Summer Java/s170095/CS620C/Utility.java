public class Utility
{
	public static void main(String[] args)
	{
		
	}
	
	/**
	* Method to square the input
	*@param a, Number to be squared
	*@return Returns the value of the input squared
	*/
	public static int square(int a)	
	{
		int result = a*a;		
		return result;		
	}
	
	/**
	* Method to double the input
	*@param input, Number to be doubled
	*@return Returns doubled input
	*/
	 public static int timesTwo(int input)	
    {	
        return input*2;						
    }
	
	/**
	* Method to sum three numbers
	*@param a,b,c, the numbers to be added together
	*@return Returns the sum of the parameters
	*/
	public static int addThreeNumbers(int a,int b,int c)
	{
		return (a+b+c);
	}
	
	/** Method to print a string a particular number of times
	*@param a, the number of times to print
	*@param strg, the string to be printed
	*/
	public static void printManyTimes(int a, String strg)
	{
		for(int i=0;i<a;i++)
		{
			System.out.println(strg);
		}
	}
	
	public static double getAverage(double a, double b)
	{
		return (a+b)/2;
	}
	
	public static int mySigma(int a)
	{
		int result = 0;
		for(int i=a; i>0;i--)
		{
			result += i;
		}
		return result;
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