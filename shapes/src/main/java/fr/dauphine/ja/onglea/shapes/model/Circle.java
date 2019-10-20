package fr.dauphine.ja.onglea.shapes.model;

import java.awt.Graphics;

public class Circle implements Shape {
	
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
		return Math.pow(rayon, 2)*Math.PI;
	}
	
	public boolean contains(Point p) {

		return Math.sqrt((p.getX()-center.getX())*(p.getX()-center.getX())+(center.getY()-p.getY()))<rayon;
	}
	
	public static boolean contains (Point p, Circle...circles) {
		for(Circle c: circles) {
			if(c.contains(p)) return true;
		}
		return false;
	}

	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(center.getX(),center.getY(), center.getX()+rayon, center.getY()+rayon);
		
	}

	

	
	
}
