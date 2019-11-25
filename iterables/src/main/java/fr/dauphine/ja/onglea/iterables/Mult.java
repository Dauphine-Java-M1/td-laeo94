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

	public static void main(String[] args) {
		//Test
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(2);
		l= mult(10,l);
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
