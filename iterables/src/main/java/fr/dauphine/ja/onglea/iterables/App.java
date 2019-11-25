package fr.dauphine.ja.onglea.iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/******************Test Panel***********************/
		System.out.println("Test Panel");
		Iterator<Integer> it=Panel.panel1(1,5);
		for(;it.hasNext();) //Test si it a un suivant
			System.out.println(it.next()); //Affiche ce suivant donc 1 à 5
		System.out.println();
		for(int i:Panel.panel2(1,5))
			System.out.println(i);
		
		System.out.println();
		List<Integer> list = Panel.panel(3,6);
		for(int i:list) {
			System.out.println(i);//affiche 3 4 5 6 System.out.println(l.get(1)); //affiche 4
		}
		/******************Test Mult************************/
		System.out.println("Test Mult");
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(2);
		l= Mult.mult(10,l);
		for(Integer i : l) {
			System.out.println(i);
		}
		//

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
	}

}
