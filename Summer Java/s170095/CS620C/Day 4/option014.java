/* James Basquill
No number as yet*/
import java.util.Scanner;

public class option014
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the total number of seconds");
		int totalSeconds = sc.nextInt();
		int hr = totalSeconds/60/60;
		int min = totalSeconds/60%60;
		int sec = totalSeconds%60;
		

		System.out.println("The number of hours, minutes, and seconds in "+totalSeconds+" is "+hr+":"+min+":"+sec);
		
		
	}
}