public class lab051
{
	public static void main(String[] args)
	{
		int day = 0;	//Declare day and assign input
		String dayOfWeek = "";		//Declare string for output
		
		if(day>=1&&day<=7)			//Execute only if there is a correct input
		{
			
			if(day==1)		
			{
				dayOfWeek = "Monday";
			}
			
			if(day==2)
			{
				dayOfWeek = "Tueday";
			}
			
			if(day==3)
			{
				dayOfWeek = "Wednesday";
			}
			
			if(day==4)
			{
				dayOfWeek = "Thursday";
			}
			
			if(day==5)
			{
				dayOfWeek = "Friday";
			}
			
			if(day==6)
			{
				dayOfWeek = "Saturday";
			}
			
			if(day==7)
			{
				dayOfWeek = "Sunday";
			}
		}
		System.out.println(dayOfWeek);
		
	}
}