/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejembinario;

import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class Pila {
    private Nodo UltimovalorIng;
    private int tamanio = 0;
    private String Lista = "";
    
    public Pila(){
        UltimovalorIng = null;
        tamanio = 0;
    }
    
     public boolean PilaVacia(){
        return UltimovalorIng == null;
    }
    
    
    public void insertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        
        nuevo_nodo.siguiente =UltimovalorIng;
        UltimovalorIng = nuevo_nodo;
        tamanio++;
    }
     public int EliminarNodo(){
        int Aux = UltimovalorIng.NumBinario;
        UltimovalorIng =UltimovalorIng.siguiente;
        tamanio--;
        return Aux;
    }
     public String convertirBinario(int number) {
        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
      
     
  
    
}
