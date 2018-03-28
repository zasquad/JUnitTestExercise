package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}

	@Test
	public void testGetStartTime() {
		int expected = 0;
		int startTime = ntc.getStartTime();
		assertTrue("Start time should be " + expected, startTime == expected);
	}

	@Test
	public void testSetStartTime() {
		int expected =1;
		ntc.setStartTime(1);
		int startTime = ntc.getStartTime();
		assertTrue("Start Time should be "+ expected, startTime == expected);
	}

	@Test
	public void testGetDuration() {
		int expected = 0;
		int duration = ntc.getDuration();
		assertTrue("Duration should be " + expected, duration == expected);
	}

	@Test
	public void testSetDuration() {
		int expected =1;
		ntc.setDuration(1);
		int duration = ntc.getDuration();
		assertTrue("Duration should be "+ expected, duration == expected);
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart1() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart3() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart4() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart5() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart6() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart7() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart8() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart9() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration1() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration2() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}

	@Test
	public void testComputeChargeDiscountedStartAndDuration1() {
		double expected = 1768.0;
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStartAndDuration2() {
		double expected = 1078.48;
		ntc.setStartTime(759);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStartAndDuration3() {
		double expected = 1078.48;
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStartAndDuration4() {
		double expected = 1149.2;
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStart1() {
		double expected = 1248.0;
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStart2() {
		double expected = 1227.2;
		ntc.setStartTime(400);
		ntc.setDuration(59);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStart3() {
		double expected = 20.8;
		ntc.setStartTime(759);
		ntc.setDuration(1);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStart4() {
		double expected = 208.0;
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStart5() {
		double expected = 208.0;
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedStart6() {
		double expected = 208.0;
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedDuration1() {
		double expected = 2298.4;
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeDiscountedDuration2() {
		double expected = 2156.96;
		ntc.setStartTime(900);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeNoDiscount1() {
		double expected = 1664.0;
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeNoDiscount2() {
		double expected = 41.6;
		ntc.setStartTime(800);
		ntc.setDuration(1);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeNoDiscount3() {
		double expected = 2454.4;
		ntc.setStartTime(801);
		ntc.setDuration(59);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeNoDiscount4() {
		double expected = 2454.4;
		ntc.setStartTime(801);
		ntc.setDuration(59);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}

	@Test
	public void testComputeChargeNoDiscount5() {
		double expected = 2496.0;
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		double result = ntc.computeCharge();
		assertTrue("The result should be "+expected, result == expected);
	}
}
