/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejembinario;

/**
 *
 * @author Usuario
 */
public class Nodo {
    int NumBinario ;
    Nodo siguiente;
    
    public Nodo(int valor){
        NumBinario = valor;
        siguiente = null;
    }
     // Métodos get y set para los atributos.
    
    public int getNumBinario() {
        return NumBinario;
    }

    public void setNumBinario(int NumBinario) {
        this.NumBinario = NumBinario;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
    
    public String toString(){
        String s = "El valor en binario es: "+this.getNumBinario();
        return s;
    }
}
