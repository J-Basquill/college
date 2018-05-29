/* James Basquill
No number as yet*/

//import java.util.Scanner;					//call Scanner tools

public class test1
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);			//declare Scanner input
		//System.out.print("Please enter a number you would like to be squared : ");
		//int n1 = sc.nextInt();						//declare test variable
		
		
		int num = 25;											//declare and assign number to be assigned to all indices
		int[] valuesPrime = {37,56,25,14,10,30,28,97,54,21};	//declare test array
		printArray(valuesPrime);								//method call to print the array
		changeArray(valuesPrime,num);							//method call to change number in the array
	}
	
	
	public static void changeArray(int []values, int x)	//method signature
	{
		for(int i=0;i<values.length;i++)						//loop for reassigning array indices
		{
			values[i] = x;
		}
		printArray(values);										//method call to print new values
	}
	
	
	public static void printArray(int [] print)					//method signature
	{
			System.out.println("\n Array is ");		
		for(int i=0;i<print.length;i++)						
		{
			System.out.print(print[i]+" ");
		}
	}
}