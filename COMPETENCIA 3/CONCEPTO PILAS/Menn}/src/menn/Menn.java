/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menn;

import java.util.Scanner;

/**
 *
 * @author SALA-D
 */
public class Menn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila pila = new Pila();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nodo a almacenar [NOMBRE]: ");
        String nodo1 = sc.nextLine();
        System.out.print("Ingresa el nodo a almacenar [NOMBRE]: ");
        String nodo2 = sc.nextLine();
        System.out.print("Ingresa el nodo a almacenar [NOMBRE]: ");
        String nodo3 = sc.nextLine();
        System.out.print("Ingresa el nodo a almacenar [NOMBRE]: ");
        String nodo4 = sc.nextLine();
        System.out.print("Ingresa el nodo a almacenar [NOMBRE]: ");
        String nodo5 = sc.nextLine();
        System.out.println("<<-- -- de= ejemplo= pila=>>\n\n");
        
        pila.apilar(nodo1);
        pila.apilar(nodo2);
        pila.apilar(nodo3);
        pila.apilar(nodo4);
        pila.apilar(nodo5);
        
        System.out.println("<<-- --= pila>>");
        pila.listar();
        System.out.println("\n<<-- --= o= tama=>");
        System.out.println(pila.getTamanio());
        
        System.out.println("\n<<-- --= de= del= el= elemento=la= pila= retirar= tope=>>");
        pila.retirar();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());
        
        System.out.println("\n<<-- --= 12= 24= actualizar= con= del= el= nodo= por= valor=>>");
        System.out.print("Ingresa el nodo a Cambiar [NOMBRE]: ");
        String ca = sc.nextLine();
        System.out.print("El nodo se Cambiara por: [NOMBRE]: ");
        String co = sc.nextLine();
        pila.editar(ca, co);
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());
        
        System.out.println("\n<<-- --= 16= con= el= eliminar= nodo= valor=>>");
        System.out.print("Ingresa el nodo a Eliminar [NOMBRE]: ");
        String El = sc.nextLine();
        pila.remover(El);
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());
        
        System.out.println("\n<<-- --= 65= consulta= el= existe= si= valor=>>");
        System.out.print("Ingresa el nodo a Buscar [NOMBRE]: ");
        String ba = sc.nextLine();
        System.out.println(pila.buscar(ba));
        
        System.out.println("\n<<-- --= elimina= la= pila=>>");
        pila.eliminar();
        
        System.out.println("\n<<-- --= consulta= esta= la= pila= si= vacia=>>");
        System.out.println(pila.esVacia());
        
        System.out.println("\n\n<<-- --= de= ejemplo= fin= pila=>>");
    }
}
    
        
        
    
    

