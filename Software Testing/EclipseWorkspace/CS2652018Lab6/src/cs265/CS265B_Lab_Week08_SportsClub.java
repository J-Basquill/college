package cs265;

/** The class represents the code for the sports club exercise */
public class CS265B_Lab_Week08_SportsClub {
	

	/** This function is used by a sports club to automatically determine the amount of membership 
	 * fee that members must pay each year. The club is open to members aged between 6 and 65. 
	 * For members who are with the club for over 3 years, the fee is €270, otherwise the fee is €300. 
	 * Any invalid input returns a membership fee of 0. Invalid input is when an age is outside the 
	 * allowed age range (as defined previously), or the number of membership years is less than 0 
	 * or more than 59.*/	
	public static int calculateFee(int age, int memberYear){
		int fee = 0;
		if ((age < 6) || (age > 65) || (memberYear < 0) || (memberYear > 59) ){
			System.out.println("NOT VALID");
		} else {
			if (memberYear <= 3){ 
				fee = 300;
			} else {
				fee = 270;
			}
		}
		return fee; 
	}
}
