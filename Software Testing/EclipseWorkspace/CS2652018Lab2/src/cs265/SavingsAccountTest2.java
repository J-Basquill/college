package cs265;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class SavingsAccountTest2 {

	@Test
	  public void discountRate_test1(){
		  double expectedValue = 0;
		  assertEquals(expectedValue, SavingsAccount.discountRate(Integer.MIN_VALUE), 0.0001);
	  }
	@Test
	  public void discountRate_test2(){
		  double expectedValue = 0;
		  assertEquals(expectedValue, SavingsAccount.discountRate(0), 0.0001);
	  }
	@Test
	  public void discountRate_test3(){
		  double expectedValue = 0.03;
		  assertEquals(expectedValue, SavingsAccount.discountRate(1), 0.0001);
	  }
	@Test
	  public void discountRate_test4(){
		  double expectedValue = 0.03;
		  assertEquals(expectedValue, SavingsAccount.discountRate(100), 0.0001);
	  }

	@Test
	  public void discountRate_test5(){
		  double expectedValue = 0.05;
		  assertEquals(expectedValue, SavingsAccount.discountRate(101), 0.0001);
	  }
	@Test
	  public void discountRate_test6(){
		  double expectedValue = 0.05;
		  assertEquals(expectedValue, SavingsAccount.discountRate(1000), 0.0001);
	  }
	@Test
	  public void discountRate_test7(){
		  double expectedValue = 0.07;
		  assertEquals(expectedValue, SavingsAccount.discountRate(1001), 0.0001);
	  }
	@Test
	  public void discountRate_test8(){
		  double expectedValue = 0.07;
		  assertEquals(expectedValue, SavingsAccount.discountRate(Integer.MAX_VALUE), 0.0001);
	  }
}
