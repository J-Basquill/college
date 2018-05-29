/* James Basquill
No number as yet*/

import java.util.Scanner;					//call Scanner tools

public class lab203
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);			//declare Scanner input
		System.out.print("Please enter some text : ");
		String strg = sc.nextLine();					//declare string input
		
		for(int i=(strg.length()-1);i>=0;i--)			//loop n times where n is the length of the string
		{												//but in reverse!!!
			System.out.print(strg.charAt(i));	
		}
	}
}