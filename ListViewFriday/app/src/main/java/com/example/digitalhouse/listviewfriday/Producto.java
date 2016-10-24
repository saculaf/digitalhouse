package com.example.digitalhouse.listviewfriday;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 30/09/16.
 */
public class Producto {

    private String nombre;
    private String descripcion;
    private Integer cantidadVendida;
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

    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Producto(String nombre, String descripcion, Integer cantidadVendida, Integer precio, Integer imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadVendida = cantidadVendida;
        this.precio = precio;
        this.imagen = imagen;
    }

    public static List<Producto> obtenerProductos(){

        List<Producto> productos = new ArrayList<>();

        //Creo el producto 1 y le cargo datos
        Producto unProducto = new Producto("Samsung S6", "Celu", 0, 1000, R.drawable.arma_mortal  );

        //Le agrego un producto
        productos.add(unProducto);

        productos.add(unProducto);


        productos.add(unProducto);


        productos.add(unProducto);


        productos.add(unProducto);


        return productos;
    }












}
