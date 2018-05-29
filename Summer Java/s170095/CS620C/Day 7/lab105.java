/* James Basquill
No number as yet*/

import java.util.Scanner;

public class lab105
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of times you want to print the warning message :");
		int countLimit = sc.nextInt();	//sets user input to loop limiter
		int count = 1;
		while(count<=countLimit)
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