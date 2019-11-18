package fr.dauphine.ja.onglea.iterables;


import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel {

	private static Iterator<Integer> panel1(int i, int j) {
		return new Iterator <Integer>() { // instance class Anonyme
			private int pos=i;

			@Override
			public boolean hasNext() {
				return pos<=j;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return pos++;
			}

		};
	}
	
	private static Iterable <Integer> panel2(int i, int j) {
		// TODO Auto-generated method stub
		return new Iterable <Integer>() {
			
			@Override
			public Iterator<Integer> iterator() {
				return new Iterator <Integer>() { // instance class Anonyme
					private int pos=i;

					@Override
					public boolean hasNext() {
						return pos<=j;
					}

					@Override
					public Integer next() {
						// TODO Auto-generated method stub
						return pos++;
					}

				};

			}
			
		};
	}

	
	public static List<Integer> panel(int i, int j) {
		// TODO Auto-generated method stub
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return i+index;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return j-i+1;
			}
		};
	}

	public static void main( String[] args )
	{
		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();) //Test si it a un suivant
			System.out.println(it.next()); //Affiche ce suivant donc 1 à 5
		System.out.println();
		for(int i:panel2(1,5))
			System.out.println(i);
		
		System.out.println();
		List<Integer> l = panel(3,6);
		for(int i:l) {
			System.out.println(i);//affiche 3 4 5 65}6System.out.println(l.get(1)); //affiche 4
		}
	}





}
