/*
public class StringDemo 
{
    public static void main(String[] args) 
	{
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // Put original string in an 
        // Array of chars
        for (int i = 0; i < len; i++) 
		{
            tempCharArray[i] =  palindrome.charAt(i);
        } 
        
        // Reverse array of chars
        for (int j = 0; j < len; j++) 
		{
            charArray[j] = tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome = new String(charArray);
		System.out.println(palindrome);
        System.out.println(reversePalindrome);
    }
}
*/
//*/
public class StringDemo
{
    public static void main(String[] args) 
	{
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // Put original string in an 
        // Array of chars
		palindrome.getChars(0, len, tempCharArray, 0);
        
        // Reverse array of chars
        for (int j = 0; j < len; j++) 
		{
            charArray[j] = tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
//*/