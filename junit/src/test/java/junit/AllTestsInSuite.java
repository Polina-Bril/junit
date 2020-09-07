package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTestDevide.class, CalculatorTestMultiply.class, CalculatorTestSum.class })
public class AllTestsInSuite {

}
