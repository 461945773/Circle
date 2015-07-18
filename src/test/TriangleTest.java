package test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mid.Pointf;
import mid.Triangle;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class TriangleTest extends JFrame {
	public TriangleTest() {
		setTitle("Graphy Test");
		getContentPane().add(new ArcsPanel());
	}

	/** 主方法 */
	public static void main(String[] args) {
		TriangleTest frame = new TriangleTest();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

class ArcsPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE); // 设置弧形的颜色为蓝色
		 Triangle t = new Triangle(new Pointf((float)Math.random()*200,
		 (float)Math.random()*200),new Pointf((float)Math.random()*200,
		 (float)Math.random()*200),new Pointf((float)Math.random()*200,
		 (float)Math.random()*200));
		//Triangle t = new Triangle(new Pointf(100,100),new Pointf(100, 400),new Pointf(500, 400));
		g.fillRect((int) t.getA().getX()-2, (int) t.getA().getY()-2, 4, 4);
		g.fillRect((int) t.getB().getX()-2, (int) t.getB().getY()-2, 4, 4);
		g.fillRect((int) t.getC().getX()-2, (int) t.getC().getY()-2, 4, 4);
		g.drawOval((int) (t.getMid().getX()-t.getR()), (int) (t.getMid().getY()-t.getR()), (int) t.getR() * 2, (int) t.getR() * 2);
	}
}