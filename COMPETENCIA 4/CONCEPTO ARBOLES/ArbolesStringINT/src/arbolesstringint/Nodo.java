/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesstringint;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int dato;
    private Nodo izquierda, derecha;

    public Nodo(int dato){
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
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
    
    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}
