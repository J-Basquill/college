package cs265;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class AirlineSeatReservationsTest {

	@Test
	  public void seatsAvailable_test1(){
		  boolean expectedValue = false;
		  assertEquals(expectedValue, AirlineSeatReservations.seatsAvailable(50, 75));
	  }
	  @Test
	  public void seatsAvailable_test2(){
		  boolean expectedValue = true;
		  assertEquals(expectedValue, AirlineSeatReservations.seatsAvailable(50, 25));
	  }
	  @Test
	  public void seatsAvailable_test3(){
		  boolean expectedValue = false;
		  assertEquals(expectedValue, AirlineSeatReservations.seatsAvailable(-100, 25));
	  }
	  @Test
	  public void seatsAvailable_test4(){
		  boolean expectedValue = false;
		  assertEquals(expectedValue, AirlineSeatReservations.seatsAvailable(200, 75));
	  }
	  @Test
	  public void seatsAvailable_test5(){
		  boolean expectedValue = false;
		  assertEquals(expectedValue, AirlineSeatReservations.seatsAvailable(50, -100));
	  }
	  @Test
	  public void seatsAvailable_test6(){
		  boolean expectedValue = false;
		  assertEquals(expectedValue, AirlineSeatReservations.seatsAvailable(50, 200));
	  }
}
