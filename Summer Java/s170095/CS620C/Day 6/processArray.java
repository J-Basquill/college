public class processArray {

	public static void main(String args[]){
	
	
		int [] numbers = new int[5]; // Create an int array with 5 individual boxes

        numbers[0] = 7;  // this is the first element (slot or box) in the array 
        numbers[1] = 6;
        numbers[2] = 10;
        numbers[3] = 0;
        numbers[4] = 66; // This is the fifth element in the array.		
		
		int counter = 0;
		
		while(counter <= 4) { // Printing out all the array elements using a loop
			// the loop counter is used to index the array element.
		    System.out.println("Value in numbers element [ " + counter + " ] is " + numbers[counter]);
			counter ++;
		}
		
		// You can also access a special value length to get the size of the array
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Second version of code to print the values in the array");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
        // All arrays have a value called length which can be interrogated to 
        // to determine the length of the array.
        // In the example below numbers.length is the length of the array numbers.	
		// int x = numbers.length will assign the length of this array to the variable x.
		
		counter = 0;
	
		while(counter < numbers.length){ // watch out for array index out of bounds error.
		
		    System.out.println("The value in numbers element [ " + counter + " ] is " + numbers[counter]);
			counter ++;
		}
	
	
	}





}