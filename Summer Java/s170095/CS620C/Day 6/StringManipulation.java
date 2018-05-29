public class StringManipulation 
{
	public static void main(String args[])
	{
		String str1 = "Hello World";
		String str2 = "Hello";
		String str4 = "Hello";
	   
	    // check to see if str1 contains str2, the method returns true if this is the case.
		boolean found = str1.contains(str2);
		System.out.println("String contains another string? : " + found);
		
		String str3 = "What are you doing";
		str3 = str3 + " hello";
		
		System.out.println(str3);
		
		// Generate a new message and by combining str3 with the message in quotes.
		str3 = str3.concat("---- Such a powerful function"); 
		
		System.out.println(str3);
		
		// Generate the upper case equivalent of str3 and over write str3 with the upper case version.
		str3 = str3.toUpperCase(); 
		
		System.out.println(str3);
		
		// Use the method compareTo() to to determine if two Strings are equal.
		// The method returns 0 if the two Strings are equal.
		if (str2.compareTo(str4) == 0) { 
			System.out.println("The strings are the same");
		} else { 
			System.out.println("The Strings are different");
		}
	}
}