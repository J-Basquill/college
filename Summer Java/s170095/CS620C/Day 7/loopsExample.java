public class loopsExample {

	public static void main(String [] args){
	
	    /* 
			The loop counter is initialised only once on entry to the for loop.
			next the boolean expression is evaluated.
			If it is true we execute the code associated with the for loop body,
			increment the counter automatically and then go back up to the boolean
			expression.
			if it is false we by pass the loop body and execute the code after
			the loop body, and if it is true we know what to do.
			
		
		*/
		for (int i=0;i<5;i++){
		
			System.out.println("Hello World " + i);
		}
	
	
	    /* This is a set of nested for loops */
	
        for (int i=1;i<=5;i++){  // five times 
		
			for (int j=1;j<=4;j++){ // 4 stars in each line.
			
				System.out.print(" * ");
			}
			
			System.out.println(" "); // go to a new line.
		}	
	
	
	}



}