/* James Basquill
No number as yet*/

public class lab101
{
	public static void main(String[] args)
	{
		int count = 0;		
		while(count<5)
		{
			printWarningMessage();	//method call
			count++;		//while updater
		}
	}
	public static void printWarningMessage()	//Warning message print 
	{
		System.out.println("This is a warning message");
	}
}