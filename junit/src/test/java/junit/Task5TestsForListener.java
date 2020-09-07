package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CalcTestListenerRunner.class)
public class Task5TestsForListener extends Assert {

	@Test
	public void testMultiply() {
		assertEquals(6, Calculator.multiply(2, 3));
	}
	@Test
	public void testDevide() {
		assertEquals(3, Calculator.devide(9, 3));
	}
}
