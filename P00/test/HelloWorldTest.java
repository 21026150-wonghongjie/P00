import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void findMaxTest1() {
		//fail("Not yet implemented");
		//System.out.println("This is the testcase for HelloWorld");
        //String str1="This is the testcase for HelloWorld";
        //String str2="This is the testcase for HelloWorld";
        //assertEquals(str1, str2);
		int[] arrB = {-11,-3,-1,-2, -4};
		assertEquals("test if the biggest integer is -1", -1, HelloWorld.findMax(arrB));

	}

}
