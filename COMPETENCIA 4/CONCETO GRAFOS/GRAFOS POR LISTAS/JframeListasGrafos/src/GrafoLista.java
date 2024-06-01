/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class GrafoLista {
    private int numNodos;
    private ArrayList<ArrayList<Integer>> lista;
    
    public GrafoLista (int numNodos) {
       this.numNodos = numNodos;
       this.lista = new ArrayList<ArrayList<Integer>>();
       for (int i=0; i<numNodos; i++) {
          lista.add(i,new ArrayList<Integer>());
       }
    }
    
     public void addArista(int nodoA, int nodoB)
    {
     lista.get(nodoA).add(nodoB);
    }
     
     public void removeArista(int nodoA, int nodoB) {
    Iterator<Integer> it = lista.get(nodoA).iterator();
    while (it.hasNext()) {
       if(it.next() == nodoB) {
          it.remove();
          break;
       }
    }
}
      public boolean isAdyacente(int nodoA, int nodoB) {
    return lista.get(nodoA).contains(nodoB);
}
      public List<Integer> AdyacentesList(int nodo) {
    return lista.get(nodo);
}
      
      public void addNodo() {
    numNodos ++;
    lista.add(new ArrayList<Integer>());
}
      public void deleteNodo(int nodo) {
    numNodos--;
 
    lista.add(nodo, new ArrayList<Integer>());
 
    for (int i=0; i<lista.size(); i++) {
       Iterator<Integer> it2 = lista.get(i).iterator();
       while (it2.hasNext()) {
       if(it2.next() == nodo) {
          it2.remove();
       }
    }
 }
}
     public String mostrarGrafo() {
    StringBuilder resultado = new StringBuilder();

    for (int i = 0; i < lista.size(); i++) {
        resultado.append("Nodo ").append(i).append(" está conectado con: ");

        if (lista.get(i).isEmpty()) {
            resultado.append("el nodo no está conectado con ningún otro");
        } else {
            for (int j = 0; j < lista.get(i).size(); j++) {
                resultado.append(lista.get(i).get(j)).append(" ");
            }
        }
        resultado.append("\n");
    }

    return resultado.toString();
}


}
