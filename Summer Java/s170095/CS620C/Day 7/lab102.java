/* James Basquill
No number as yet*/

public class lab102
{	
	public static void main(String[] args)
	{
		int count = 1;
		while(count<=7)
		{
			System.out.print(count+" : ");
			printWarningMessage();	//method call
			count++;		//while updater
		}
	}
	public static void printWarningMessage()	//Warning message print 
	{
		System.out.println("This is a warning message");
	}
}