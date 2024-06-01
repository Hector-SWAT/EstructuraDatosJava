/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasgrafosponderados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Grafo {
    // Una lista de listas para representar una lista de adyacencia
    List<List<Nodo>> adjList = new ArrayList<>();
 
    // Constructor para construir un grafo
    public Grafo(List<Borde> edges)
    {
        // encuentra el vértice máximo numerado
        int n = 0;
        for (Borde e: edges) {
            n = Integer.max(n, Integer.max(e.origen, e.destino));
        }
 
        // asignar memoria para la lista de adyacencia
        for (int i = 0; i <= n; i++) {
            adjList.add(i, new ArrayList<>());
        }
 
        // agrega bordes al grafo dirigido
        for (Borde e: edges)
        {
            // asignar un nuevo nodo en la lista de adyacencia de origen a destino
            adjList.get(e.origen).add(new Nodo(e.destino, e.peso));
 
            // elimine el comentario debajo de la línea para el graph no dirigido
 
            // asignar un nuevo nodo en la lista de adyacencia de dest a src
            adjList.get(e.destino).add(new Nodo(e.origen, e.peso));
        }
    }
 
    // Función para imprimir la representación de la lista de adyacencia de un graph
    public static void imprimirGrafo(Grafo graph)
    {
        int origen = 0;
        int n = graph.adjList.size();
 
        while (origen < n)
        {
            // imprime el vértice actual y todos sus vértices vecinos
            for (Nodo borde: graph.adjList.get(origen)) {
                System.out.printf("%d ---> %s\t", origen, borde);
            }
 
            System.out.println();
            origen++;
        }
    }
}
