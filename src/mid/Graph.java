package mid;

import java.util.ArrayList;

public class Graph {
	private Pointf[] pointfs;
	private ArrayList<Pointf> usedpointfs;
	private ArrayList<Pointf> nousepointfs;
	private ArrayList<Triangle> sorting;

	public Graph(Pointf[] pointfs) {
		this.pointfs = new Pointf[pointfs.length];
		this.pointfs = pointfs;
		nousepointfs = new ArrayList<Pointf>();
		usedpointfs = new ArrayList<Pointf>();
		sorting = new ArrayList<Triangle>();
		for (int i = 0; i < pointfs.length; i++) {
			nousepointfs.add(pointfs[i]);
		}
	}

	public Pointf getMid() {
		if(nousepointfs.size()<3){
			return null;
		}else if(nousepointfs.size() == 3){
			
		}
		return null;
	}

	public ArrayList<Pointf> getNousepointfs() {
		return nousepointfs;
	}

	public Pointf[] getPointfs() {
		return pointfs;
	}

	public boolean _getMid(Pointf[] pointfs, Circle c) {
		if (pointfs.length == 3) {
			Triangle t = new Triangle(pointfs[0], pointfs[1], pointfs[2]);
			if (!t.isTri()) {
				return false;
			}
			c.setMid(t.getMid());
			c.setR(t.getR());
			usedpointfs.clear();
			for (int i = 0; i < pointfs.length; i++) {
				usedpointfs.add(pointfs[i]);
			}
			return true;
		}
		if (pointfs.length == 4) {
			Triangle t1 = new Triangle(pointfs[0], pointfs[1], pointfs[2]);
			Triangle t2 = new Triangle(pointfs[3], pointfs[1], pointfs[2]);
			Triangle t3 = new Triangle(pointfs[0], pointfs[3], pointfs[2]);
			Triangle t4 = new Triangle(pointfs[0], pointfs[1], pointfs[3]);
			Triangle t7 = null;
			if (t1.getR() >= Pointf.distance(t1.getMid(), pointfs[3])) {
				sorting.add(t1);
			}
			if (t2.getR() >= Pointf.distance(t2.getMid(), pointfs[0])) {
				sorting.add(t2);
			}
			if (t3.getR() >= Pointf.distance(t3.getMid(), pointfs[1])) {
				sorting.add(t3);
			}
			if (t4.getR() >= Pointf.distance(t4.getMid(), pointfs[2])) {
				sorting.add(t4);
			}
			float min = Float.POSITIVE_INFINITY;
			for (int i = 0; i < sorting.size(); i++) {
				if (sorting.get(i).getR() <= min) {
					min = sorting.get(i).getR();
					t7 = sorting.get(i);
				}
			}
			if (!t7.isTri()) {
				return false;
			}
			c.setMid(t7.getMid());
			c.setR(t7.getR());
			usedpointfs.clear();
			usedpointfs.add(t7.getA());
			usedpointfs.add(t7.getB());
			usedpointfs.add(t7.getC());
			return true;
		}
		return false;
	}

	public class Circle {
		private Pointf mid;
		private float R;

		public Circle() {
			this.setMid(new Pointf(0, 0));
			this.setR(0);
		}

		public Circle(Pointf mid, float R) {
			this.setMid(mid);
			this.setR(R);
		}

		public Pointf getMid() {
			return mid;
		}

		public void setMid(Pointf mid) {
			this.mid = mid;
		}

		public float getR() {
			return R;
		}

		public void setR(float r) {
			R = r;
		}
	}
}
