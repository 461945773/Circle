package test;

import junit.framework.TestCase;
import mid.Pointf;
import mid.Triangle;

public class TestTriangle extends TestCase {
	public void testR() {
		for (int i = 0; i < 10; i++) {
			float rand = (float) Math.random();
			Triangle t = new Triangle(new Pointf(0 + rand, 3 + rand), new Pointf(0 + rand, -3 + rand),
					new Pointf(3 + rand, 0 + rand));
			assertEquals("error Triangle->getR", 3f, t.getR());
		}
	}

	public void testMid(){
    	for(int i = 0;i<10;i++){
    		Triangle t = new Triangle(new Pointf(1,1),new Pointf(1, 4),new Pointf(5, 4));
            assertEquals("error Triangle->getMid",3f,t.getMid().getX());
            assertEquals("error Triangle->getMid",2.5f,t.getMid().getY()); 
    	}
    }
	
	public void testDraw(){
		System.out.println("Draw a circle");
	}
}