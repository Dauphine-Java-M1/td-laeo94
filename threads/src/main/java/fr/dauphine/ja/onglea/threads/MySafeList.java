package fr.dauphine.ja.onglea.threads;

import java.util.ArrayList;
import java.util.Random;

public class MySafeList extends ArrayList<Double>{

	@Override
	public synchronized boolean add(Double e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

	@Override
	public synchronized int size() {
		// TODO Auto-generated method stub
		return super.size();
	}
	@Override
	public synchronized Double get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}

	public static Runnable th(int m, MySafeList l) {
		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//synchroniser les acces en lecture et ecriture a une meme donnée
				synchronized (l) {
					for(int j=1;j<=m;j++) {
						l.add((double)j);
						System.out.println(j);
					}
				}

			}
		};
	}

	public static boolean stressTest(int n, int m ) {
		MySafeList mylist = new MySafeList();
		try {
			for(int i=1;i<=n;i++) {
				Thread t = new Thread(th(m,mylist));
				t.start();
			}
			if(mylist.size()!=n*m)return false;
		}catch(Exception e) {
			return false;
		}


		return true;
	}
	//Calcul produit scalaire entre 2 vecteurs 
	public static Double scalar(MySafeList v1, MySafeList v2) {
		Double scalaire =0.0;
		for(int i =0;i<v1.size();i++) {
			scalaire += v1.get(i)*v2.get(i);
		}
		return scalaire;
		
	}
	
	//Random MySafeList
	
	public static void initRandomList(MySafeList v1, MySafeList v2, int n) {
		double r;
		for(int i=1;i<=n;i++) {
			r= Math.random();
			v1.add(r);
		}
		for(int i=1;i<=n;i++) {
			r= Math.random();
			v2.add(r);
		}
	}
	public static void main(String[] args) {

		System.out.println(stressTest(3, 5));
		
		MySafeList v1 = new MySafeList();
		MySafeList v2 = new MySafeList();
		initRandomList(v1, v2, 5);
	}
}

