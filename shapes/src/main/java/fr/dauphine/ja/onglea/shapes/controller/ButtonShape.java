package fr.dauphine.ja.onglea.shapes.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fr.dauphine.ja.onglea.shapes.model.Circle;
import fr.dauphine.ja.onglea.shapes.model.Point;
import fr.dauphine.ja.onglea.shapes.model.Ring;
import fr.dauphine.ja.onglea.shapes.model.World;

public class ButtonShape extends JButton {
	private World w;
	private String name;
	public ButtonShape(String n,World world) {
		super(n);
		this.name=n;
		this.w=world;
		super.setBounds(50, 100, 95, 30);
		super.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w.getShapes().remove(w.getShapes().size()-1);
				if(name=="Circle") w.getShapes().add(new Circle(new Point(50,50),100));
				else if (name=="Ring") w.getShapes().add(new Ring(new Circle(new Point(50,50),100),10));
			}
		});
	}

	
}
