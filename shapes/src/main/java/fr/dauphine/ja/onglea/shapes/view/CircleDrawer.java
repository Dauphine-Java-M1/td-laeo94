package fr.dauphine.ja.onglea.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.onglea.shapes.model.Circle;

public class CircleDrawer extends Drawer {
	public Circle c;
	public CircleDrawer(Circle c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(c.getCenter().getX(),c.getCenter().getY(),c.getRayon(), c.getRayon());
		
	}

}
