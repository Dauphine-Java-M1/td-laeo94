package fr.dauphine.ja.onglea.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Recherche nombres premiers
 *
 */
public class PrimeCollection 
{
	ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		this.numbers=new ArrayList<Integer>();
	}
	
	public void initRandom (int n, int m) {
		Random r= new Random();
		for(int i=0;i<n;i++) {
			numbers.add(r.nextInt(m+1));
		}
	}
	
	private boolean isPrime(int p) {
		if(p<2) return false;
		for(int i=2;i<=Math.sqrt(p);i++) {
			if(p%i==0) return false;
		}
		return true;

	}
	
	public void printPrimes() {
		for(Integer i : numbers) {
			if(isPrime(i)) System.out.println(i);
		}
	}
	
    public static void main( String[] args )
    {
        PrimeCollection listp= new PrimeCollection();
        listp.initRandom(100,1000);
        listp.printPrimes();
  
        
    }
}
