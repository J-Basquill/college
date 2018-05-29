package cs265;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CS265B_Lab_Week08_SportsClubTest {

	@Test
	  public void calculateFee1(){
		  int expectedValue = 0;
		  assertEquals(expectedValue, CS265B_Lab_Week08_SportsClub.calculateFee(5, -1));
	  }
	@Test
	  public void calculateFee2(){
		  int expectedValue = 0;
		  assertEquals(expectedValue, CS265B_Lab_Week08_SportsClub.calculateFee(70, 65));
	  }
	@Test
	  public void calculateFee3(){
		  int expectedValue = 300;
		  assertEquals(expectedValue, CS265B_Lab_Week08_SportsClub.calculateFee(40, 2));
	  }
	@Test
	  public void calculateFee4(){
		  int expectedValue = 270;
		  assertEquals(expectedValue, CS265B_Lab_Week08_SportsClub.calculateFee(40, 5));
	  }
}
