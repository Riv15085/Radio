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
    }

    /**
     * Test of off method, of class MiRadio.
     */
    @Test
    public void testOff() {
        System.out.println("off");
        MiRadio instance = new MiRadio();
        instance.off();
    }

    /**
     * Test of isOn method, of class MiRadio.
     */
    @Test
    public void testIsOn() {
        System.out.println("isOn");
        MiRadio instance = new MiRadio();
        boolean expResult = true;
        boolean result = instance.isOn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFrecuency method, of class MiRadio.
     */
    @Test
    public void testGetFrecuency() {
        System.out.println("getFrecuency");
        MiRadio instance = new MiRadio();
        String expResult = "fm";
        String result = instance.getFrecuency();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFrecuency method, of class MiRadio.
     */
    @Test
    public void testSetFrecuency() {
        System.out.println("setFrecuency");
        String frecuencia = "am";
        MiRadio instance = new MiRadio();
        instance.setFrecuency(frecuencia);
    }

    /**
     * Test of getStation method, of class MiRadio.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        MiRadio instance = new MiRadio();
        String expResult = "87.9";
        String result = instance.getStation();
        assertEquals(expResult, result);
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
    }

    /**
     * Test of Forward method, of class MiRadio.
     */
    @Test
    public void testForward() {
        System.out.println("Forward");
        MiRadio instance = new MiRadio();
        instance.Forward();

    }

    /**
     * Test of Backward method, of class MiRadio.
     */
    @Test
    public void testBackward() {
        System.out.println("Backward");
        MiRadio instance = new MiRadio();
        instance.Backward();
    }

    /**
     * Test of setMemory method, of class MiRadio.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        int Position = 1;
        MiRadio instance = new MiRadio();
        instance.setMemory(Position);
    }
    /**
     * Test of toString method, of class MiRadio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MiRadio instance = new MiRadio();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
