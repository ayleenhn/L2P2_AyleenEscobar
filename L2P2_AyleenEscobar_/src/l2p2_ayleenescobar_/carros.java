
package l2p2_ayleenescobar_;

import java.awt.Color;
import java.util.ArrayList;

public class carros {
    
    // atributos
    //marca, modelo, color, precio
    private String marca;
    private String modelo;
    private double precio;
    public Color color;
    private boolean marcador;
    private ArrayList<String> mejoras= new ArrayList();
    
    //constructores
    
    public carros (String marca,String modelo, double precio, Color color, boolean marcador){
        this.marca=marca;
        this.modelo=modelo;
        precio=6000;
        this.color=color;
    }
    
    //mutadores
    
    public void setmarca(String marca){ 
    }
    
    public String getmarca(){
        return marca;
    }
    
    public void setmodelo(String modelo){      
    }
    
    public String getmodelo(){
        return modelo;
    }
    
    public void setprecio(double precio){  
    }
    
    public double getprecio(){
        return precio;
    }
    
    public void setColor(Color c){
        color=c;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setmarcador(boolean marcador){
    }
    
    public boolean getmarcador(){
        return marcador;
    }
    
    public void setmejoras(ArrayList<String> m){
        mejoras=m;
    }
    
    public ArrayList<String> getmejoras(){
        return mejoras;
    }
}
