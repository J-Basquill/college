package cs265;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class SavingsAccountTest {

	@Test
	  public void discountRate_test1(){
		  double expectedValue = 0;
		  assertEquals(expectedValue, SavingsAccount.discountRate(-10), 0.0001);
	  }
	@Test
	  public void discountRate_test2(){
		  double expectedValue = 0.03;
		  assertEquals(expectedValue, SavingsAccount.discountRate(50), 0.0001);
	  }
	@Test
	  public void discountRate_test3(){
		  double expectedValue = 0.05;
		  assertEquals(expectedValue, SavingsAccount.discountRate(500), 0.0001);
	  }
	@Test
	  public void discountRate_test4(){
		  double expectedValue = 0.07;
		  assertEquals(expectedValue, SavingsAccount.discountRate(5000), 0.0001);
	  }
}
