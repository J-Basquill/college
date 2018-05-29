/* James Basquill
No number as yet*/

import java.util.Random;

public class lab207
{
	public static void main(String[] args)
	{
		int random = 0;
		Random rand = new Random();
		for(int i=0;i<1000;i++)
		{
			random = rand.nextInt(100);
			if(random>50)
			{
				System.out.println(i+". "+random+" is greater than 50");
			}
			else if(random<50)
			{
				System.out.println(i+". "+random+" is less than 50");
			}
		}
	}
}