package edu.uniandes.ecos.regresion.mundo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Se definen los cuatro casos de test a probar
 * @author Leonardo Valbuena Calderon
 * @date 19/02/2016
 */
public class RegresionTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RegresionTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RegresionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
