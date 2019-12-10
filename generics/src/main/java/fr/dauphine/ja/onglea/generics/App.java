package fr.dauphine.ja.onglea.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App 
{
	/*******************EXO 1***************************/
	/*
	public static Integer myMax(Integer i0,Integer ...integers ) {
		Integer max =i0;
		for (Integer i : integers) {
			if(i>max) max= i;
		}
		return max;
	}*/


	public static <T extends Comparable<T>> T myMax (T t, T ... ts ){
		T max = t;
		for (T obj : ts) {
			if(max.compareTo(obj)<0) max = obj;
		}
		return max;
	}
	/*******************EXO 2***************************/
	private static void print(List<?> list) {
		for(Object o:list)System.out.println(o);
	}

	private static void print1 (List <? extends CharSequence> list) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(CharSequence o : list) {
			l.add(o.length());
		}
		print(l);
	}

	/*******************EXO 3***************************/

	public static List<Integer> listLength(List <?>list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for (int i=0; i<list.size();i++) {
			CharSequence seq= (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	/*******************EXO 4***************************/
	private static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2) {
		List<T> listfusion = new LinkedList<T>();
		Iterator<? extends T> it1 = l1.iterator();
		Iterator<? extends T> it2 = l2.iterator();	
		while(it1.hasNext()) {
			listfusion.add(it1.next());
			listfusion.add(it2.next());
		}
		return listfusion;
	}
	
	/**************************EXO 5**************************************/
	public static <T> void swap(List <? extends T> l,int i1, int i2) {
	
	}
	public static void main( String[] args )
	{
		/*************************Test EXO 1****************************/
		System.out.println(myMax(42,1664)); //1664
		System.out.println(myMax(2014,86,13)); //2014
		System.out.println(myMax(8.6,16.64)); //16.64
		System.out.println(myMax("baa", "aba")); //aba
		/***********************Test EXO2******************************/
		List<String> list=Arrays.asList("foo", "toto");
		print(list);
		List<Integer> list1=Arrays.asList(123,562);
		print(list1);
		print1(list);
		/*******************Test EXO 3***************************/
		List<?> l = Arrays.asList("colonel","reyel");
		System.out.println(listLength(l));
		/********************Test Exo 4**************************/
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
		print(r1);
		/*******************Test EXO 5********************************/
	}

}
