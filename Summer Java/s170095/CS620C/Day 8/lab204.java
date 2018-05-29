/* James Basquill
No number as yet*/

import java.util.Scanner;					//call Scanner tools

public class lab204
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);				//declare Scanner input
		System.out.print("Please enter some text : ");
		String strg = sc.nextLine();						//declare string input
		int mod = 0;										//declare mod variable
		
		for(int i=0;i<strg.length();i++)					//loop n times where n is the length of the string
		{
			mod = i%2;										//calculate counter mod 2
			if(mod==0)										//print if even
			{
				System.out.println(strg.toUpperCase());
			}
			else											//print if false
			{
				System.out.println(strg.toLowerCase());
			}
		}
	}
}