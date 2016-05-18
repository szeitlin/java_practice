package junit_workspace;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.notification.Failure;

public class TestRunner {
	public static void main(String [] args) {
		Result result = JUnitCore.runClasses(TestJunit.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
