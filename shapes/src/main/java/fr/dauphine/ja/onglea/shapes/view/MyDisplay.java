package fr.dauphine.ja.onglea.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.onglea.shapes.model.Circle;
import fr.dauphine.ja.onglea.shapes.model.Point;
import fr.dauphine.ja.onglea.shapes.model.Ring;

public class MyDisplay extends JPanel{

	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawLine(50, 50, 100,50);
		Point p = new Point (150,200);
		Circle c = new Circle(p,50);
		c.drawShape(g);
		Ring r = new Ring(new Point(50,60),60,15);
		r.drawShape(g);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
	}
	
}
