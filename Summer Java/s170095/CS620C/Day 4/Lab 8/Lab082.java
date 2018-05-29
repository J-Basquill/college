/* James Basquill
No number as yet*/

import java.util.Scanner;	//call toolbox

public class Lab082
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		//declare new scanner
		System.out.println("Please enter a number for which \nyou would like the factorial");	//user question
		int n1 = sc.nextInt();			//declaring query
		int fact = 1;					//declaring result
		
		while(n1>=1)		//loop condition
		{
			fact *= n1;		//factorial calc
			n1--;			//updater
		}
		System.out.println("The factorial for your query is "+fact);
		
		
		
	}
}