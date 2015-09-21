package quiz2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TotalCostTest {

	@Test
	public void testTotalCost() {
		College use = new College();
		double[] lst1={0,0,0,0}; 
		double[] lst2={12500,0,0,0};
		double result =use.TotalCost(lst1);
		double result1 =use.TotalCost(lst1);
		assertEquals(0.0,result);
		assertEquals(50000,result);

	}

}
