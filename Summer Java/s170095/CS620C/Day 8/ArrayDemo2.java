class ArrayDemo2
{
	public static void main(String args[])
	{
		int arraySize = 7;
		
		// Declare an array of length arraySize
		int array[] = new int[arraySize];
		
		// Loop up 
		for (int count=0; count < arraySize; count++)
		{
			System.out.println("array[" + count + "] = " + (count + 1) );
			
			// Write numbers into the elements for demonstration
			//array[count] = count + 1;
			
			// Store a random number into this element of the arrau
			array[count] = (int)(Math.random() * 100);
			
		}
		
		// Loop through the array and print the values
		for (int count=0;count<arraySize;count++)
		{
			System.out.println( "Value at Array[" + count + "] = " + array[count] );
		}
		
		// Print the length of the array
		System.out.println("\nLength of Array  =  " + array.length);
		
		// Try to access an element beyond the array's length
		array[8] = 10;
	}
}

