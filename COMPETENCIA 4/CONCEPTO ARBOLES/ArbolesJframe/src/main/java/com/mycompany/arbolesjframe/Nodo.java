/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesjframe;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private String dato;
    private String Significado;

    
    private Nodo izquierda, derecha;

    public Nodo(String dato,String Significado) {
        this.dato = dato;
        this.Significado =  Significado;
        this.izquierda = this.derecha = null;
    }
    public String getSignificado() {
        return Significado;
    }

    public void setSignificado(String Significado) {
        this.Significado = Significado;
    }

     public void setDato(String dato) {
        this.dato = dato;
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
        return this.getDato()+this.getSignificado()+"\n";
    }
    
    @Override
    public String toString(){
        String s = "Nombres"+this.getDato()+this.getSignificado()+"";
        return s; //Convertir a String el Dato
    }
}
