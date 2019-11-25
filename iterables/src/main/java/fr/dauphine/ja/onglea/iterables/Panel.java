package fr.dauphine.ja.onglea.iterables;


import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel {

	protected static Iterator<Integer> panel1(int i, int j) {
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
	
	protected static Iterable <Integer> panel2(int i, int j) {
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

	
	protected static List<Integer> panel(int i, int j) {
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

}
