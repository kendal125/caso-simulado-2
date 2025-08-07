/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class Hotel1 {
    private Habitaciones[][] habitaciones;//atributos habitaciones
    private int numPisos;//atributos pisos
    private int numHabitacionesPorPiso;//atributos numeracion de habitacion

    //constructor vacio
    public Hotel1() {
    }

    //constructor
    public Hotel1(int numPisos, int numHabitacionesPorPiso) {
        this.numPisos = numPisos;
        this.numHabitacionesPorPiso = numHabitacionesPorPiso;
        this.habitaciones = new Habitaciones[numPisos][numHabitacionesPorPiso];
        precargarHabitaciones();
    }

    public Habitaciones[][] getHabitaciones(int numHabitacion) {
        return habitaciones;
    }

    public void setHabitaciones(Habitaciones[][] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getNumHabitacionesPorPiso() {
        return numHabitacionesPorPiso;
    }

    public void setNumHabitacionesPorPiso(int numHabitacionesPorPiso) {
        this.numHabitacionesPorPiso = numHabitacionesPorPiso;
    }

    //metodo para los precios de la ahbitaciones y si es doble o simple
    private void precargarHabitaciones() {
        int numeroHabitacion = 1;
        boolean esDoble = true;
        //el ciclo pra la matriz
        for (int i = 0; i < numPisos; i++) {
            for (int j = 0; j < numHabitacionesPorPiso; j++) {
                String tipo; //atributo para el tipo de habitacion si es doble o simple
                double precio;//precio habitacion

                if (esDoble) {
                    tipo = "Doble";
                    precio = 60;
                } else {
                    tipo = "Simple";
                    precio = 50;
                }
                esDoble = !esDoble;
                habitaciones[i][j] = new Habitaciones(numeroHabitacion, tipo, precio);
                numeroHabitacion++;
            }
        }
        JOptionPane.showMessageDialog(null, "Total de habitaciones: " + (numPisos * numHabitacionesPorPiso), "Carga Exitosa", 1);
    }

    //metodo para mostrar las habitaciones
    public void mostrarEstadoHabitaciones() {
        StringBuilder mensaje = new StringBuilder("Estado Actual de las Habitaciones \n");
        for (int i = 0; i < numPisos; i++) {//ciclo pisos
            mensaje.append("\nPiso ").append(i + 1).append(":\n");
            for (int j = 0; j < numHabitacionesPorPiso; j++) {
                Habitaciones hab = habitaciones[i][j];
                mensaje.append("").append(hab.toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Estado de Habitaciones", 1);
    }
    //metodo para mostrar las habitaciones ocupadas o libre
    public void ocuparHabitacion(int numero) {
        JOptionPane.showMessageDialog(null, "habitaciones", "disponibles", 1);
        for (int i = 0; i < numPisos; i++) {
            for (int j = 0; j < numHabitacionesPorPiso; j++) {
                Habitaciones hab = habitaciones[i][j];
                if (hab.getNumero() == numero) {
                    if (hab.getEstado().equals("OCUPADA")) {
                        JOptionPane.showMessageDialog(null, "La habitación " + numero + " ya está ocupada.", "elegir otra", 1);
                    } else {
                        hab.setEstado("OCUPADA");
                        JOptionPane.showMessageDialog(null, "Habitación " + numero + " marcada como ocupada.", "Reserva Exitosa", 1);
                    }
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró la habitación con el número " + numero, "Error", 1);
    }
     //tube que usar esto porque si no, no compilaba
   
    
}
