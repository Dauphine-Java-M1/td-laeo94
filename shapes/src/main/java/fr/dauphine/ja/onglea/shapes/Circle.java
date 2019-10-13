package fr.dauphine.ja.onglea.shapes;

public class Circle {
	
	private Point center;
	private int rayon;
	
	public Circle(Point center, int rayon) {
		super();
		this.center = center;
		this.rayon = rayon;
	}
	
	public int getRayon() {
		return rayon;
	}

	public String toString() {
		return "centre :"+center.toString()+"rayon:"+rayon+" surface :"+this.surface();
	}
	
	public void translate(int dx,int dy) {
		center.translate(dx, dy);
	}
	
	public Point getCenter() {
		return center;
	}
	public double surface() {
		return (rayon*rayon)/Math.PI;
	}
	
	public boolean contains(Point p) {

		return Math.sqrt((p.getX()-center.getX())*(p.getX()-center.getX())+(center.getY()-p.getY()))<rayon;
	}
	
	public static boolean contains (Point p, Circle...circles) {
		for(Circle c: circles) {
			return c.contains(p);
		}
		return false;
	}
	
	public static void main(String[] args) {
		/*Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+"\n "+c2);
		*/
		Circle c=new Circle(new Point(1,2), 1);
		c.getCenter().translate(1,1);
		System.out.println(c);
		System.out.println(Circle.contains(new Point(1,2),c));
	}
}
