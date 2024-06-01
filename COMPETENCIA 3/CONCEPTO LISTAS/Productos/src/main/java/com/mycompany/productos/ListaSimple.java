/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author SALA-D
 */
public class ListaSimple {
       //Declaración de atributos
    private Nodo inicio;
    private Nodo termino;
    String Cola = " ";

     //Constructor sin parametros
    public ListaSimple()
    {
    inicio=null;
    termino=null;
    }
      
 
    //Metodo insertar
    public void Insertar(Productos n)
    {
    Nodo i=new Nodo(n);
    i.setNext(null);
    if(this.inicio==null & this.termino==null)
    {
    this.inicio=i;
    this.termino=i;
    return;
    }
    
    this.termino.setNext(i);
    this.termino=this.termino.getNext();
    
    }
    
    public String Borrar(String dato)
    {
       if(this.inicio == null)
            return "No hay Productos existentes";
        if(this.inicio.getDato().getNombreP().equals(dato)){
            this.inicio=this.inicio.getNext();
            if(this.inicio == null){
                this.termino = null;
            }
            return "Producto eliminado";
        }
        Nodo previo = this.inicio;
        Nodo tmp =this.inicio.getNext();
        while(tmp != null){
            if(tmp.getDato().getNombreP().equals(dato) ){
                previo.setNext(tmp.getNext());
                if(tmp == this.termino){
                    this.termino = previo;
                }
                return "Producto Eliminado";
            }
            previo = tmp;
            tmp = tmp.getNext();
        }
        return "Producto no Encontrado";

}

        
    
////    Metodo extraer dato
//    public String Eliminar(String dato)
//    {
//        if(this.inicio == null)
//            return "La cola esta vacia. ";
//        Nodo tmp = inicio;
//        Nodo previo;
//        while(tmp != inicio)
//        {
//            if(tmp.getDato().equals(dato))
//            {
//                this.inicio = this.inicio.getNext();
//                if(this.inicio == null)
//                    this.termino = null;
//                return "Elemento Eliminado";
//            }
//            previo = tmp;
//            tmp = tmp.getNext();
//        }
//        return "Elemento no encontrado";
//    }
    
     public boolean ColaVacia(){
        if(inicio == null){
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
            return false;
        }
    }
 
    //Metodo para comprobar que la cola no esta vacia
    public boolean estaVacia()
    {
    boolean cola=false;
    if(inicio==null & termino==null)
    {
    cola=true;
    
    JOptionPane.showMessageDialog(null, "La cola esta vacia");
    }
    else
    {
    JOptionPane.showMessageDialog(null, "La cola esta vacia");
    cola=false;
    }
    return cola;
    }
 
    //Metodo para contar los elementos de la cola
    public int contar()
    {
    int contador=0;
    Nodo c=this.inicio;
    while(c!=null)
    {
    contador++;
    c=c.getNext();
    }
    System.out.println("Numero de datos en la cola: "+contador);
    return contador;
    }
    
 
    //Metodo toString
    public String toString()
    {
    Nodo c=this.inicio;
    String s="";
    while(c!=null)
    {
    s=s+c.toString();
    c=c.getNext();
    }
    return s;
 } 
    
    public List<String> OrdenarLista (List<String> lista) 
    {
        List<String> listaOrdenada = new ArrayList<>(lista);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }
    
    
    
}
