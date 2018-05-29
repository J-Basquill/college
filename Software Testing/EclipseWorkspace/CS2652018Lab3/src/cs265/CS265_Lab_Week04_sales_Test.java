package cs265;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class CS265_Lab_Week04_sales_Test {

	@Test
	  public void saleRate_test1(){
		  double expectedValue = 0.06;
		  assertEquals(expectedValue, CS265_Lab_Week04.saleRate(75, true, true));
	  }
	@Test
	  public void saleRate_test2(){
		  double expectedValue = 0.06;
		  assertEquals(expectedValue, CS265_Lab_Week04.saleRate(75, false, true));
	  }
	@Test
	  public void saleRate_test3(){
		  double expectedValue = 0.04;
		  assertEquals(expectedValue, CS265_Lab_Week04.saleRate(75, false, false));
	  }
	@Test
	  public void saleRate_test4(){
		  double expectedValue = 0.04;
		  assertEquals(expectedValue, CS265_Lab_Week04.saleRate(25, true, true));
	  }
	@Test
	  public void saleRate_test5(){
		  double expectedValue = 0.02;
		  assertEquals(expectedValue, CS265_Lab_Week04.saleRate(25, true, false));
	  }
	@Test
	  public void saleRate_test6(){
		  double expectedValue = 0.02;
		  assertEquals(expectedValue, CS265_Lab_Week04.saleRate(25, false, true));
	  }
	@Test
	  public void saleRate_test7(){
		  double expectedValue = 0.00;
		  assertEquals(expectedValue, CS265_Lab_Week04.saleRate(25, false, false));
	  }
}
