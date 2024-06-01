/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolalumno;

/**
 *
 * @author Usuario
 */
public class Nodo {
      private String dato;
      private Float promedio;

    public float getPromedio() {
        return promedio;
    }

//    public void setPromedio(float promedio) {
//        this.promedio = promedio;
//    }
    
    private Nodo izquierda, derecha;

    public Nodo(String dato,Float promedio) {
        this.dato = dato;
        this.promedio = promedio;
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
        System.out.println(this.getDato()+this.getPromedio());
       return this.getDato()+" "+this.getPromedio()+"\n";        
    }
     public String toString(){
        String s = "Nombres: "+this.getDato() +
                "Promedio: "+this.getPromedio()+"\n";
        return s;
    }
    
    
}
