public class test1
{
	public static void main(String[] args)
	{
		int n0 =258;		//Input for original number
		
		int n3 =n0%10;		//Find units
		
		int n2 =(n0/10)%10;
					//Find tens
		
		int n1 =(n0/100)%10;
					//Find hundreds
		
		System.out.println("The first digit is "+n1);
		System.out.println("The second digit is "+n2);
		System.out.println("The third digit is "+n3);
	}
}	