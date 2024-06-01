/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasgrafosponderados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ListasGrafosPonderados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Entrada: Lista de aristas en un dígrafo ponderado (según el diagrama anterior)
         int arista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Aristas"));
        // la tupla `(x, y, w)` representa una arista de `x` a `y` con peso `w`
       List<Borde> edges = new ArrayList<>();
         for(int i=0; i< arista; i++){
             int v1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));
             int v2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Columna"));
             int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Peso"));
             edges.add(new Borde(v1,v2,peso));
         }
 
        // construye un graph a partir de la lista de aristas dada
        Grafo graph = new Grafo(edges);
 
        // imprime la representación de la lista de adyacencia del graph
        Grafo.imprimirGrafo(graph);
    }
    
}


// List<Borde> edges = Arrays.asList(
//                new Borde(0, 1, 6), new Borde(1, 2, 7), new Borde(2, 0, 5),
//                new Borde(2, 1, 4), new Borde(3, 2, 10), new Borde(4, 5, 1),
//                new Borde(5, 4, 3));