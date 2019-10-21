package fr.dauphine.ja.onglea.shapes.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import fr.dauphine.ja.onglea.shapes.model.Circle;
import fr.dauphine.ja.onglea.shapes.model.Point;
import fr.dauphine.ja.onglea.shapes.model.World;


public class MouseController implements MouseMotionListener {
	public World w;
	public JFrame frame;
	public MouseController(World w, JFrame frame) {
		// TODO Auto-generated constructor stub
		this.w=w;
		this.frame=frame;
	}
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		Point p = new Point(e.getX(),e.getY());
		Circle c = new Circle(p,30);
		w.getShapes().clear();
		w.getShapes().add(c);
		frame.repaint();
	}

}
