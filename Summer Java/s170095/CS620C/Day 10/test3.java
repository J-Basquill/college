/* James Basquill
17186285*/


public class test3
{
	public static void main(String[] args)
	{
		int mod;
		for(int i=0;i<20;i++)
		{
			mod= i%2;
			if(mod==0)
			{
				System.out.println(i+" is even");
			}
			else
			{
				System.out.println(i+" is odd");
			}
		}
	}
}