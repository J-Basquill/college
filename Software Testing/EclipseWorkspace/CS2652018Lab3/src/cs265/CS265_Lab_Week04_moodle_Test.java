package cs265;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class CS265_Lab_Week04_moodle_Test {

	@Test
	  public void doMoodleLogon_test1(){
		  String expectedValue = "STUDENT PAGE";
		  assertEquals(expectedValue, CS265_Lab_Week04.doMoodleLogon("qwerty.@nuim.ie", "password", true));
	  }
	@Test
	  public void doMoodleLogon_test2(){
		  String expectedValue = "STAFF PAGE";
		  assertEquals(expectedValue, CS265_Lab_Week04.doMoodleLogon("qwerty.@nuim.ie", "password", false));
	  }
	@Test
	  public void doMoodleLogon_test3(){
		  String expectedValue = "UNKNOWN";
		  assertEquals(expectedValue, CS265_Lab_Week04.doMoodleLogon("qwerty.@nuim.ie", "", false));
	  }
	@Test
	  public void doMoodleLogon_test4(){
		  String expectedValue = "UNKNOWN";
		  assertEquals(expectedValue, CS265_Lab_Week04.doMoodleLogon("qwerty.nuim.ie", "password", true));
	  }
}
