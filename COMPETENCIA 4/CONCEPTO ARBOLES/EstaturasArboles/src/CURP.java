/*,
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario
 */
public class CURP {
    private Double Estatura;
    private String Nombre;
    
     private CURP izquierda, derecha;
    
    public CURP (Double Estatura, String Nombre){
        this.Estatura = Estatura;
        this.Nombre = Nombre;
        this.izquierda = this.derecha = null;
    }
    
    public Double getEstatura(){
        return Estatura;
    }
    
    public void setEstatura(Double Estatura){
        this.Estatura = Estatura;
        
    }
      public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

  

   

    public CURP getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(CURP izquierda) {
        this.izquierda = izquierda;
    }

    public CURP getDerecha() {
        return derecha;
    }

    public void setDerecha(CURP derecha) {
        this.derecha = derecha;
    }

    public String imprimirDato() {
         String s = "Estatura: "+this.getEstatura()+"\n"+
                "NOMBRE: "+this.getNombre()+"\n";
        return s;
//        System.out.println(this.getNoCuenta()+this.getTitular()+this.getSaldo());
//       return this.getNoCuenta()+" "+this.getTitular()+this.getSaldo()+"\n";      
    }
    
    @Override
     public String toString(){
        String s = "Estatura: "+this.getEstatura()+"\n"+
                "NOMBRE: "+this.getNombre()+"\n";
        return s;
    }
    
}
