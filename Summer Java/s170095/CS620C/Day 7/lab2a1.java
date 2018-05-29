/* James Basquill
No number as yet*/

public class lab2a1
{
	public static void main(String[] args)
	{
		int[] numList = {5,6,3,0,1,19,22,8};
		int len = numList.length;
		System.out.println("The array is as follows");
		for(int i=0;i<len;i++)
		{
			System.out.print(numList[i]+" ");
			numList[i]+=10;
		}
		System.out.println("\nThe array is now as follows");
		for(int i=0;i<len;i++)
		{
			System.out.print(numList[i]+" ");
		}
	}
}