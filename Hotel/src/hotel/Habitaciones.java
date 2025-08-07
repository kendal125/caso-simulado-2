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
public class Habitaciones {
    //atributos
    private int numero;
    private String tipo;
    private double precioPorNoche;
    private String estado; 
    //constructor
    public Habitaciones(int numeroHabitacion, String tipo1, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.estado = "LIBRE"; 
    }
     // get y set 
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     //toString
    @Override
    public String toString() {
        return "Habitaciones{" + "numero=" + numero + ", tipo=" + tipo + ", precioPorNoche=" + precioPorNoche + ", estado=" + estado + '}';
    }


    }
