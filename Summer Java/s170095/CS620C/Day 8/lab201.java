/* James Basquill
No number as yet*/

import java.util.Scanner;					//call Scanner tools

public class lab201
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);			//declare Scanner input
		System.out.print("Please enter some text : ");
		String strg = sc.nextLine();						//declare string input
		System.out.println(strg+" : "+strg.length());
	}
}