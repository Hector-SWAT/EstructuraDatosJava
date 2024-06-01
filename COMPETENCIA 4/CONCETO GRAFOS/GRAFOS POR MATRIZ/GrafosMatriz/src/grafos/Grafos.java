/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Matriz_de_adyacencia matriz = new Matriz_de_adyacencia(4);
        matriz.agregarArista(1, 2);
        matriz.agregarArista(1, 3);
        matriz.agregarArista(2, 4);
        matriz.agregarArista(4, 3);

        matriz.imprimirMatrizAdyacencia();
    }
    
}
