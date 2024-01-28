/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
package edu.umn.foo;

import static org.junit.Assert.*;
import org.Junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest {
	
	@Test
	public void testMain() {
		String input = "1\n2\n3\n"; //Input for sides 1,2,3
		
		ByteArrayInputStream in =
				new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		//invoke
		String[] args = {};
		Demo.main(args);
		
		//(expected) output
        String consoleOutput = "Enter side 1: \nEnter side 2: \nEnter side 3: \nThis is a triangle.\n";
        assertEquals(consoleOutput, out.toString());
    }
		
	
		@Test
		public void TestIsTriangle() {
			// Test with valid sides for a triangle
			assertTrue(Demo.isTriangle(3,4,5));
			 
			// Test with invalid sides for a triangle
	        assertFalse(Demo.isTriangle(1, 1, 3));

	        // Test with negative sides
	        assertFalse(Demo.isTriangle(-4, 2, 5));

	        // Test with zero as a side
	        assertFalse(Demo.isTriangle(0, 2, 3));
	}

}
