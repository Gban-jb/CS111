public class MyPoint2D{
	private final double x;
	private final double y;
	
	MyPoint2D(double x, double y){
		this.x = x;
		this.y = y;	
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getDistance(double x, double y) {
		return Math.sqrt(Math.pow((this.x-x), 2) + Math.pow((this.y-y), 2));
	}
	
	public double getDistance(MyPoint2D other) {
		return getDistance(other.getX(), other.getY());
	}
	
	@Override
	public String toString() {
		return String.format("(%g, %g)",x,y);
	}
}
	
	//	public static void main(String[] args) {
	//		MyPoint2D d1 = new MyPoint2D(3.0, 9.0);
	//		MyPoint2D d2 = new MyPoint2D(3.65, 4.4447);
	//		System.out.println(d1.toString());
	//		System.out.println(d2.toString());
	//	}
