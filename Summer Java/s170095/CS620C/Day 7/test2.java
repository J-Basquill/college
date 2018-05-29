public class test2
{
    public static void main(String args[])
    {
		int result = timesTwo(3);		//declare result and call method
		System.out.println(result);
    }
    
    public static int timesTwo(int input)	//method for doubling input
    {	
        return input*2;						//return command to send result back to main
		
    }
}