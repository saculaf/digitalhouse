package com.example.digitalhouse.entregableintegrador;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class Receta {

    private String nombre;
    private String descripcioncorta;
    private String descripcionlarga;
    private int imagen;

    public Receta(String nombre, String descripcioncorta, String descripcionlarga, int imagen) {
        this.nombre = nombre;
        this.descripcioncorta = descripcioncorta;
        this.descripcionlarga = descripcionlarga;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcioncorta() {
        return descripcioncorta;
    }

    public void setDescripcioncorta(String descripcioncorta) {
        this.descripcioncorta = descripcioncorta;
    }

    public String getDescripcionlarga() {
        return descripcionlarga;
    }

    public void setDescripcionlarga(String descripcionlarga) {
        this.descripcionlarga = descripcionlarga;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

/*    public static List<Receta> obtenerRecetas() {

        List<Receta> recetas = new ArrayList<>();

        Receta unaReceta1 = new Receta("Pollo", "Contramuslos de Pollo Asados al Horno","Para hoy pollo, que buenas recetas salen para este rico producto, la de hoy súper fácil, hemos elegido unos buenos contramuslos de pollo que haremos asados en recipiente de barro al horno. Una receta realmente sencilla, que no nos dará nada de trabajo y con la que conseguiremos un plato estupendo. Os contamos como realizar esta estupenda receta.",R.drawable.pollo);
        Receta unaReceta2 = new Receta("Solomillo", "Solomillo de Ternera con Pimientos del Piquillo", "Una receta fácil no, lo siguiente, pero por eso nada desdeñable, de las mejores carnes, para hoy un rico solomillo de ternera con una guarnición especial de unos buenos pimientos del piquillo con ajos caramelizados. Un plato rápido de hacer y con un resultado de lo mejor. Aquí os lo presentamos. Vamos a la cocina.", R.drawable.solomillo);
        Receta unaReceta3 = new Receta("Merluza", "Cogote de Merluza al Horno", "Para hoy pescado, y que pescado, maravilloso, fuimos al mercado y nos encontramos unas merluzas excelentes, y pensamos separarlas para dos platos diferentes, el que os vamos a presentar es un estupendo cogote de merluza, una receta fácil para un plato de primera. Pedimos al pescadero que nos parta la merluza y nos saque un buen cogote, esta parte esta formada por la cabeza eliminando la parte de la boca y ojos y un buen trozo del principio del pescado. Ahora entremos en nuestros fogones.", R.drawable.merluza);

        recetas.add(unaReceta1);
        recetas.add(unaReceta2);
        recetas.add(unaReceta3);

        return recetas;

    }
*/
}
