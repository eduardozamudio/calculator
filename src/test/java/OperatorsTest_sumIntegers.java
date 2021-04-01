package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.Operators;

public class OperatorsTest_sumIntegers {
	
	private Operators operator;
	
	@Before
	public void setUp() throws Exception {
		this.operator = new Operators();
	}

	@Test
	public void testSum() {
		int a = 33;
		int b = 22;
		
		assertEquals(55, this.operator.sum(a, b));
	}

}
