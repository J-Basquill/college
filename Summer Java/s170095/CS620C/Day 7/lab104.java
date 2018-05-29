/* James Basquill
No number as yet*/

public class lab104
{
	public static void main(String[] args)
	{
		printFirstInitial("James Basquill");	//method call
	}
	public static void printFirstInitial(String input)	//method declaration with String input
	{
		System.out.println("The first letter of the input is "+input.charAt(0));	//print message with String method call
	}
}