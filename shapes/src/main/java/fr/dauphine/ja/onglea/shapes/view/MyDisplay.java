package fr.dauphine.ja.onglea.shapes.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.onglea.shapes.controller.MouseController;
import fr.dauphine.ja.onglea.shapes.model.Shape;
import fr.dauphine.ja.onglea.shapes.model.World;

public class MyDisplay extends JPanel{
	private World w;
	
	public MyDisplay(World w) {
		// TODO Auto-generated constructor stub
		this.w=w;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(),this.getHeight());
		g.setColor(Color.black);
		for(Shape s : w.getShapes()) {
			s.drawer.draw(g);
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		World w = new World();
		MyDisplay d = new MyDisplay(w);
		MouseController m = new MouseController(w,frame);
		frame.add(d);
		frame.addMouseMotionListener(m);
	
	}
	
}
