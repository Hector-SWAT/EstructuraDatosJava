/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemcolas;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int dato;
    private Nodo next;
    //Declaracion de atributos
    
    public Nodo(int dato){
        this.dato = dato;
    }
 
 //Constructor
    public int getDato(){
        return dato;
    }
    public void setDato(int dato){
        this.dato = dato;
    }
    public Nodo getNext(){
        return next;
    }
    public void setNext(Nodo next){
        this.next = next;
    }
 
 
 //Metodos getter and setters
    public String toString(){
        String s = " "+ dato +" ";
        return s;
    }
 
 
 //Metodo toString
 
}


