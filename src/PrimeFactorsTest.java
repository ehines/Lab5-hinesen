import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void testJUnit() {
		assertTrue("The compiler isn't feeling well today...", true);
	}
	
	@Test
	public void testOne() {
		assertEquals(new ArrayList<Integer>(), PrimeNumbers.PrimeFactors(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeNumbers.PrimeFactors(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(3), PrimeNumbers.PrimeFactors(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list(2, 2), PrimeNumbers.PrimeFactors(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2,3), PrimeNumbers.PrimeFactors(6));
	}
	
	@Test
	public void testEight() {
		assertEquals(list(2,2,2), PrimeNumbers.PrimeFactors(8));
	}
	
	@Test
	public void testNine() {
		assertEquals(list(3,3), PrimeNumbers.PrimeFactors(9));
	}
	
	@Test
	public void testBig() {
		assertEquals(list(5,7,7,1327), PrimeNumbers.PrimeFactors(325115));
	}
	
	private ArrayList<Integer> list(int... inta) {
		ArrayList<Integer> rtn = new ArrayList<Integer>();
		for (int i : inta){
			rtn.add(i);
		}
		return rtn;
	}
}
