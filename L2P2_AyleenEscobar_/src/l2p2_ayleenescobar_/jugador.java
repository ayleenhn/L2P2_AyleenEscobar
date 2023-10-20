
package l2p2_ayleenescobar_;

import java.util.ArrayList;

public class jugador {
    
    // atributos
    //su nombre, cantidad y lista de carros obtenidos, puntos de reputación y dinero en su cuenta de banco.
    private String nombre;
    private int cantidad_carros;
    private ArrayList<carros> carros= new ArrayList();
    private int puntos;
    private double dinero;
    
    //constructores
    public jugador(String nombre, int cantidad_carros, int puntos,double dinero){
        this.cantidad_carros=cantidad_carros;
        this.nombre=nombre;
        puntos=2000;
        dinero=10000;
    }
    
    //mutadores
    public void setnombre(String nombre){ 
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setcantidad_carros(int cantidad_carros){ 
    }
    
    public int getcantidad_carros(){
        return cantidad_carros;
    }
    
    public void setmejoras(ArrayList<carros> carro){
        carros=carro;
    }
    
    public ArrayList<carros> getcarros(){
        return carros;
    }
    
    public void setpuntos(int puntos){ 
    }
    
    public int getpuntos(){
        return puntos;
    }
    
    public void setdinero(double dinero){ 
    }
    
    public double getdinero(){
        return dinero;
    }
    
}
