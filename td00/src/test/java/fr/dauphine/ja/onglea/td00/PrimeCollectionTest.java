package fr.dauphine.ja.onglea.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue( true );
    }
    
    public void test0IsPrime() {
    	PrimeCollection testO= new PrimeCollection();
    	assertTrue(!testO.isPrime(0));
    }
    public void testTwoIsPrime() {
    	PrimeCollection testTwo = new PrimeCollection();
    	assertTrue(testTwo.isPrime(2));
    }
    public void test9IsNotPrime() {
    	PrimeCollection test9 = new PrimeCollection();
    	assertTrue(!test9.isPrime(9));
    }
 
}
