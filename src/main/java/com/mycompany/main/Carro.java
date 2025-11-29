/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author cesgio
 */
public class Carro {
    

        String nombre;
	int edad;
	int energia;
        int a = 1;
	// metodo constructor
	Carro(){

	}
	
	public void motor(String arrancar){
        if (arrancar == "prendido") {
            System.out.println("El motor esta prendido");
        }else{
            System.out.println("El motor esta apagado");
        }
		
	}
    
	public void llanta(){
        for(int i = 1; i < 5; i++){
            if (a == 1) {
                System.out.println(i + "  llanta esta bien de aire ");
                a = 0;

            }else{
                System.out.println(i + "  llanta esta mal de aire ");
                a = 1;
            }
        }
	}


	public void marca(){
		System.out.println("Sale en el AUDI"); 
	}

    
}



