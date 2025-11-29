/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author cesgio
 */
abstract class Prestamo {
    
    // PATRONES CREACIONALES Se enfocan en cómo crear objetos de manera flexible y controlada.
    abstract void tienePrestamo();
}

class vivienda extends Prestamo{
    void tienePrestamo() { System.out.println("tiene prestamos de vivienda"); }
}

class vehiculo extends Prestamo{
    void tienePrestamo() { System.out.println("tiene prestamos vehicular"); }
}

class libre extends Prestamo{
    void tienePrestamo() { System.out.println("tiene prestamos libre inversión"); }
}
    
    
    
