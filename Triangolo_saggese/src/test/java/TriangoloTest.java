/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTipo method, of class Triangolo.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Triangolo instance = new Triangolo(10, 10, 10);
        String expResult = "Equilatero";
        String result = instance.getTipo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPerimetro method, of class Triangolo.
     */
    @Test
    public void testGetPerimetro() {
        System.out.println("getPerimetro");
        Triangolo instance = new Triangolo(10, 10, 10);
        int expResult = 30;
        int result = instance.getPerimetro();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArea method, of class Triangolo.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Triangolo instance = new Triangolo(10, 10, 10);
        int expResult = 43;
        int result = instance.getArea();
        assertEquals(expResult, result);
    }
    
}
