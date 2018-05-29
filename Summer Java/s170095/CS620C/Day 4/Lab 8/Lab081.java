/* James Basquill
No number as yet*/

import java.util.Scanner;

public class Lab081
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		//Declare scanner
		System.out.println("\nPlease enter a number >");	//User question
		int count = sc.nextInt();			//initialisation of count
		
		while(count>=1)		//count condition
		{
			System.out.println("Hello World!");
			count--;		//updater
		
		}
	}
}