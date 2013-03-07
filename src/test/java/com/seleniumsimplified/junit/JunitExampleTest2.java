package test.java.com.seleniumsimplified.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitExampleTest2 {
	@Test
	public void twoPlusTwoEqualsFour (){
		assertEquals("2+2=4", 4, 2 + 2);

	}

}
