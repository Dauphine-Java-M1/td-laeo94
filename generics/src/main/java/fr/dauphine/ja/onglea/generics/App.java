package fr.dauphine.ja.onglea.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
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

	public static void main( String[] args )
	{
		System.out.println(myMax(42,1664)); //1664
		System.out.println(myMax(2014,86,13)); //2014
		System.out.println(myMax(8.6,16.64)); //16.64
		System.out.println(myMax("baa", "aba")); //aba
		/*****************************************************/
		List<String> list=Arrays.asList("foo", "toto");
		print(list);
		List<Integer> list1=Arrays.asList(123,562);
		print(list1);
		print1(list);
	}

}
