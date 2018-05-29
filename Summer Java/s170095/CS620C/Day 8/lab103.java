/* James Basquill
No number as yet*/

import java.util.Scanner;					//call Scanner tools

public class lab103
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);			//declare Scanner input
		int product = 1;								//declare variable to track product
		int num1 = 0;									//declare input variable
		while(product>0)								//while loop that will terminate as result of 0 being entered
		{
			System.out.print("Please enter an integer : ");
			num1 = sc.nextInt();						//assign input to variable
			product *= num1;							//calculate current product
			System.out.println("\nThe running product is "+product+"\n");
		}
	}
}