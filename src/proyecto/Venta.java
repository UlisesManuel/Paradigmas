package proyecto;


import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge
 */
public class Venta {

    //declaracion de la variable y el ArrayList que guardara de forma lineal las ventas
    String serie;
    double total;
    private static ArrayList<Venta> ventas = new ArrayList<>();

    public String getSerie() {
        return serie;
    }

    public double getTotal() {
        return total;
    }

    public Venta(double total) {
        this.serie = generarSerie();
        this.total = total;
        ventas.add(this); // Se agrega a la lista automáticamente
    }

    //Esta clase genera numero aleatorios entre 1 numero a 4 numeros, todo esta para aplicarselo a la venta.
    private String generarSerie() {
        Random rand = new Random();
        int numero = rand.nextInt(10000); // genera número entre 0 y 9999
        return String.format("%04d", numero); // convierte a string con ceros a la izquierda
    }

    public static ArrayList<Venta> getVentas() {
        return ventas;
    }
}
