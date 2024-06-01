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
    private Productos dato;
    private Nodo next;
    
    public Nodo(Productos dato){
        this.dato = dato;
    }
    public Productos getDato(){
        return this.dato;
    }
    
    public void setDato(Productos dato){
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
        String s = "Producto "+ dato.getNombreP() +" Precio:  "+dato.getPrecio()+"\n";
        return s;
    }
    
    
    
}
