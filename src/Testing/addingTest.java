package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class addingTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int a=5;
		int output= test.adding(a);
		assertEquals(a, output);
	}

}
