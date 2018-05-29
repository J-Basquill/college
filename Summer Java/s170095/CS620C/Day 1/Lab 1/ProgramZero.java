public class ProgramZero
{
	public static void main(String[] args)
	{
		int number;										//declare a variable
		number = 10;									//set 10 to number
		number = 15;
		number = 15 + 5;
		number = number + 20;							//sequential execution means number is 20, thus 40
		number = number * 5;							//number is 40, thus 200
		System.out.print("The number equals "+number);		
		
		int apple;
		apple = 10;
		apple = number * apple;							//apple is set to product of apple and number
		System.out.print("The apple equals "+apple);
	}
	
}