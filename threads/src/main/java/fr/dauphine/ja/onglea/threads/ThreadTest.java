package fr.dauphine.ja.onglea.threads;

public class ThreadTest {
	private static int nbIter=1;
	private static final Object monitor = new Object();
	
	public static Runnable th10000 (final int id) {
		return new Runnable() {
		
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(nbIter<10000) {
					synchronized (monitor) {
						if(nbIter<=10000) {
							System.out.println("Je suis le thread"+id+" et j'effectue l'itération "+nbIter);
							++nbIter;
						}
						
					}
				}
			}
		};
		
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(th10000(1));
		Thread t2 = new Thread(th10000(2));
		t1.start();
		t2.start();
		
	}
}
