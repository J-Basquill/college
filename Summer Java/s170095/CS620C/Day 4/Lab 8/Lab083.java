/* James Basquill
No number as yet*/

import java.util.Scanner;	//call toolbox

public class Lab083
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		//declare new scanner
		
		int count = 1;		//loop init
		while(count<=10)	//loop condition
		{	
			System.out.println("\nPlease enter a number for which \nyou would like the factorial ("+count+")");	//user question
			int n1 = sc.nextInt();			//declaring query
			long fact = 1;					//declaring result
			
			while(n1>=1)
			{
				fact *= n1;		//factorial calc
				n1--;			//updater
			}
			System.out.println("The factorial for your query is "+fact);
			count++;		//updater
		}
		
		
	}
}