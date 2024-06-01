/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedasecuencialdesordenado;

/**
 *
 * @author Usuario
 */
public class Nodo {
    // Definición de la estructura del nodo

    int INFO;
    Nodo LIGA;

    public Nodo(int info) {
        this.INFO = info;
        this.LIGA = null;
    }

}
