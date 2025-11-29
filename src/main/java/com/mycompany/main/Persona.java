/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author cesgio
 */
public class Persona extends Fondo implements Cuota{
    
    
    String nombre;
	int edad;
	String generoTipo;

	// metodo constructor
	Persona(String nombre, int edad, String genero){
		super(200000);
		this.nombre = nombre;
		this.edad = edad;
		generoTipo = genero;
	}
	
	public void datos(){
		System.out.println("tu nombre es:  "+nombre+"");
		System.out.println("tu edad es:  "+edad+"");
		System.out.println("tu genero es:  "+generoTipo+"");
	}

	public void habitos(){
		System.out.println(""+nombre+" te gusta caminar"); 
	}

	public void estilo(){
		System.out.println(""+nombre+" tienes un outfit moderno"); 

	}

	public void familia(){
		System.out.println("**********  Aqui comiensa el llamado de la clase familia  **********");

		Familia familia = new Familia("Franchesco");
		familia.hermano();
		familia.hijos();
		familia.padres();
		familia.casa();
	}

	public void trabajo(){
		System.out.println("**********  Aqui comiensa el llamado de la clase trabajo  **********");

		Trabajo trabajo = new Trabajo("Zapateria enviado desde main", "Ingeniro soporte", "calle 45 56 56");
		String nomEmpresa = trabajo.nombreEmpresa();
		System.out.println(" trabaja en la empresa "+nomEmpresa+"");
		String cargo = trabajo.cargo();
		System.out.println("tiene el cargo   "+cargo+"");
		String direccion = trabajo.direccion();
		System.out.println("la dirección de trabajo es:  "+direccion+"");
	}

	public void prestamos(){
		Prestamo p1 = new vivienda();
        p1.tienePrestamo();

        Prestamo p2 = new vehiculo();
        p2.tienePrestamo();

        Prestamo p3 = new libre();
        p3.tienePrestamo();
	}

	public void valorCuota(){
		System.out.println("tengo una ahorro de 55555 pesos mensuales");
	}

	

    
    
}
