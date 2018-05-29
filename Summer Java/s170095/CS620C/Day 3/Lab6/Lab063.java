/* James Basquill
No student code yet */

public class Lab063
{
	public static void main(String[] args)
	{
		int count = 0;		//declare counter and assign default
		while(count<=10)	//setting loop counter
			{
			if(count==5)	//exception for count = 5
			{
				System.out.println("The value of your loop counter is "+count);
			}
			
			else				//expected return
			{
				System.out.println("The count is "+count);
			}
			count++;
		}
		
		
		
	}
}