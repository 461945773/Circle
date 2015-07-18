package test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mid.Graph;
import mid.Pointf;
import mid.Triangle;
import mid.Graph.Circle;
import mid.Mid;

import java.awt.Color;
import java.awt.Graphics;

public class DrawnTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrawnTest() {
		setTitle("Graphy Test");
		getContentPane().add(new ArcsPanel());
	}

	public static void main(String[] args) {
		DrawnTest frame = new DrawnTest();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

class ArcsPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// protected void paintComponent(Graphics g) {
	// super.paintComponent(g);
	// g.setColor(Color.BLUE);
	// Triangle t = new Triangle(new Pointf((float) Math.random() * 200, (float)
	// Math.random() * 200),
	// new Pointf((float) Math.random() * 200, (float) Math.random() * 200),
	// new Pointf((float) Math.random() * 200, (float) Math.random() * 200));
	// // Triangle t = new Triangle(new Pointf(100,100),new Pointf(100,
	// // 400),new Pointf(500, 400));
	// g.fillRect((int) t.getA().getX() - 2, (int) t.getA().getY() - 2, 4, 4);
	// g.fillRect((int) t.getB().getX() - 2, (int) t.getB().getY() - 2, 4, 4);
	// g.fillRect((int) t.getC().getX() - 2, (int) t.getC().getY() - 2, 4, 4);
	// g.drawOval((int) (t.getMid().getX() - t.getR()), (int) (t.getMid().getY()
	// - t.getR()), (int) t.getR() * 2,
	// (int) t.getR() * 2);
	// }

	// protected void paintComponent(Graphics g) {
	//
	// super.paintComponent(g);
	// g.setColor(Color.BLUE);
	//
	// Pointf[] pointfs = new Pointf[4];
	// // pointfs[0] = new Pointf(100, 100);
	// // pointfs[1] = new Pointf(100, 400);
	// // pointfs[2] = new Pointf(500, 400);
	// // pointfs[3] = new Pointf(150, 200);
	// for (int i = 0; i < pointfs.length; i++) {
	// pointfs[i] = new Pointf((float) Math.random() * 100, (float)
	// Math.random() * 100);
	// }
	// Graph graph = new Graph(pointfs);
	// Graph.Circle c = graph.new Circle();
	// if (graph._getMid(pointfs, c)) {
	// for (int i = 0; i < pointfs.length; i++) {
	// g.fillRect((int) pointfs[i].getX() - 2, (int) pointfs[i].getY() - 2, 4,
	// 4);
	// System.out.println(pointfs[i]);
	// }
	// g.drawOval((int) (c.getMid().getX() - c.getR()), (int) (c.getMid().getY()
	// - c.getR()), (int) c.getR() * 2,
	// (int) c.getR() * 2);
	// }
	// }

	// protected void paintComponent(Graphics g) {
	//
	// super.paintComponent(g);
	// g.setColor(Color.BLUE);
	//
	// Pointf[] pointfs = new Pointf[4];
	// for (int i = 0; i < pointfs.length; i++) {
	// pointfs[i] = new Pointf((float) Math.random() * 100, (float)
	// Math.random() * 100);
	// }
	// Graph graph = new Graph(pointfs);
	// Graph.Circle c = graph.new Circle();
	// Pointf maxP = graph.findFarthest(graph.getNousepointfs(), c);
	// g.fillRect((int) maxP.getX() - 4, (int) maxP.getY() - 4, 8, 8);
	// g.fillRect((int) c.getMid().getX() - 4, (int) c.getMid().getY() - 4, 8,
	// 8);
	// if (graph._getMid(pointfs, c)) {
	// for (int i = 0; i < pointfs.length; i++) {
	// g.fillRect((int) pointfs[i].getX() - 2, (int) pointfs[i].getY() - 2, 4,
	// 4);
	// System.out.println(pointfs[i]);
	// }
	// g.drawOval((int) (c.getMid().getX() - c.getR()), (int) (c.getMid().getY()
	// - c.getR()), (int) c.getR() * 2,
	// (int) c.getR() * 2);
	// }
	// }
	// protected void paintComponent(Graphics g) {
	//
	// super.paintComponent(g);
	// g.setColor(Color.BLUE);
	//
	// Pointf[] pointfs = new Pointf[10];
	// for (int i = 0; i < pointfs.length; i++) {
	// pointfs[i] = new Pointf((float) Math.random() * 100, (float)
	// Math.random() * 100);
	// }
	// Graph graph = new Graph(pointfs);
	// Graph.Circle c = graph.new Circle();
	// c = graph.getMid();
	// for (int i = 0; i < pointfs.length; i++) {
	// g.fillRect((int) pointfs[i].getX() - 2, (int) pointfs[i].getY() - 2, 4,
	// 4);
	// }
	// g.drawOval((int) (c.getMid().getX() - c.getR()), (int) (c.getMid().getY()
	// - c.getR()), (int) c.getR() * 2,
	// (int) c.getR() * 2);
	// }
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.BLUE);

		Pointf[] pointfs = new Pointf[10];
		for (int i = 0; i < pointfs.length; i++) {
			pointfs[i] = new Pointf((float) Math.random() * 100, (float) Math.random() * 100);
		}
		for (int i = 0; i < pointfs.length; i++) {
			g.fillRect((int) pointfs[i].getX() - 2, (int) pointfs[i].getY() - 2, 4, 4);
		}
		Mid m = new Mid(pointfs);
		Pointf p = m.getPoint();
		g.fillRect((int) p.getX() - 4, (int) p.getY() - 4, 8, 8);
	}
}