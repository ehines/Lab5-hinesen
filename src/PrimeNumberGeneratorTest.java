import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeNumberGeneratorTest {

	@Test
	public void testJUnit() {
		assertTrue("Just testing", true);
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbers.PrimeNumberGenerator(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(), PrimeNumbers.PrimeNumberGenerator(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(2), PrimeNumbers.PrimeNumberGenerator(3));
	}

	@Test
	public void testFour() {
		assertEquals(list(2, 3), PrimeNumbers.PrimeNumberGenerator(4));
	}

	@Test
	public void testSix() {
		assertEquals(list(2, 3, 5), PrimeNumbers.PrimeNumberGenerator(6));
	}

	@Test
	public void testEight() {
		assertEquals(list(2, 3, 5, 7), PrimeNumbers.PrimeNumberGenerator(8));
	}

	@Test
	public void testNine() {
		assertEquals(list(2, 3, 5, 7), PrimeNumbers.PrimeNumberGenerator(9));
	}

	@Test
	public void testBig() {
		assertEquals(
				list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
						53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107,
						109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167,
						173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229,
						233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283,
						293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359,
						367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431,
						433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491,
						499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571,
						577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641,
						643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709,
						719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787,
						797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859,
						863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941,
						947, 953, 967, 971, 977, 983, 991, 997, 1009, 1013,
						1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063,
						1069, 1087, 1091, 1093, 1097, 1103, 1109, 1117, 1123,
						1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201,
						1213, 1217, 1223, 1229, 1231, 1237, 1249, 1259, 1277,
						1279, 1283, 1289, 1291, 1297, 1301, 1303, 1307, 1319,
						1321, 1327), PrimeNumbers.PrimeNumberGenerator(1337));
	}

	private ArrayList<Integer> list(int... inta) {
		ArrayList<Integer> rtn = new ArrayList<Integer>();
		for (int i : inta) {
			rtn.add(i);
		}
		return rtn;
	}
}
