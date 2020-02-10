import static org.junit.Assert.*;
import org.junit.*;
public class CalculatorTest{   
    Calculator calculator;
     @Before
     public void objectCreation()
     {
    	calculator=new Calculator();
     }
	@Test
	public void test() throws Exception {
		assertEquals(5,calculator.computeCalculation(2, 3, "Add"));
	}
	@Test
	public void test1() throws Exception {
		assertEquals(6,calculator.computeCalculation(2, 3, "Multiply"));
	}
	@Test
	public void test2() throws Exception {
		assertEquals(-1,calculator.computeCalculation(2, 3, "Subract"));
	}
	@Test
	public void test3() throws Exception {
		assertEquals(1,calculator.computeCalculation(3, 2, "Divide"));
	}

}
