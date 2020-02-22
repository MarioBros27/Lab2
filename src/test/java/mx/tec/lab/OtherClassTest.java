package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherClassTest {

	@Test
	public void testMultiply() {
		OtherClass ot = new OtherClass();
		int correctAns = 12;
		int calculatedValue = ot.multiply(3, 4);
		assertEquals(correctAns, calculatedValue, "multiplication wrong calculated");
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		OtherClass ot = new OtherClass();
		try {
	    	ot.multiply(20000,2);
	        fail("Exception not thrown");
	    } catch (UnsupportedOperationException e) {
	        assertEquals("X should be less than 1000", e.getMessage());
	    }
	}


}
