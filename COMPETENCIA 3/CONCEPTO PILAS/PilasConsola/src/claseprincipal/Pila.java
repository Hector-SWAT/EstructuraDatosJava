/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseprincipal;

import javax.swing.JOptionPane;

/**
 *
 * @author SALA-D
 */
public class Pila {
    private Nodo UltimovalorIng;
    int tamanio = 0;
    String Lista = "";
    
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
        int Aux = UltimovalorIng.informacion;
        UltimovalorIng =UltimovalorIng.siguiente;
        tamanio--;
        return Aux;
    }
    
    public int MostarUltimoValoring(){
        return UltimovalorIng.informacion;
        
    }
    
    public int TamanioPila(){
        return tamanio;
    }
    
    public void VaciarPila(){
        while (!PilaVacia()){
            EliminarNodo();
        }
    }
    
    public void MostrarValores(){
        Nodo Recorrido = UltimovalorIng;
        
        while(Recorrido != null){
            Lista += Recorrido.informacion + "\n";
            Recorrido = Recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null,Lista);
        Lista = "";
    }
    
    
}
