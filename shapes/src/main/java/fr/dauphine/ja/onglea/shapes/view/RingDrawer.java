package fr.dauphine.ja.onglea.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.onglea.shapes.model.Ring;

public class RingDrawer extends Drawer{
	public Ring r;

	public RingDrawer(Ring r) {
		this.r=r;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(r.getCenter().getX(),r.getCenter().getY(),r.getCenter().getX()+r.getRayon(),r.getCenter().getY()+r.getRayon());
		g.drawOval(r.getCenter().getX()+r.getRayonInterne(),r.getCenter().getY()+r.getRayonInterne(),
				(r.getCenter().getX()+r.getRayon())-r.getRayonInterne()*2,(r.getCenter().getY()+r.getRayon())-r.getRayonInterne()*2);
	}

}
