/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menn;

/**
 *
 * @author Usuario
 */
public class Pila {
     private Nodo inicio;
    private int tamanio;
    
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void apilar(String valor){
    
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        }
        
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        
        tamanio++;
    } 
    
    public void retirar(){
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            inicio = inicio.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            tamanio--;
        }
    }
    
    public String cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    
    public boolean buscar(String referencia){
    
        Nodo aux = inicio;
        boolean existe = false;
        
        while(existe != true && aux != null){
        
            if (referencia.equals(aux.getValor()) ) {
                // Cambia el valor de la bandera.
                existe = true;
            }
            else{
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el valor de la bandera.
        return existe;
    }
      
    public void remover(String referencia){
        // Consulta si el valor existe en la pila.
        if (buscar(referencia)) {
            // Crea una pila auxiliar para guardar los valores que se 
            // vayan desapilando de la pila original.
            Nodo pilaAux = null;
            while(referencia.equals(inicio.getValor())){
                Nodo temp = new Nodo();
                temp.setValor(inicio.getValor());
                if(pilaAux == null){
                    pilaAux = temp;
                }
                else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirar();
            }
           retirar();
           while(pilaAux != null){
                apilar(pilaAux.getValor());
                pilaAux = pilaAux.getSiguiente();
            }
    
            pilaAux = null;
        }
    }    
    public void editar(String referencia, String valor){
        // Consulta si el nodo existe en la pila
        if (buscar(referencia)) {
            // Crea una pila auxiliar.
            Nodo pilaAux = null;
            while(referencia.equals(inicio.getValor())){
                Nodo temp = new Nodo();
                // Ingresa el valor al nodo temporal.
                temp.setValor(inicio.getValor());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(pilaAux == null){
                    // Inicializa la pila auxiliar.
                    pilaAux = temp;
                }
                else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirar();
            }
            // Actualiza el valor del nodo.
            inicio.setValor(valor);
            while(pilaAux != null){
                apilar(pilaAux.getValor());
                // Avansa al siguiente nodo de la pila auxiliar.
                pilaAux = pilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            pilaAux = null;
        }
    }
    public void eliminar(){
        // Elimina el valor y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador a 0.
        tamanio = 0;
    }
    public void listar(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }

//   public void apilar(String nodo1) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}       

