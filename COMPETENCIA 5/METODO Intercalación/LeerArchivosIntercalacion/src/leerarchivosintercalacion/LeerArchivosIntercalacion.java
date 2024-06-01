/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerarchivosintercalacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LeerArchivosIntercalacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Intercalacion It = new Intercalacion();
       
        try {
            File doc = new File("C:\\Users\\Usuario\\Desktop\\Hola.txt");
            Scanner obj = new Scanner(doc);
            int[] vector = new int[7];
            int i = 0;

            while (obj.hasNextLine() && i < 10) {
                vector[i] = Integer.parseInt(obj.nextLine());
//                System.out.println(vector[i]);  // Imprime el valor leído
                i++;
            }
            System.out.println("F1: ");
            It.imprimirArray(vector);
            
            File doc1 = new File("C:\\Users\\Usuario\\Desktop\\Hola1.txt");
            Scanner obj1 = new Scanner(doc1);
            
            int[] vector1 = new int[5];
            int ia = 0;
            
            while (obj1.hasNextLine() && ia < 10) {
                vector1[ia] = Integer.parseInt(obj1.nextLine());
//                System.out.println(vector1[ia]);  // Imprime el valor leído
                ia++;
            }
            System.out.println("F2: ");
            It.imprimirArray(vector1);
           
           int[] arrayCombinado = It.intercalarArrays(vector, vector1);

        System.out.println("Arreglo original Intercalado:");
        It.imprimirArray(arrayCombinado);

        It.intercalarAray(arrayCombinado, 0, arrayCombinado.length - 1);

        System.out.println("\nArreglo ordenado F3:");
        It.imprimirArray(arrayCombinado);
            

        } catch (Exception ex) {
            ex.printStackTrace();  // Imprime la traza de la excepción para depuración
        }
    }
}


