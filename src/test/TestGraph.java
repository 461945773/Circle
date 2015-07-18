package test;

import junit.framework.TestCase;
import mid.Graph;
import mid.Pointf;

public class TestGraph extends TestCase {
	public void testCtor() {
		Pointf pointfs[] = new Pointf[10];
		for (int i = 0; i < 10; i++) {
			Pointf p = new Pointf((float) Math.random(), (float) Math.random());
			pointfs[i] = p;
		}
		Graph graph = new Graph(pointfs);
		assertEquals("Graphy -> Ctor", pointfs, graph.getPointfs());
	}

	public void test_GetMid() {
		Pointf pointfs[] = new Pointf[3];
		pointfs[0] = new Pointf(1, 1);
		pointfs[1] = new Pointf(1, 4);
		pointfs[2] = new Pointf(5, 4);
		Graph g = new Graph(pointfs);
		Graph.Circle c = g.new Circle();
		if (g._getMid(pointfs, c)) {
			assertEquals(3.0f, c.getMid().getX());
			assertEquals(2.5f, c.getMid().getY());
			assertEquals(true, 2.5f - 1e-5 < c.getR() && c.getR() < 2.5f + 1e-5);
		}
		pointfs = new Pointf[4];
		pointfs[0] = new Pointf(1, 1);
		pointfs[1] = new Pointf(1, 4);
		pointfs[2] = new Pointf(5, 4);
		pointfs[3] = new Pointf(1.5f, 2);
		g = new Graph(pointfs);
		c = g.new Circle();
		assertEquals(true, g._getMid(pointfs, c));
		if (g._getMid(pointfs, c)) {
			assertEquals(3.0f, c.getMid().getX());
			assertEquals(2.5f, c.getMid().getY());
			assertEquals(true, 2.5f - 1e-5 < c.getR() && c.getR() < 2.5f + 1e-5);
		}
	}
}