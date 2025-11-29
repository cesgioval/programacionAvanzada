/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cesgio
 */
public class CasaTest {
    
    public CasaTest() {
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
     * Test of direccion method, of class Casa.
     */
    @Test
    public void testDireccion() {
        
        
        System.out.println("direccion");
        int hab = 0;
        Casa instance = new Casa();
        instance.direccion(hab);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estrato method, of class Casa.
     */
    @Test
    public void testEstrato() {
        System.out.println("estrato");
        Casa instance = new Casa();
        String expResult = "la casa es de estrato 3";
        String result = instance.estrato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of precio method, of class Casa.
     */
    @Test
    public void testPrecio() {
        System.out.println("precio");
        Casa instance = new Casa();
        instance.precio();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carro method, of class Casa.
     */
    @Test
    public void testCarro() {
        System.out.println("carro");
        Casa instance = new Casa();
        instance.carro();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
