/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listagraf;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ListaGraf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int vertices = Integer.parseInt( JOptionPane.showInputDialog("Cauntos Vertices tiene:"));
        
        GrafoLista grafo =  new GrafoLista(vertices);
        
        for(int i = 0; i<vertices;i++){
            int src = Integer.parseInt( JOptionPane.showInputDialog("Ingresa en origen: "));
            int destino = Integer.parseInt( JOptionPane.showInputDialog("Ingresa en destino: "));
            grafo.addArista(src, destino);
        }
        
        grafo.mostrarGrafo();
        
        
    }
    
}
