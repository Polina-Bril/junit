package junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Ignore;

@RunWith(Parameterized.class)
public class CalculatorTestDevide extends Assert {

	private int a;
	private int b;
	private int expResult;

	public CalculatorTestDevide(int a, int b, int expResult) {
		super();
		this.a = a;
		this.b = b;
		this.expResult = expResult;
	}

	@Parameterized.Parameters
	public static Collection dataForTest() {
		return Arrays.asList(new Object[][] { { 3, 2, 1 }, 
											  { 4, 2, 2 }, 
											  { 8, 2, 4 } });
	}

	@Test
	public void testDevide() {
		assertEquals(expResult, Calculator.devide(a, b));
	}

	@Test(expected = ArithmeticException.class)
	public void testDevideByZero() {
		assertEquals(expResult, Calculator.devide(a, 0));
	}

}
