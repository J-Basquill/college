import java.util.Scanner
public class test2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int hot = 100;
		int cold = 50;
		
		System.out.print("What is the temperature? : ")
		int temp = sc.nextInt();
		
		if(temp=100)
		{
			System.out.println("Hot!");
		}
		else if(temp=50)
		{
			System.out.println("Cold!");
		}
		else if(temp>50&&temp<100)
		{
			System.out.println("Warm");
		}
		else
		{
			System.out.println("EXTREME TEMPERATURE");
		}
	}
}