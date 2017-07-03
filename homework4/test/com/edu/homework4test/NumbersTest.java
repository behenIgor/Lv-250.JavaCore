package com.edu.homework4test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.edu.homework4.Numbers;

public class NumbersTest {
	
	@Test
	public void testGetHTTPError() {
		assertTrue(Numbers.getHTTPError(402) == "PaymentRequired");
		assertTrue(Numbers.getHTTPError(654897654) == "UnidentifiedError");
	}

}
