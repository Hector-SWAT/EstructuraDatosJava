

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Productos {
    
    //Variables de la clase
    private String NombreP;
    private float Precio;
    
    //Cosntructor
    public Productos(String NombreP, float Precio){
        this.NombreP = NombreP;
         this.Precio = Precio;
    }
    
    public String getNombreP(){
        return NombreP;
    }
    
    public void setNombreP (String NombreP){
        this.NombreP = NombreP;
    }
    
    public float getPrecio(){
        return Precio;
    }
    
    public void setPrecio(float Precio){
        this.Precio = Precio;
    }
    
}
