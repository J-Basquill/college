package cs265;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class CS265_Lab1Test {

  @Test
  public void method1_test1(){
	  int expectedValue = 10;
	  assertEquals(expectedValue, CS265_Lab1.method1(5, 2));
  }
  @Test
  public void method1_test2(){
	  int expectedValue = 21;
	  assertEquals(expectedValue, CS265_Lab1.method1(21, 7));
  }
  @Test
  public void method1_test3(){
	  int expectedValue = -55;
	  assertEquals(expectedValue, CS265_Lab1.method1(5, -11));
  }
  @Test
  public void method1_test4(){
	  int expectedValue = 28;
	  assertEquals(expectedValue, CS265_Lab1.method1(4, 7));
  }
  @Test
  public void method1_test5(){
	  int expectedValue = 81;
	  assertEquals(expectedValue, CS265_Lab1.method1(9, 0));
  }
  @Test
  public void method1_test6(){
	  int expectedValue = 12;
	  assertEquals(expectedValue, CS265_Lab1.method1(3, 5));
  }
}
