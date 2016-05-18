package junit_workspace;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
	String message = "hello world";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		message = "new world";
		assertEquals(message, messageUtil.printMessage());
	}
}
