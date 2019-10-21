package fr.dauphine.ja.onglea.shapes.model;

import fr.dauphine.ja.onglea.shapes.view.CircleDrawer;
import fr.dauphine.ja.onglea.shapes.view.RingDrawer;

public class Ring extends Circle{
	
	private int rayonInterne;

	public Ring(Point center, int rayon,int rayonInterne) {
		super(center, rayon);
		this.rayonInterne=rayonInterne;
		super.drawer= new RingDrawer(this);
	}
	


	public int getRayonInterne() {
		return rayonInterne;
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

	
}
