/* James Basquill
No number as yet*/


public class lab206
{
	public static void main(String[] args)
	{
		String strg = "The man who sold the world";		//declare name variable and assign it
		int len = strg.length();
		
		for(int i=0; i<len; i++)
		{
			System.out.println(strg.charAt(i));
		}
		
		for(int i=len-1; i>=0; i--)
		{
			System.out.println(strg.charAt(i));
		}
		
		System.out.println(strg.replace(" ","\n"));
		
	}
}