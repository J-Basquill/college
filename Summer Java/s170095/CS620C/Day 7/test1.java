/* James Basquill
No number as yet*/

public class test1
{
	public static void main(String[] args)
	{
		int[][] array = new int[3][4];
		
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<4; c++)
			{
				array [r][c] = 99;
			}
		}
		System.out.println(array[2][4]);
	}
	
}