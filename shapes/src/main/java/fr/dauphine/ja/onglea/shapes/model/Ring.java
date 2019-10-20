package fr.dauphine.ja.onglea.shapes.model;

import java.awt.Graphics;

public class Ring extends Circle{
	
	private int rayonInterne;

	public Ring(Point center, int rayon,int rayonInterne) {
		super(center, rayon);
		this.rayonInterne=rayonInterne;
	}
	


	public boolean equals(Object x) {
		if( x instanceof Ring) {
			Ring obj = (Ring)x;
			return (obj.getCenter().equals(this.getCenter())) && (this.getRayon()==obj.getRayon()) && obj.rayonInterne==this.rayonInterne;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" rayonInterne :"+rayonInterne;
	}
	
	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return super.contains(p) &&
				Math.sqrt((p.getX()-super.getCenter().getX())*(p.getX()-super.getCenter().getX())+(super.getCenter().getY()-p.getY()))>rayonInterne;
	}
	
	public static boolean contains(Point p, Ring...rings){
		for(Ring r: rings) {
			if(r.contains(p)) return true;
		}
		return false;
	}

	@Override
	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		super.drawShape(g);
		g.drawOval(super.getCenter().getX()+rayonInterne,super.getCenter().getY()+rayonInterne,
				(super.getCenter().getX()+super.getRayon())-rayonInterne*2,(super.getCenter().getY()+super.getRayon())-rayonInterne*2);
	}
	
}
