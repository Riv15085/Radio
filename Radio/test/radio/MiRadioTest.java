/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class MiRadioTest {
    
    public MiRadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of on method, of class MiRadio.
     */
    @Test
    public void testOn() {
        System.out.println("on");
        MiRadio instance = new MiRadio();
        instance.on();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of off method, of class MiRadio.
     */
    @Test
    public void testOff() {
        System.out.println("off");
        MiRadio instance = new MiRadio();
        instance.off();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOn method, of class MiRadio.
     */
    @Test
    public void testIsOn() {
        System.out.println("isOn");
        MiRadio instance = new MiRadio();
        boolean expResult = false;
        boolean result = instance.isOn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuency method, of class MiRadio.
     */
    @Test
    public void testGetFrecuency() {
        System.out.println("getFrecuency");
        MiRadio instance = new MiRadio();
        String expResult = "";
        String result = instance.getFrecuency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuency method, of class MiRadio.
     */
    @Test
    public void testSetFrecuency() {
        System.out.println("setFrecuency");
        String frecuencia = "";
        MiRadio instance = new MiRadio();
        instance.setFrecuency(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStation method, of class MiRadio.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        MiRadio instance = new MiRadio();
        String expResult = "";
        String result = instance.getStation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStation method, of class MiRadio.
     */
    @Test
    public void testSetStation() {
        System.out.println("setStation");
        String Estacion = "";
        MiRadio instance = new MiRadio();
        instance.setStation(Estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Forward method, of class MiRadio.
     */
    @Test
    public void testForward() {
        System.out.println("Forward");
        MiRadio instance = new MiRadio();
        instance.Forward();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Backward method, of class MiRadio.
     */
    @Test
    public void testBackward() {
        System.out.println("Backward");
        MiRadio instance = new MiRadio();
        instance.Backward();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemory method, of class MiRadio.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        int Position = 0;
        MiRadio instance = new MiRadio();
        instance.setMemory(Position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMemory method, of class MiRadio.
     */
    @Test
    public void testGetMemory() {
        System.out.println("getMemory");
        int position = 0;
        MiRadio instance = new MiRadio();
        instance.getMemory(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MiRadio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MiRadio instance = new MiRadio();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
