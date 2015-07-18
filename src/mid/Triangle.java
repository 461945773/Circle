package mid;

public class Triangle {
	private Pointf A;
	private Pointf B;
	private Pointf C;
	private float a;
	private float b;
	private float c;

	public Triangle(Pointf A, Pointf B, Pointf C) {
		this.setA(A);
		this.setB(B);
		this.setC(C);
		this.a = Pointf.distance(A, B);
		this.b = Pointf.distance(C, B);
		this.c = Pointf.distance(A, C);
	}
	
	public Pointf getMid(){
		float x1,x2,x3,y1,y2,y3;
		x1 = A.getX();
		x2 = B.getX();
		x3 = C.getX();
		y1 = A.getY();
		y2 = B.getY();
		y3 = C.getY();
		float t1=x1*x1+y1*y1;  
		float t2=x2*x2+y2*y2;  
		float t3=x3*x3+y3*y3;  
		float temp=x1*y2+x2*y3+x3*y1-x1*y3-x2*y1-x3*y2;  
		float x=(t2*y3+t1*y2+t3*y1-t2*y1-t3*y2-t1*y3)/temp/2;  
		float y=(t3*x2+t2*x1+t1*x3-t1*x2-t2*x3-t3*x1)/temp/2;  
		return new Pointf(x, y);
	}
	
	public float getR(){
		if(!isTri()){return -1;}
		float r = -1;
		float cosA=(b*b+c*c-a*a)/(2*b*c);
		float sinA=(float) Math.sqrt(1-cosA*cosA);
		r = a/sinA/2;
		return r;
	}
	
	public boolean isTri(){
		if(a+b<=c||a+c<=b||b+c<=a){
			return false;
		}
		return true;
	}

	/**
	 * @return c
	 */
	public Pointf getC() {
		return C;
	}

	/**
	 * @param c 要设置的 c
	 */
	public void setC(Pointf c) {
		C = c;
	}

	/**
	 * @return b
	 */
	public Pointf getB() {
		return B;
	}

	/**
	 * @param b 要设置的 b
	 */
	public void setB(Pointf b) {
		B = b;
	}

	/**
	 * @return a
	 */
	public Pointf getA() {
		return A;
	}

	/**
	 * @param a 要设置的 a
	 */
	public void setA(Pointf a) {
		A = a;
	}	
	
}
