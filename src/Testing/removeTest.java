package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Buryk.Oleksandr.ArrayList;

public class removeTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		ArrayList<Integer> arrayRemoving = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			arrayRemoving.add(i);
		}

		int index = 1;

		int ouput = test.removing(arrayRemoving, index);

		assertEquals(1, ouput);

	}

}
