package com.example.digitalhouse.ejerciciointegrador;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 03/10/16.
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private Integer precio;
    private int imagen;

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Producto(String nombre, String descripcion, Integer precio, Integer imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }

    public static List<Producto> obtenerProductos() {

        List<Producto> productos = new ArrayList<>();

        //Creo el producto 1 y le cargo datos
        Producto unProducto1 = new Producto("Samsung S6", "Celu", 6000, R.drawable.celular1);
        Producto unProducto2 = new Producto("Samsung S5", "Celu", 5000, R.drawable.celular1);
        Producto unProducto3 = new Producto("Samsung S4", "Celu", 4000, R.drawable.celular1);
        Producto unProducto4 = new Producto("Samsung S3", "Celu", 3000, R.drawable.celular1);
        Producto unProducto5 = new Producto("Samsung S2", "Celu", 2000, R.drawable.celular1);
        Producto unProducto6 = new Producto("Samsung S1", "Celu", 1000, R.drawable.celular1);
        Producto unProducto0 = new Producto("Samsung S0", "Celu", 999, R.drawable.celular1);

        productos.add(unProducto1);
        productos.add(unProducto2);
        productos.add(unProducto3);
        productos.add(unProducto4);
        productos.add(unProducto5);
        productos.add(unProducto6);
        productos.add(unProducto0);


        return productos;

    }
}
