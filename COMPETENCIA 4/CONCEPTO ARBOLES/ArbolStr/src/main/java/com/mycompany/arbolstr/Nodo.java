/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolstr;

/**
 *
 * @author Usuario
 */
public class Nodo {
      private String dato;
    private Nodo izquierda, derecha;

    public Nodo(String dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }


    public String getDato() {
        return dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public String imprimirDato() {
        System.out.println(this.getDato());
       return this.getDato()+ "\n";        
    }
     public String toString(){
        String s = "Nombres: "+this.getDato() +"\n";
        return s;
    }
    
    
}
