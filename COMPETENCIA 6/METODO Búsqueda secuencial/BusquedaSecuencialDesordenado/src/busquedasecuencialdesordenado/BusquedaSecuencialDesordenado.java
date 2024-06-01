/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedasecuencialdesordenado;

/**
 *
 * @author Usuario
 */
public class BusquedaSecuencialDesordenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecuencialDesordenado Sd = new SecuencialDesordenado();
        //SECUENCIAL DESORDENADO
        int[] V = {4, 2, 3, 1, 8, 9};
        int x = 1;
        int posicion = Sd.Secuencial(V , V.length, x, 0);
        if (posicion == -1) {
            System.out.println("La infomacion no esta en el arreglo");
        } else {
            System.out.println("La infomacion se encuentra en la posicion: " + posicion);
        }
        
        //SECUENCIAL DESORDENADO RECURSIVO
        int ps = Sd.SecuencialRecursivo(V, V.length, x, 0);
        if (ps == -1) {
            System.out.println("La infomacion no esta en el arreglo");
        } else {
            System.out.println("La infomacion se encuentra en la posicion: " + ps);
        }
        
        //SECUENCIAL ORDENADO
        int[] Ve = {1,2,3,4,5,6,7};
        int b = 5;
        int Ps = Sd.SecuencialOrdenado(Ve, Ve.length, b, 0);
        if (Ps == -1) {
            System.out.println("La infomacion no esta en el arreglo");
        } else {
            System.out.println("La infomacion se encuentra en la posicion: " + Ps);
        }
        
        //SECUENCIAL ORDENADO RECURSIVO
        int posici = Sd.SecuencialOrdenadoRecursivo(Ve, Ve.length, b, 0);
        if (posici == -1) {
            System.out.println("La infomacion no esta en el arreglo");
        } else {
            System.out.println("La infomacion se encuentra en la posicion: " + posici);
        }
        
        //LISTA DESORDENADA RECURSIVA
        BusquedaListas Bl = new BusquedaListas();
        // Ejemplo de uso

        // Crear nodos de la lista
        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(5);
        Nodo nodo3 = new Nodo(20);

        // Enlazar los nodos para formar la lista desordenada
        nodo1.LIGA = nodo2;
        nodo2.LIGA = nodo3;

        // Apuntador al primer nodo
        Nodo P = nodo1;

        // Elemento a buscar
        int X = 5;

        // Llamar a la función de búsqueda recursiva
        Bl.SecuencialListaDesordenadaRecursivo(P, X);
        
    }

}
