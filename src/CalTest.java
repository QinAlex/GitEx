import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalTest {

	@Test
	public void testAdd() {
		Add a1 = new Add(2,3);
		assertEquals(5,a1.AddCal());
	}
	
	@Test
	public void testSub1() {
		Add a1 = new Add(2,3);
		assertEquals(-1,a1.SubCal());
	}
	
	@Test
	public void testSub2() {
		Add a1 = new Add(3,2);
		assertEquals(1,a1.SubCal());
	}
	


}