public class Point {
	double x,y,z;
	
	public Point(double _x,double _y, double _z) {
		x = _x;
		y = _y;
		z = _z;
	}
	
	public void setX(double _x) {
		x = _x;
	}
	
	public double distance(Point p) { 
		return Math.sqrt((x - p.x)*(x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z)); 
	}
	public static void main(String[] args) {
		Point p_1 = new Point(3, 4, 8);
		Point p_2 = new Point(4,6,24);
		System.out.println(p_1.x);
		System.out.println(p_1.distance(p_2));
		
	}
}
