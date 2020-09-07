package junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class CalculatorTestMultiply extends Assert {
	private int a;
	private int b;
	private int expResult;

	public CalculatorTestMultiply(int a, int b, int expResult) {
		super();
		this.a = a;
		this.b = b;
		this.expResult = expResult;
	}

	@Parameterized.Parameters
	public static Collection dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 2, 2 }, 
											  { 4, 5, 20 }, 
											  { 7, 8, 56 } });
	}

	@Test
	public void testMultiply() {
		assertEquals(expResult, Calculator.multiply(a, b));
	}
}
