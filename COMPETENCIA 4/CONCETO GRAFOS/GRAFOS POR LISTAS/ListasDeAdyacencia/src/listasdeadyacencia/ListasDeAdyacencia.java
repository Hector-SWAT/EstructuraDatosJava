/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdeadyacencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ListasDeAdyacencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Borde> edges = new ArrayList<>();
        edges.add(new Borde("A", "B"));
        edges.add(new Borde("B", "C"));
        edges.add(new Borde("C", "A"));
        edges.add(new Borde("C", "D"));

        GrafoLista graph = new GrafoLista(edges);
        graph.imprimirGrafo();
    }
    
}
