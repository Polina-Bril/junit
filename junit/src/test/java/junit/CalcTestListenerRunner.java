package junit;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class CalcTestListenerRunner extends BlockJUnit4ClassRunner {

	private CalculatorTestListener listener;

	public CalcTestListenerRunner(Class<CalculatorTestListener> clz) throws InitializationError {
		super(clz);
		listener = new CalculatorTestListener();
	}

	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(listener);
		super.run(notifier);
	}

}
