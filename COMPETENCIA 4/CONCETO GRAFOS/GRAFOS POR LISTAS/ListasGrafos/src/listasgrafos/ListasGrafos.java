/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasgrafos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ListasGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int arista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Aristas"));
          // Entrada: Lista de aristas en un dígrafo (según el diagrama anterior)
         List<Borde> edges = new ArrayList<>();
         for(int i=0; i < arista; i++){
             int v1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));
             int v2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Columna"));
             edges.add(new Borde(v1,v2));
         }
        // construye un graph a partir de la lista de aristas dada
        Grafo grafo = new Grafo(edges);
        
        // imprime la representación de la lista de adyacencia del graph
        Grafo.imprimirGrafo(grafo);
       
    }
    
}


//List<Edge> edges = Arrays.asList();
//new Edge(0, 1), new Edge(1, 2),
//                new Edge(2, 0), new Edge(2, 1), new Edge(3, 2),
//                new Edge(4, 5), new Edge(5, 4)