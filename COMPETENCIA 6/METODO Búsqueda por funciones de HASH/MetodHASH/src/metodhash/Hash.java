/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodhash;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Hash {

    String[] arreglo;
    int contador, tamanio;

    public Hash(int tam) {
        tamanio = tam;
        arreglo = new String[tam];
        Arrays.fill(arreglo, "-1");
    }

    public void funcionHash(String[] cadenaArreglo, String[] arreglo) {
        tamanio = arreglo.length;

        for (int i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % (tamanio - 1);
            System.out.println("EL INDICE ES: " + indiceArreglo + " PARA EL ELEMENTO: " + elemento);

            if (indiceArreglo < 0 || indiceArreglo >= tamanio) {
                System.out.println("ERROR: Indice fuera de límites.");
                continue;
            }

            while (arreglo[indiceArreglo] != "-1") {
                indiceArreglo++;
                System.out.println("OCURRIO UNA COLISION EN EL INDICE " + (indiceArreglo - 1)
                        + " CAMBIAR AL INDICE " + indiceArreglo);
                indiceArreglo %= tamanio;
            }

            arreglo[indiceArreglo] = elemento;
        }
    }

//    public void funcionHash(String[] cadenaArreglo, String[] arreglo) {
//        for (int i = 0; i < cadenaArreglo.length; i++) {
//            String elemnto = cadenaArreglo[i];
//            int indiceArreglo = Integer.parseInt(elemnto)%7;
//            System.out.println("EL INDICE ES: " + indiceArreglo + "PARA EL ELEMNTO: " + elemnto);
//            while (!arreglo[indiceArreglo].equals("-1")) {
//                indiceArreglo++;
//                System.out.println("OCURRIO UNA COLICION EN EL INDICE"
//                        + (indiceArreglo - 1) + " CAMBIAR AL INDICE "
//                        + indiceArreglo);
//                indiceArreglo %= tamanio;
//            }
//            arreglo[indiceArreglo] = elemnto;
//        }
//
//    }
    //Metodo para mostrar la tabla
    public void mostrar() {
        int incremento = 0, i, j;
        for (i = 0; i < 1; i++) {
            incremento += 8;
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                System.out.format("|%3s" + "", j);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                if (arreglo[j].equals("-1")) {
                    System.out.print("|");
                } else {
                    System.out.print(String.format("|%3s" + "", arreglo[j]));
                }
            }
            System.out.println("|");
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
        }
    }

    public String buscarClave(String elemento) {
        int indiceArreglo = Integer.parseInt(elemento) % 7;
        int contador = 0;
        while (arreglo[indiceArreglo] != "-1") {
            if (arreglo[indiceArreglo].equals(elemento)) {
                System.out.println("\nEL ELEMENTO " + elemento
                        + " FUE ENCONTRADO EN EL INDICE " + indiceArreglo);
                return arreglo[indiceArreglo];
            }

            indiceArreglo++;
            indiceArreglo %= tamanio;
            contador++;
            if (contador > 7) {
                break;
            }
        }
        return null;
    }
}
