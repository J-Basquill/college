import java.util.Scanner;

public class test1
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);				//create new scanner
		System.out.println("Please enter your age : ");		//question for input
		int age = sc.nextInt();								//assign input to age
		char allowEntry = (age >= 18)?'y':'n';				//ternary for allowEntry, if age is 18 or over access is allowed, otherwise it is not
		System.out.println("Access allowed :"+allowEntry);	//print result to user
    }
    
    
}
