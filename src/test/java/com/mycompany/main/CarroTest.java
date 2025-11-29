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
public class CarroTest {
    
    public CarroTest() {
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
     * Test of motor method, of class Carro.
     */
    @Test
    public void testMotor() {
        System.out.println("motor");
        String arrancar = "";
        Carro instance = new Carro();
        instance.motor(arrancar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of llanta method, of class Carro.
     */
    @Test
    public void testLlanta() {
        System.out.println("llanta");
        Carro instance = new Carro();
        instance.llanta();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of marca method, of class Carro.
     */
    @Test
    public void testMarca() {
        System.out.println("marca");
        Carro instance = new Carro();
        instance.marca();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
