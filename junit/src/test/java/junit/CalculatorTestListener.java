package junit;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

	boolean flag = true;

	@Override
	public void testFailure(Failure failure) throws java.lang.Exception {
		flag = false;
	}

	@Override
	public void testFinished(Description description) throws Exception {
		if (flag) {
			System.out.println("The name of the Method : " + description.getMethodName());
		} else {
			flag = true;
			return;
		}
	}
}
