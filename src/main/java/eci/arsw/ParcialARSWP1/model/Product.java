package eci.arsw.ParcialARSWP1.model;

public class Product {
    private static int idCounter = 1;
    private int id;
    private String nombre;
    private double precio;
    public Product(String nombre, double precio) {
        this.id = idCounter++;
        this.nombre = nombre;
        this.precio = precio;
    }
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}