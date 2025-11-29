/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author cesgio
 */
public class Fondo {
    
    


    int saldoPrincipal;

    Fondo(int saldo){
        this.saldoPrincipal = saldo;
    }

    public void cuenta(){
        System.out.println("Es cliente del fondo  ");
    }
    
    public void ahorro() {
        System.out.println("tiene un saldo total de: " +saldoPrincipal+ "  pesos");
    }


    
}
