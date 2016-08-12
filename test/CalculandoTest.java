/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.Calculando;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class CalculandoTest {
    
    public CalculandoTest() {
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
     * Test of add method, of class Calculando.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int number1 = 5;
        int number2 = 5;
        Calculando instance = new Calculando();
        int expResult = 10;
        int result = instance.add(number1, number2);
        assertEquals(expResult, result);

    }

    /**
     * Test of subtract method, of class Calculando.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int number1 = 6;
        int number2 = 4;
        Calculando instance = new Calculando();
        int expResult = 2;
        int result = instance.subtract(number1, number2);
        assertEquals(expResult, result);

    }

    /**
     * Test of multiply method, of class Calculando.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int number1 = 5;
        int number2 = 4;
        Calculando instance = new Calculando();
        int expResult = 20;
        int result = instance.multiply(number1, number2);
        assertEquals(expResult, result);

    }

    /**
     * Test of divide method, of class Calculando.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int number1 = 10;
        int number2 = 5;
        Calculando instance = new Calculando();
        int expResult = 2;
        int result = instance.divide(number1, number2);
        assertEquals(expResult, result);

    }
    
}
