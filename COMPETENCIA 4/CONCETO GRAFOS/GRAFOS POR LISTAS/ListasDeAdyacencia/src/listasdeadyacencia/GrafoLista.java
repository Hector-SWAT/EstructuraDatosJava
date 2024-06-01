/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdeadyacencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class GrafoLista {
    Map<String, Integer> idMapping;
    List<List<Integer>> adjList;

    public GrafoLista(List<Borde> edges) {
        idMapping = new HashMap<>();
        adjList = new ArrayList<>();

        // Asignar identificadores a nombres únicos
        int idCounter = 0;
        for (Borde e : edges) {
            if (!idMapping.containsKey(e.origen)) {
                idMapping.put(e.origen, idCounter++);
                adjList.add(new ArrayList<>());
            }
            if (!idMapping.containsKey(e.destino)) {
                idMapping.put(e.destino, idCounter++);
                adjList.add(new ArrayList<>());
            }
        }

        // Agregar bordes al grafo dirigido
        for (Borde current : edges) {
            int src = idMapping.get(current.origen);
            int dest = idMapping.get(current.destino);
            adjList.get(src).add(dest);

            // Descomenta las siguientes líneas para un grafo no dirigido
            // adjList.get(dest).add(src);
        }
    }

    public void imprimirGrafo() {
        for (Map.Entry<String, Integer> entry : idMapping.entrySet()) {
            String nombre = entry.getKey();
            int id = entry.getValue();
            System.out.print(nombre + " está conectado con: ");
            for (int dest : adjList.get(id)) {
                for (Map.Entry<String, Integer> e : idMapping.entrySet()) {
                    if (e.getValue() == dest) {
                        System.out.print(e.getKey() + ", ");
                    }
                }
            }
            System.out.println();
        }
    }
}
