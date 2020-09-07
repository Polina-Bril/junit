package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.Assert;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.Parameterized;
import org.junit.runners.model.InitializationError;

@RunWith(Parameterized.class)
public class CalculatorTestSum extends Assert {

	private Calculator calc;

	private int a;
	private int b;
	private int expResult;

	public CalculatorTestSum(int a, int b, int expResult) {
		super();
		this.a = a;
		this.b = b;
		this.expResult = expResult;
	}

	@Parameterized.Parameters
	public static Collection dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 2, 3 }, 
											  { 4, 5, 9 }, 
											  { 7, 8, 15} });
	}

	@Before
	public void init() {
		calc = new Calculator();
	}

	@After
	public void clear() {
		calc = null;
	}

	@Test
	public void testSum() {
		assertEquals(expResult, calc.sum(a, b));
	}

}
