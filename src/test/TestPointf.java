package test;

import junit.framework.TestCase;
import mid.Pointf;

public class TestPointf extends TestCase{
    public void testAll(){ 
    	Pointf p = new Pointf(11.2f, 12.12f);
        assertEquals("error P->x", p.getX(), 11.2f);
        assertEquals("error P->y", p.getY(), 12.12f);
        assertEquals("error P->distance", Pointf.distance(new Pointf(1, 1), new Pointf(4, 5)), 5f);
    } 
}
