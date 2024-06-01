/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenpractic;

/**
 *
 * @author SALA-D
 */
public class Nodo {
    private CuentaBancaria dato;
    private Nodo next;
    
    public Nodo(CuentaBancaria dato){
        this.dato = dato;
    }

    Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public CuentaBancaria getDato(){
        return this.dato;
    }
    
    public void setDato(CuentaBancaria dato){
        this.dato = dato;
    }
    
    public Nodo getNext(){
        return this.next;
    }
    public void setNext(Nodo next){
        this.next = next;
    }
    
    //Metodos getter and setters
    public String toString(){
        String s = "NoCuenta: "+ dato.getNoCuenta()+" Saldo: "+dato.getSaldo()+"\n";
        return s;
    }
    
    
    
}
