package fr.dauphine.ja.onglea.shapes.model;

import java.util.ArrayList;

public class World {
	public ArrayList<Shape> shapes;

	public World() {
		// TODO Auto-generated constructor stub
		shapes = new ArrayList<Shape>();
		shapes.add(new Circle(new Point(50,50),50));
		shapes.add(new Ring(new Circle(new Point (50,50),50),10));
	}
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
}
