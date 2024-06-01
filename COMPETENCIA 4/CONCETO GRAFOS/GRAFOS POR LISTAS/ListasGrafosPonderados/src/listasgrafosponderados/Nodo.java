/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasgrafosponderados;

/**
 *
 * @author Usuario
 */
public class Nodo {
     int value, weight;
 
    Nodo(int value, int weight)
    {
        this.value = value;
        this.weight = weight;
    }
 
    @Override
    public String toString() {
        return this.value + " (" + this.weight + ")";
    }
}
