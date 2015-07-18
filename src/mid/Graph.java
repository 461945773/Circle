package mid;

import java.util.ArrayList;

public class Graph {
	@SuppressWarnings("unused")
	private Pointf[] points;
	private ArrayList<Pointf>  usedPoints;
	private ArrayList<Pointf> nousePoints;
	Graph(Pointf[] points) {
		this.points = points;
		usedPoints = null;
		for(int i = 0; i < points.length;i++ ){
			nousePoints.add(points[i]);
		}
	}

	public void getMid() {
		
	}

	boolean _getMid(Pointf[] points,Circle c) {
		if (points.length == 3) {
			Triangle t = new Triangle(points[0], points[1], points[2]);
			if (!t.isTri()) {
				return false;
			}
			c.mid = t.getMid();
			c.R = t.getR();
			usedPoints.clear();
			for(int i = 0; i < points.length;i++ ){
				usedPoints.add(points[i]);
			}
			return true;
		}
		if (points.length == 4){
			Triangle t1 = new Triangle(points[0], points[1], points[2]);
			Triangle t2 = new Triangle(points[3], points[1], points[2]);
			Triangle t3 = new Triangle(points[0], points[3], points[2]);
			Triangle t4 = new Triangle(points[0], points[1], points[3]);
			Triangle t5 = t1.getR()<t2.getR()?t1:t2;
			Triangle t6 = t3.getR()<t4.getR()?t3:t4;
			Triangle t7 = t5.getR()<t6.getR()?t5:t6;
			if (!t7.isTri()) {
				return false;
			}
			c.mid = t7.getMid();
			c.R = t7.getR();
			usedPoints.clear();
			usedPoints.add(t7.getA());
			usedPoints.add(t7.getB());
			usedPoints.add(t7.getC());
		}
		return false;
	}
	class Circle{
		@SuppressWarnings({"unused"})
		private Pointf mid;
		@SuppressWarnings("unused")
		private float R;
		public Circle(Pointf mid,float R){
			this.mid = mid;
			this.R = R;
		}
	}
}
