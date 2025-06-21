/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Windows 10
 */
public class Comida {
    public int id;
    public String nombre;
    public double precio;
    String tipo;
    
    public Comida(int id, String nombre, double precio,String tipo) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.tipo= tipo;
    }
    
    
    
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getTipo() { return tipo; }
    
    
    @Override
    public String toString() {
        return id + nombre + " - $" + precio;
    }
}

class ItemPedido {
    public Comida comida;
    public int cantidad;

    public ItemPedido(Comida comida, int cantidad) {
        this.comida = comida;
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return comida.getPrecio() * cantidad;
    }

    // Getters y setters
}
