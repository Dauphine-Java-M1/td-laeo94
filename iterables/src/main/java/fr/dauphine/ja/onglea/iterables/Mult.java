package fr.dauphine.ja.onglea.iterables;

import java.util.*;

public class Mult {
	/*public static List<Integer> mult (int n, List <Integer> list ){
		List <Integer> l = new ArrayList<Integer>(); 
		for(Integer i : list) {
			l.add(i*n);
		}
		return l;
	}*/

	public static List<Integer> mult (int n, List <Integer>list){
		if(list instanceof RandomAccess) {
			/********************CAS RETURN ABSTRACTLIST*******************************/
			return new AbstractList<Integer>() {

				@Override
				public Integer get(int index) {
					// TODO Auto-generated method stub
					return list.get(index)*n;
				}

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return list.size();
				}

			};
		}else {
			/*************************CAS DU ABSTRACTSEQUENTIALIST*********************/
			return new AbstractSequentialList<Integer>() {
				@Override
				public ListIterator<Integer> listIterator(int index) {
					// TODO Auto-generated method stub
					return new ListIterator<Integer>() {
						private ListIterator<Integer> myLit = list.listIterator(index);

						@Override 
						public void set(Integer e) {
							throw new UnsupportedOperationException();
						}

						@Override
						public void remove() {
							throw new UnsupportedOperationException();
						}

						@Override
						public int previousIndex() {
							// TODO Auto-generated method stub
							return myLit.previousIndex();
						}

						@Override
						public Integer previous() {
							// TODO Auto-generated method stub
							return myLit.previous()*n;
						}

						@Override
						public int nextIndex() {
							// TODO Auto-generated method stub
							return myLit.nextIndex();
						}

						@Override
						public Integer next() {
							// TODO Auto-generated method stub
							return myLit.next()*n;
						}

						@Override
						public boolean hasPrevious() {
							// TODO Auto-generated method stub
							return myLit.hasPrevious();
						}

						@Override
						public boolean hasNext() {
							// TODO Auto-generated method stub
							return myLit.hasNext();
						}

						@Override
						public void add(Integer e) {
							throw new UnsupportedOperationException();
						}
					};
				}

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return list.size();
				}
			};
		}
	}
}
