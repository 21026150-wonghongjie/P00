import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		int actual = cal.divide(a, b);
		
		int expected = 3;
		assertEquals(expected, actual);
		
	}

}
