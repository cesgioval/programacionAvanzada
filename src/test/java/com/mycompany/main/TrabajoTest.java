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
public class TrabajoTest {
    
    public TrabajoTest() {
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
     * Test of nombreEmpresa method, of class Trabajo.
     */
    @Test
    public void testNombreEmpresa() {

        Trabajo instance = new Trabajo("Google", "Ingeniero", "USA");

        String expResult = "Google";
        String result = instance.nombreEmpresa();

        assertEquals(expResult, result);


    }

    /**
     * Test of cargo method, of class Trabajo.
     */
    @Test
    public void testCargo() {
        Trabajo instance = new Trabajo("Google", "Ingeniero", "USA");

        String expResult = "Ingeniero";
        String result = instance.cargo();

        assertEquals(expResult, result);
    }

    /**
     * Test of direccion method, of class Trabajo.
     */
    @Test
    public void testDireccion() {
        Trabajo instance = new Trabajo("Google", "Ingeniero", "USA");

        String expResult = "USA";
        String result = instance.direccion();

        assertEquals(expResult, result);
    }
    
}
