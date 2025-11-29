/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author cesgio
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println("**********  Aqui comiensa el llamado de la clase persona  **********");
		Persona personas = new Persona("Franchesco", 20, "Hombre");
		personas.cuenta();
		personas.ahorro();
		personas.datos();
		personas.habitos();
		personas.estilo();
		personas.familia();
		personas.trabajo();
		personas.prestamos();
		personas.valorCuota();

    }    
}