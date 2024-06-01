/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author Usuario
 */
public class Matriz_de_adyacencia {
     private int[][] matrizAdyacencia;
    private int numVertices;

    public Matriz_de_adyacencia(int numVertices) {
        this.numVertices = numVertices;
        this.matrizAdyacencia = new int[numVertices][numVertices];
    }

    public void agregarArista(int origen, int destino) {
        // Para un grafo dirigido, se establece la conexión desde el nodo origen al nodo destino.
        matrizAdyacencia[origen-1][destino-1] += 1;
    }

    public void imprimirMatrizAdyacencia() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//     private int n;
//    private int[][] matriz;
//    
//    /**
//     * Constructor de clase
//     * @param n numero de nodos
//     */
//    public Matriz_de_adyacencia(int n) {
//        this.n = n;
//        matriz = new int[this.n][this.n];
//        //se inicializa matriz en 0
//        for(int i=0; i< n; i++){
//            for(int j=0; j< n; j++){
//                matriz[i][j] = 0;
//            }            
//        }
//    }
//    
//    public void agregar(int i, int j){
//        matriz[i][j] += 1;
//    }
//    
//    public void remover(int i, int j){
//        if(matriz[i][j]>0)
//            matriz[i][j] -= 1;
//    }
//    
//    public void imprimir(){
//        for(int i=0; i< n; i++){
//            for(int j=0; j< n; j++){
//                System.out.print( matriz[i][j] + "  " );        
//            }
//            System.out.println();
//        }  
  


