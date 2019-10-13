package fr.dauphine.ja.onglea.shapes;

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
		return super.contains(p);
	}
	
	public boolean contains(Point p, Ring...rings){
		for(Ring r: rings) {
			return r.contains(p);
		}
		return false;
	}
	public static void main(String[] args) {
		Ring r = new Ring(new Point(1,1),2,1);
		System.out.println(r);
	}
}
