package cuentabancaria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SALA-D
 */
public class Nodo {
     String dato;
     
      Nodo next;
    //Declaracion de atributos
    
    public Nodo(String dato){
        this.dato = dato;
        
    }
 

    public String getDato(){
        return dato;
    }
    public void setDato(String dato){
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
        String s = "| "+ this.dato +" | ";
        return s;
    }
 
 
 //Metodo toString
 
    
}
