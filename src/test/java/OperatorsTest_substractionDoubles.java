package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.Operators;

public class OperatorsTest_substractionDoubles {

	private Operators operator;
	
	@Before
	public void setUp() throws Exception {
		this.operator = new Operators();
	}

	@Test
	public void testSubstraction() {
		double a = 55;
		double b = 33;
		
		assertEquals(22, this.operator.substraction(a,b), 0);
	}

}
