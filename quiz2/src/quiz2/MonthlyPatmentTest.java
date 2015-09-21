package quiz2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonthlyPatmentTest {

	@Test
	public void testMonthlyPayment() {
		College use = new College();
		double result =use.MonthlyPayment(0,0);
		double result1 =use.MonthlyPayment(50000,12.99);
		assertEquals(0.0,result);
		assertEquals(1176.98,result);

	}

}
