/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario
 */
public class Nodo {
    int informacion;
    Nodo siguiente;
    
    public Nodo(int valor){
        informacion = valor;
        siguiente = null;
    }
     // Métodos get y set para los atributos.
    
    public int getInformacion() {
        return informacion;
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
    
}
