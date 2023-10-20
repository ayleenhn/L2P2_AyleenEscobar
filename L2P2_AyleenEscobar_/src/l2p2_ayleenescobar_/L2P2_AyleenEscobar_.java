
package l2p2_ayleenescobar_;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class L2P2_AyleenEscobar_ {

    public static void main(String[] args) {
        
        ArrayList<jugador> jugador = new ArrayList<>();
        ArrayList<carros> carros = new ArrayList<>();
        ArrayList<String> mejoras = new ArrayList<>();
        int juga=0;//jugadores ingresados
        int car=0;//carros ingresados
        int opcion =0;
        
        while(opcion!=10){
            opcion =Integer.parseInt(
                    JOptionPane.showInputDialog("1.Crear jugador\n" +
                                    "2.	Modificar jugador\n" +
                                    "3.	Listar jugadores\n" + //YA
                                    "4.	Eliminar jugadores\n"+ //ya
                                    "5.	Agregar carro\n" +
                                    "6.	Modificar carro\n" +
                                    "7.	Listar carro\n" +//falta
                                    "8.	Eliminar carro\n" + //ya
                                    "9.	Compra y venta\n" +
                                    "10. Salir")
            );
            
            switch(opcion){
                case 1:{
                    AgregarJugador(jugador);
                    juga++;
                }break;
                
                case 2:{
                    if(juga==0){
                       JOptionPane.showMessageDialog(null,"No hay jugadores ingresados a modificar.");
                       break; 
                    }
                    
                }break;
                
                case 3:{
                    if(juga==0){
                       JOptionPane.showMessageDialog(null,"No hay jugadores ingresados a listar.");
                       break; 
                    }
                    ListarJugador(jugador);
                }break;
                
                case 4:{
                    if(juga==0){
                       JOptionPane.showMessageDialog(null,"No hay jugadores ingresados a eliminar.");
                       break; 
                    }
                    eliminarJugador(jugador, juga);
                }break;
                
                case 5:{
                    
                }break;
                
                case 6:{
                    if(car==0){
                       JOptionPane.showMessageDialog(null,"No hay carros ingresados a modificar.");
                       break; 
                    }
                }break;
                
                case 7:{
                    if(car==0){
                       JOptionPane.showMessageDialog(null,"No hay carros ingresados a listar.");
                       break; 
                    }
                    ListarCarros(carros);
                }break;
                
                case 8:{
                    if(car==0){
                       JOptionPane.showMessageDialog(null,"No hay carros ingresados a eliminar.");
                       break; 
                    }
                    eliminarCarros(carros,car);
                }break;
                
                case 9:{
                    if(juga==0 && car==0){
                       JOptionPane.showMessageDialog(null,"No hay jugadores ni carros ingresados.");
                       break; 
                    }
                }break;
            }
        }
    }
    
    public static void AgregarJugador(ArrayList<jugador> jugador){
        //su nombre, cantidad y lista de carros obtenidos,
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre de jugador: ");
        
    }
    
    private static void eliminarJugador(ArrayList<jugador> jugador,int juga) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador a eliminar: ");
        for (jugador j : jugador) {
            if (j.getnombre() == nombre) {
                jugador.remove(j);
                JOptionPane.showMessageDialog(null, "Jugador eliminado.");
                juga--;
                return;  
            }
        }
        JOptionPane.showMessageDialog(null, "Error, jugador no encontrado.");
    }
    
    private static void ListarJugador(ArrayList<jugador> jugador) {
        String listaJ = "   ----LISTA DE JUGADORES----\n";
        for (jugador jugadors : jugador) {
            listaJ +=( jugador.indexOf(jugadors)+" -"+jugadors.getnombre())+"\n";
        }
        JOptionPane.showMessageDialog(null, listaJ);
    }
    
    public static void AgregarCarros(ArrayList<carros> carros){
        //marca, modelo, color, precio
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del carro. ");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del carro. ");
        
        Color color = JColorChooser.showDialog (null,"Seleccione el color del carro.", Color.green);
        
       // options=("Reconstruido","Comprado de agencia");
       //boolean marcador = JOptionPane.OPTIONS_PROPERTY;
       
       int precio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del carro: "));
        
    }
    
    private static void ListarCarros(ArrayList<carros> carros) {
        //modelo marca y mejoras
        String listaC = "   ----LISTA DE JUGADORES----\n";
        for (carros n : carros) {
            listaC +=(carros.indexOf(n)+" - modelo: "+carros.get(carros.indexOf(n)).getmodelo()+"\n");
        }
        JOptionPane.showMessageDialog(null, listaC);
    }
    
    private static void eliminarCarros(ArrayList<carros> carros,int car) {
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del carro a eliminar. ");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del carro a eliminar. ");
        for (carros j : carros) {
            if (j.getmodelo() == marca && j.getmarca() == marca) {
                carros.remove(j);
                JOptionPane.showMessageDialog(null, "Carro eliminado.");
                car--;
                return;  
            }
        }
        JOptionPane.showMessageDialog(null, "Error, carro no encontrado.");
    }
}
