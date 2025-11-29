/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author cesgio
 */
public class Casa {
    

    String nombre;
	int hab;
	int energia;
	// metodo constructor
	Casa(){
	}
	
	public void direccion(int hab){
		System.out.println(" la dirección es cll 13 12 12");
		while (hab > 0) {
			System.out.println("la casa tiene  "+hab+" habitaciones ");
			break;
		}
	}
	public String estrato(){
		//System.out.println(" la casa es de estrato 3 "); 
		return "la casa es de estrato 3";
	}
	
	public void precio(){
		System.out.println(" la casa tiene precio de 300000000 millones"); 
	}

	public void carro (){
		System.out.println("**********  Aqui comiensa el llamado de la clase carro  **********");

		Carro carro = new Carro();
		carro.motor("prendido");
		carro.llanta();
		carro.marca();	
	}

    
}
