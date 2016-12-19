package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Buryk.Oleksandr.ArrayList;

public class gettingTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		ArrayList<Integer> arrayTesting = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayTesting.add(i);
			
		}
		
		int index=5;
		int output= test.getting(arrayTesting, index);
		assertEquals(5, output);
		
		
	}

}
