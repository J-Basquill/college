/* James Basquill
No number as yet*/

import java.util.Scanner;

public class lab507
{
	public static void main(String[] args)
	{
		int number = 0;		//declaring input
		float sum = 0;		//declaring sum of inputs
		Scanner sc = new Scanner(System.in);		//adding scanner
		
		while(number>=0)		//loop until negative entry
		{
			sum += number;		//Sum up all entered numbers
			System.out.println("Please enter a number >");	//Ask for number
			number = sc.nextInt();			//assign input to number
		}
		float average = sum/2;			//calculation for average
		System.out.println("The average of all your positive numbers is "+average);
			
	}
}	