package junit_workspace;
import junit.framework.*;

public class JunitTestSuite {
	public static void main(String[] a) {
		// add the tests in the suite
		TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("number of test cases =" + result.runCount());
	}
}
