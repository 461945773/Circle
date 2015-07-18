package test;

import junit.framework.TestCase;
import mid.Pointf;

public class TestPointf extends TestCase {
	public void testAll() {
		Pointf p = new Pointf(11.2f, 12.12f);
		assertEquals("error P->x", 11.2f, p.getX());
		assertEquals("error P->y", 12.12f, p.getY());
		assertEquals("error P->distance", 5f, Pointf.distance(new Pointf(1, 1), new Pointf(4, 5)));
	}
	public void testMidBetween(){
		Pointf a = new Pointf(10, 25);
		Pointf b = new Pointf(40, 125);
		assertEquals(25f, Pointf.midBetween(a, b).getX());
		assertEquals(75f, Pointf.midBetween(a, b).getY());
	}
}
