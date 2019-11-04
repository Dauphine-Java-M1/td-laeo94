package fr.dauphine.ja.onglea.shapes.model;

import fr.dauphine.ja.onglea.shapes.view.Drawer;

public abstract class Shape {
	public Drawer drawer;
	public abstract boolean contains (Point p);
	public abstract void translate(int dx, int dy );
}
