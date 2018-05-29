/* James Basquill
No number as yet*/

import java.util.Scanner;

public class lab508
{
	public static void main(String[] args)
	{
		boolean a8 = (9==8)&(5>2);
		System.out.println("Part (a) is "+a8);
		
		boolean b8 = ((8==7)|(8==8))|(5!=2);
		System.out.println("Part (b) is "+b8);
		
		boolean c8 = (8<10)&(10<11);
		System.out.println("Part (c) is "+c8);
		
		boolean d8 = (5>3)==(9<5);
		System.out.println("Part (d) is "+d8);
		
		System.out.println("Part (e) is "+(9+5*4/4));
		
		System.out.println("Part (f) is "+(12.0/6.0+5.0*9.0));
		
		System.out.println("Part (g) is "+(12%7/8));
		
		System.out.println("Part (h) is "+(7-3/2%1-9));
	}
}