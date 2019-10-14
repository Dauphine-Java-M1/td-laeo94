package fr.dauphine.ja.onglea.shapes.model;

public class TestPoint {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.println(p.getX()+" "+p.getY());
		
		System.out.println("Test Circle");
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
			
		System.out.println("Test Ring");
		Ring r = new Ring(new Point(1,1),2,1);
		System.out.println(r);
		 
	}
}
