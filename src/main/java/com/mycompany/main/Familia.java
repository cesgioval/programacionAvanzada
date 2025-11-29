/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author cesgio
 */
public class Familia {
    
    
    String nombre;

	// metodo constructor
	Familia(String nombre){
		this.nombre = nombre;

	}
	
	public void hermano(){
		System.out.println(""+nombre+" no tiene hermanos");
	}

	public void hijos(){
		System.out.println(""+nombre+" no tiene hijos "); 
	}

    public void padres(){
		System.out.println(""+nombre+" su mamá se llama Maria"); 
		System.out.println(""+nombre+" su mamá se llama Ramiro"); 
	}

	public void casa(){
		System.out.println("**********  Aqui comiensa el llamado de la clase casa  **********");

		Casa casa = new Casa();
		casa.direccion(3);
		casa.estrato();
		casa.precio();
		casa.carro();
	}

    
}
