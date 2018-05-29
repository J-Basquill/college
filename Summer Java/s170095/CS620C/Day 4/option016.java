/* James Basquill
No number as yet*/

public class option016
{
	public static void main(String[] args)
	{
		int totalSeconds = 9800;		//Declare input named totalSeconds
		int hr = totalSeconds/60/60;		//Declare and calculate hours
		int min = totalSeconds/60%60;		//Declare and calculate minutes
		int sec = totalSeconds%60;		//Declare and calculate seconds
		

		System.out.println("The number of hours, minutes, and seconds in "+totalSeconds+" is "+hr+":"+min+":"+sec);
		
		
	}
}