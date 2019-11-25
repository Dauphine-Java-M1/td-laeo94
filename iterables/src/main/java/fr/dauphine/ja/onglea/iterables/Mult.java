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
	}
}
