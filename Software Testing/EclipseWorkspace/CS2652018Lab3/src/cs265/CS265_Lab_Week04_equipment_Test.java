package cs265;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class CS265_Lab_Week04_equipment_Test {

	@Test
	  public void equipmentInsurance_test1(){
		  int expectedValue = 20;
		  assertEquals(expectedValue, CS265_Lab_Week04.equipmentInsurance(true, true));
	  }
	@Test
	  public void equipmentInsurance_test2(){
		  int expectedValue = 10;
		  assertEquals(expectedValue, CS265_Lab_Week04.equipmentInsurance(true, false));
	  }
	@Test
	  public void equipmentInsurance_test3(){
		  int expectedValue = 10;
		  assertEquals(expectedValue, CS265_Lab_Week04.equipmentInsurance(false, true));
	  }
	@Test
	  public void equipmentInsurance_test4(){
		  int expectedValue = 5;
		  assertEquals(expectedValue, CS265_Lab_Week04.equipmentInsurance(false, false));
	  }
}
