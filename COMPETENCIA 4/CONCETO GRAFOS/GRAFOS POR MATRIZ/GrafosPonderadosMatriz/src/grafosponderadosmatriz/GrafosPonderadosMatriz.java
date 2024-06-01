/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafosponderadosmatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GrafosPonderadosMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int arista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Aristas"));
        MatrizAdyacencia matriz= new MatrizAdyacencia(arista);
        for (int i=0; i<arista;i++){
             int v1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));
             int v2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Columna"));
             int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Peso"));
             matriz.anadirBorde(v1,v2,peso);
        }
        matriz.imprimirMatriz();
    }
    
}
