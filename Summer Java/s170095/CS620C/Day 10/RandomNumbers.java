public class RandomNumbers {

	public static void main(String [] args){
	
	int result = 0;
	
	.
	for (int i=1;i<=100;i++){
	
	    // Generate a random number between one and 10
	    // (int) is a recasting of the returned value of the Math.random()
	    // function
		result = (int)(Math.random()*10 + 1);
		System.out.println(result);
	}
	
	} // end main method.


} // end RandomNumbers