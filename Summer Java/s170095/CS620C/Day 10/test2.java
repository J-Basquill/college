/* James Basquill
17186285*/


public class test2
{
	public static void main(String[] args)
	{
		int[][] myValues= 	{	{23,38,14,7	},
								{-3,0,14,4	},
								{9,13,0,3	},
							};
		int num = 56;
		print2D(myValues);
		boolean numCheck = check2D(myValues, num);
		if(numCheck==true)
		{
			System.out.println(num+" is in the array");
		}
		else
		{
			System.out.println(num+" is not in the array");
		}
		
		int sum = sum2D(myValues);
		System.out.println("\nThe sum of values is "+sum);
		
		change2D(myValues, 25);
		
		print2D(myValues);
		
		sum = sum2D(myValues);
		System.out.println("\nThe sum of values is "+sum);
		
		
	}

	public static void change2D(int[][] myList, int change)
	{
		for(int r=0;r<myList.length;r++)
		{
			for(int c=0;c<myList[r].length;c++)
			{
				myList[r][c] = change;
			}
		}
	}
	
	public static void print2D(int[][] myPrint)
	{
		for(int r=0;r<myPrint.length;r++)
		{
			System.out.println("");
			for(int c=0;c<myPrint[r].length;c++)
			{
				System.out.print(myPrint[r][c]+"\t");
			}
		}
	}
	
	public static boolean check2D(int[][] myPrint, int check)
	{
		boolean flag = false;
		for(int r=0;r<myPrint.length;r++)
		{
			for(int c=0;c<myPrint[r].length;c++)
			{
				if(myPrint[r][c] == check)
				{
					flag = true;
					return flag;
				}
			}
		}
		return flag;
	}
	
	public static int sum2D(int[][] my2D)
	{
		int sum = 0;
		for(int i=0;i<my2D.length;i++)
		{
			for(int j=0;j<my2D[i].length;j++)
			{
				sum+= my2D[i][j];
			}
		}
		return sum;
	}
}