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
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, nodo =0;
        Pila pila = new Pila();
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones\n\n"
                + "1. Insertar Nodo\n"
                + "2. Eliminar Nodo\n"
                + "3. ¿La pila esta vacia?\n"
                + "4. ¿Vual es el ultimo valor ingresado en la pila\n"
                + "5. ¿Cuantos Nodos tiene la Pila\n"
                + "6. Vaciar la Pila\n"
                + "7. Mostrar contenido de la pila\n"
                + "8. Salir.\n\n"));
                
                switch (opcion){
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showMessageDialog(null,
                                "Ingresa el valor a ingresar al nodo"));
                        pila.insertarNodo(nodo);
                        break;
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se ah eliminado el NODO" + pila.EliminarNodo());
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia");
                        }
                        break;
                    case 3:
                        if(pila.PilaVacia())
                        break;
                    case 4:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es: " + pila.MostarUltimoValoring());
                            
                        }else {
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia");
                        }
                        
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La Pila contiene" + pila.TamanioPila() + " nodo.");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ah Vaciado la Pila");
                            
                        }else {
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion INCORRECTA");
                        break;
                }
                
            }catch(NumberFormatException e){
                
            }
        }while(opcion != 8);
    }
    
}
