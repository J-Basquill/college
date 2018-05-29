/* James Basquill
No number as yet*/

import java.util.Scanner;					//call Scanner tools

public class lab202
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);			//declare Scanner input
		System.out.print("Please enter some text : ");
		String strg = sc.nextLine();					//declare string input
		
		for(int i=0;i<strg.length();i++)				//loop n times where n is the length of the string
		{
			System.out.println(strg.charAt(i));			
		}
	}
}