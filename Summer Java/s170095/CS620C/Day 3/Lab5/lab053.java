public class lab053
{
	public static void main(String[] args)
	{
		int test = 1334657;			//declare test and assign input
		System.out.println("The number "+test+" broken down is:");
		
		while(test>0)		//loop mod function while input is greater than 0
		{
			System.out.println(test%10);
			test = test/10;
		}
		
		System.out.println("Goodbye!");
	}

}