/* James Basquill
No number as yet*/


public class lab205
{
	public static void main(String[] args)
	{
		String strg1 = "What a nice day";		//declare name variable and assign it
		String strg2 = "no it is not";			//declare number variable and assign it
		
		int len1 = strg1.length();		//declare and assign the length of string 1
		int len2 = strg2.length();		//declare and assign the length of string 2
		System.out.println("The length of strg1 is "+len1);
		System.out.println("The length of strg2 is "+len2+"\n");
		
		int n = 2;		//declare variable of the character to be investigated
		System.out.println("The character in index "+n+" is "+strg1.charAt(n-1)+"\n");
		
		System.out.println(strg1.toLowerCase());		//print all to lower case
		System.out.println(strg2.toUpperCase()+"\n");	//print all to upper case
		
		System.out.println(strg1.replace("n","m"));		//replace all instances of n with m
		
		System.out.println(strg1.substring(5));
	}
}