/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    /*
    
    */
    public static void main(String[] args) {
      Hotel1 miHotel = new Hotel1(3, 5); // se crea la matriz
        //el menu de opciones
        while (true) {
                String opcion = JOptionPane.showInputDialog("Bienvenido al Hotel Fidelitas\n" + "Seleccione una opción:\n"
                    + "1. Ver Estado de habitaciones\n" + "2. Reservar una habitación\n" + "3. Salir del sistema");
                
                if (opcion == null) {
                    break; // El usuario cerró la ventana
                }
                //la opcion que selecione el usuario
                int opcionInt = Integer.parseInt(opcion);

                switch (opcionInt) {
                    case 1:
                        miHotel.mostrarEstadoHabitaciones();
                        break;
                        /*
                        no me funciono por el get.tipo
                    case 2:
                        String numHab = JOptionPane.showInputDialog("Ingrese el número de la habitación a reservar:");
                        int numHabitacion = Integer.parseInt(numHab);
                        
                        String numPersonas = JOptionPane.showInputDialog("Ingrese el número de personas:");
                        int numPersonas1 = Integer.parseInt(numPersonas);
                        
                        Habitaciones[][] habitacionAReservar = miHotel.getHabitaciones(numHabitacion);

                        if (habitacionAReservar != null) {
                            String tipoHab = habitacionAReservar.getTipo();

                            if ((tipoHab.equals("Simple") && numPersonas1 > 1) || (tipoHab.equals("Doble") && numPersonas1 > 2)) {
                                JOptionPane.showMessageDialog(null, "El número de personas excede la capacidad de la habitación " + numHabitacion + " (" + tipoHab + ")", "Error",1);
                            } else {
                                miHotel.ocuparHabitacion(numHabitacion);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró la habitación con el número " + numHabitacion, "Error",1);
                        }
                        break;
                      */
                    case 3:
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema. ¡Hasta pronto!");
                        return; // Termina el programa
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.", "Error", 1);
                }
            } 
        }
    }

        
