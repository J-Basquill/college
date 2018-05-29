/* James Basquill
No number as yet*/

public class option201
{
	public static void main(String[] args)
	{
		int input = 0;
		int test = input;
		
		while(input<=100)
		{
			input++;
			test = input%2;
			if(test==0)
			{
				System.out.println(input+" is even");
			}
			else 
			{
				System.out.println(input+" is odd");
			}
		}
		
		
			
	}
}