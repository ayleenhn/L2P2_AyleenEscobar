
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
        String[] menuO = {"JUGADORES", "CARROS","COMPRA/VENTA", "SALIR"};
        
        int juga=0;//jugadores ingresados
        int car=0;//carros ingresados
        
        boolean continuar= true;
        
        while(continuar){
            int menu = JOptionPane.showOptionDialog(
                null, "Elige una opción:", "Selección de Opción",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menuO, menuO[0]
            );
            switch (menu) {
                case 0: //jugadores
                    int opcion = 0;
                    while(opcion!=5){
                        opcion =Integer.parseInt(
                        JOptionPane.showInputDialog("1.Crear jugador\n" +
                                        "2.	Modificar jugador\n" +
                                        "3.	Listar jugadores\n" +
                                        "4.	Eliminar jugadores\n"+
                                        "5. Volver.")
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
                                ModificarJugador(jugador);
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

                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                            break;
                        }
                    }
                break;

                case 1:
                    opcion=0;
                    while(opcion!=5){
                        opcion =Integer.parseInt(
                            JOptionPane.showInputDialog("1.Agregar carro\n" +
                                            "2.Modificar carro\n" + 
                                            "3.Listar carro\n" +
                                            "4.Eliminar carro\n" + 
                                            "5. Volver.")
                        );

                        switch(opcion){
                            case 1:{
                                AgregarCarros(carros);
                                car++;
                            }break;

                            case 2:{
                                if(car==0){
                                   JOptionPane.showMessageDialog(null,"No hay carros ingresados a modificar.");
                                   break; 
                                }
                            }break;

                            case 3:{
                                if(car==0){
                                   JOptionPane.showMessageDialog(null,"No hay carros ingresados a listar.");
                                   break; 
                                }
                                
                                Object[] op = {"LISTAR CARROS", "LISTAR CARROS CON JUGADOR"};
                                
                                int lista = JOptionPane.showOptionDialog(
                                    null, "El carro es: ","Selección de marcador", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]
                                );
                                if (lista == JOptionPane.YES_OPTION) {
                                    ListarCarros(carros);
                                } else if (lista == JOptionPane.NO_OPTION) {
                                    
                                }
                            }break;

                            case 4:{
                                if(car==0){
                                   JOptionPane.showMessageDialog(null,"No hay carros ingresados a eliminar.");
                                   break; 
                                }
                                eliminarCarros(carros,car);
                            }break;

                            case 5:{
                                
                            }break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                            break;
                        }
                    }
                break;

                case 2:
                    if(juga==0 && car==0){
                       JOptionPane.showMessageDialog(null,"No hay jugadores ni carros ingresados.");
                        break; 
                    }
                break;

                case 3:
                    continuar=false;
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    continuar=false;
                break;
            }
        }
    }
    //jugador
    public static void AgregarJugador(ArrayList<jugador> jugador){
        //su nombre
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre de jugador: ");
        int puntos =Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus puntos: "));
        double dinero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dinero en su cuenta de banco: "));
        jugador jugadore = new jugador(nombre, puntos, dinero);
        jugador.add(jugadore);
    }
    
    public static void ModificarJugador(ArrayList<jugador> jugador){
        jugador jugadorNuevo = null;
        
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador a modificar: ");
        
        for (jugador jugadors : jugador) {
            if (jugadors.getnombre().equals(nombre)) {
                jugadorNuevo = jugadors;
                break;
            }
        }
        
        if (jugadorNuevo != null) {
            String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese su nuevo nombre de jugador: ");
            int nuevoPuntos =Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus nuevos puntos: "));
            double nuevoDinero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero que tiene en su cuenta de banco: "));
            jugadorNuevo.setnombre(nuevoNombre);
            jugadorNuevo.setpuntos(nuevoPuntos);
            jugadorNuevo.setdinero(nuevoDinero);
            JOptionPane.showMessageDialog(null, "Jugador modificado.");
        }else{
            JOptionPane.showMessageDialog(null, "Error, el jugador no encontrado.");
        }
    }
    
    private static void eliminarJugador(ArrayList<jugador> jugador,int juga) {
        jugador jugadorEliminar = null;
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
            listaJ +=( (jugador.indexOf(jugadors)+1)+" -"+jugadors.getnombre())+"\n";
        }
        JOptionPane.showMessageDialog(null, listaJ);
    }
    
    //carros
    
    public static void AgregarCarros(ArrayList<carros> carros){
        //marca, modelo, color, precio
        Object[] opciones = {"Reconstruido", "Comprado de agencia"};
        String[] mejoras = {"Spoiler", "Side Skirts","Front Bumper","Back Bumper","Super Builds"};
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del carro. ");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del carro. ");
        
        Color color = JColorChooser.showDialog (null,"Seleccione el color del carro.", Color.green);
       
        System.out.println("Aqui retome.");
        
        double precio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del carro: "));
        
        int marcador = JOptionPane.showOptionDialog(
            null, "El carro es: ","Selección de marcador", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
        );
        
        String mejora="NO HAY MEJORA";
        if (marcador == JOptionPane.YES_OPTION) {
            String selec = (String) JOptionPane.showInputDialog(
                null,"¿Que mejora tiene el carro?",null,JOptionPane.QUESTION_MESSAGE, null, mejoras, mejoras[0]
            );
            if (selec != null) {
                switch (selec) {
                    case "Spoiler":
                        mejora= "Spoiler";
                        precio= precio+3500;
                        break;
                    case "Side Skirts":
                        mejora= "Side Skirts";
                        precio= precio+1800;
                        break;
                    case "Front Bumper":
                        mejora= "Front Bumper";
                        precio= precio+2000;
                        break;
                    case "Back Bumper":
                        mejora= "Back Bumper";
                        precio= precio+1500;
                        break;
                    case "Super Builds":
                        mejora= "Super Builds";
                        precio= precio+8880;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
                }
            }
        } else if (marcador == JOptionPane.NO_OPTION) {
            mejora= "no mejora";
        }
        carros carro = new carros(marca,modelo,precio,color,mejora);
        carros.add(carro);
        
    }
    
    public static void ModificarCarros(ArrayList<carros> carros){
        carros carrosNuevo = null;
        Object[] opciones = {"Reconstruido", "Comprado de agencia"};
        String[] mejoras = {"Spoiler", "Side Skirts","Front Bumper","Back Bumper","Super Builds"};
        
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del carro a modficar. ");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del carro a modficar. ");
        
        for (carros car : carros) {
            if (car.getmarca().equals(marca) && car.getmodelo().equals(modelo)) {
                carrosNuevo = car;
                break;
            }
        }
        if (carrosNuevo != null) {
            String marcaNuevo = JOptionPane.showInputDialog(null, "Ingrese la marca del carro a modficar. ");
            String modeloNuevo = JOptionPane.showInputDialog(null, "Ingrese el modelo del carro a modficar. ");
            Color color = JColorChooser.showDialog (null,"Seleccione el color del carro.", Color.green);

            System.out.println("Aqui retome.");

            double precio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del carro: "));

            int marcador = JOptionPane.showOptionDialog(
                null, "El carro es: ","Selección de marcador", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
            );

            String mejora="NO HAY MEJORA";
            if (marcador == JOptionPane.YES_OPTION) {
                String selec = (String) JOptionPane.showInputDialog(
                    null,"¿Que mejora tiene el carro?",null,JOptionPane.QUESTION_MESSAGE, null, mejoras, mejoras[0]
                );
                if (selec != null) {
                    switch (selec) {
                        case "Spoiler":
                            mejora= "Spoiler";
                            precio= precio+3500;
                            break;
                        case "Side Skirts":
                            mejora= "Side Skirts";
                            precio= precio+1800;
                            break;
                        case "Front Bumper":
                            mejora= "Front Bumper";
                            precio= precio+2000;
                            break;
                        case "Back Bumper":
                            mejora= "Back Bumper";
                            precio= precio+1500;
                            break;
                        case "Super Builds":
                            mejora= "Super Builds";
                            precio= precio+8880;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                    }
                }
            } else if (marcador == JOptionPane.NO_OPTION) {
                mejora= "no mejora";
            }
            carros carro = new carros(marca,modelo,precio,color,mejora);
            carros.add(carro);
        }else{
            JOptionPane.showMessageDialog(null, "Error, el jugador no encontrado.");
        }
        /*carrosNuevo.setmarca(marcaNuevo);
        carrosNuevo.setmodelo(nuevoPuntos);
        carrosNuevo.setdinero(nuevoDinero);*/
    }
    
    
    private static void ListarCarros(ArrayList<carros> carros) {
        //modelo marca y mejoras
        String listaC = "   ----LISTA DE CARROS----\n";
        for (carros n : carros) {
           listaC +=((carros.indexOf(n)+1+" - modelo: "+carros.get(carros.indexOf(n)).getmodelo()+ ", Marca: " + carros.get(carros.indexOf(n)).getmarca()+
                   ", Mejoras: " + carros.get(carros.indexOf(n)).getmejoras() + "\n"));
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
