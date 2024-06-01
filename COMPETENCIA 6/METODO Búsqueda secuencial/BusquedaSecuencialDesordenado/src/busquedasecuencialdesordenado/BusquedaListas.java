/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedasecuencialdesordenado;

/**
 *
 * @author Usuario
 */
public class BusquedaListas {
   
    // Función principal de búsqueda recursiva
    public void SecuencialListaDesordenadaRecursivo(Nodo P, int X) {
        // Paso 1
        if (P != null && P.INFO == X) {
            // Llamada recursiva con el siguiente nodo
            SecuencialListaDesordenadaRecursivo(P.LIGA, X);
        } else {
            // Paso 1.1
            if (P == null) {
                System.out.println("La información no se encuentra en la lista");
            } else {
                System.out.println("La información se encuentra en la lista");
            }
        }
    }
}
