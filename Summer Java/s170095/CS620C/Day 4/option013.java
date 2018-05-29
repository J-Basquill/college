/* James Basquill
No number as yet*/

import java.util.Scanner;

public class option013
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		System.out.println("Please enter your address");
		String address = sc.nextLine();
		System.out.println("Please enter your date of birth");
		String dob = sc.nextLine();
		System.out.println("Please enter your salary");
		String salary = sc.nextLine();
		
		System.out.println("Hi "+name+"\nYour date of birth is "+dob+"\nYou live at "+address+"\nYou earn "+salary);
		
	}
}