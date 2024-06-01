/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafosponderadosmatriz;

/**
 *
 * @author Usuario
 */
public class MatrizAdyacencia {
    private int[][] adjacencyMatrix;
    private int vertices;

    public MatrizAdyacencia(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    public void anadirBorde(int origen, int destino, int peso) {
        adjacencyMatrix[origen-1][destino-1] = peso;
    }

    public void imprimirMatriz() {
        System.out.println("La matriz de adyacencia del grafo es: ");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}