public class lab506
{
	public static void main(String[] args)
	{
		int count = 10;		//declares count
		
		while(count>=1)		//loop for 10 runs
		{
			System.out.println(count+" in a bed and the little one said,");
			if(count==1)		//print default second line except for this case
			{
				System.out.println("	'Alone at last'");
			}	
			else
			{
				System.out.println("	'Roll over, roll over'");
			}
			count--;		//updater for while loop
		}
	}
}