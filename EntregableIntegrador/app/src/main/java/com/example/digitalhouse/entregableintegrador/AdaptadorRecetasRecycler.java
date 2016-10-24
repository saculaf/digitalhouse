package com.example.digitalhouse.entregableintegrador;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorRecetasRecycler extends RecyclerView.Adapter implements View.OnClickListener {

    private List<Receta> listaDeRecetas;
    private Context contexto;
    private View.OnClickListener listener;

    public static List<Receta> getListaDeRecetas() {

        List<Receta> listaDeRecetas = new ArrayList<>();

        Receta unaReceta1 = new Receta("Pollo", "Contramuslos de Pollo Asados al Horno","Para hoy pollo, que buenas recetas salen para este rico producto, la de hoy súper fácil, hemos elegido unos buenos contramuslos de pollo que haremos asados en recipiente de barro al horno. Una receta realmente sencilla, que no nos dará nada de trabajo y con la que conseguiremos un plato estupendo. Os contamos como realizar esta estupenda receta.",R.drawable.pollo);
        Receta unaReceta2 = new Receta("Solomillo", "Solomillo de Ternera con Pimientos del Piquillo", "Una receta fácil no, lo siguiente, pero por eso nada desdeñable, de las mejores carnes, para hoy un rico solomillo de ternera con una guarnición especial de unos buenos pimientos del piquillo con ajos caramelizados. Un plato rápido de hacer y con un resultado de lo mejor. Aquí os lo presentamos. Vamos a la cocina.", R.drawable.solomillo);
        Receta unaReceta3 = new Receta("Merluza", "Cogote de Merluza al Horno", "Para hoy pescado, y que pescado, maravilloso, fuimos al mercado y nos encontramos unas merluzas excelentes, y pensamos separarlas para dos platos diferentes, el que os vamos a presentar es un estupendo cogote de merluza, una receta fácil para un plato de primera. Pedimos al pescadero que nos parta la merluza y nos saque un buen cogote, esta parte esta formada por la cabeza eliminando la parte de la boca y ojos y un buen trozo del principio del pescado. Ahora entremos en nuestros fogones.", R.drawable.merluza);

        listaDeRecetas.add(unaReceta1);
        listaDeRecetas.add(unaReceta2);
        listaDeRecetas.add(unaReceta3);

        return listaDeRecetas;
    }

    public AdaptadorRecetasRecycler(List<Receta> listaDeRecetas, Context contexto, View.OnClickListener listener) {
        this.listaDeRecetas = listaDeRecetas;
        this.contexto = contexto;
        this.listener = listener;
    }

    public Receta dameReceta(Integer posicion){
        return listaDeRecetas.get(posicion);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contexto);
        View viewDeLaCelda = inflater.inflate(R.layout.recyclerview_detalle,parent,false);

        //LE DECIMOS A CADA CELDA QUE EL QUE LO VA A ESCUCHAR ES EL ADAPTADOR.
        viewDeLaCelda.setOnClickListener(this);

        RecetasViewHolder recetasViewHolder = new RecetasViewHolder(viewDeLaCelda);
        return recetasViewHolder;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta unaReceta = listaDeRecetas.get(position);
        RecetasViewHolder recetasViewHolder = (RecetasViewHolder) holder;
        recetasViewHolder.cargarReceta(unaReceta);
    }

    public int getItemCount() {
        return listaDeRecetas.size();
    }

    public void onClick(View view) {
        listener.onClick(view);
    }

    private class RecetasViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewReceta;
        private TextView textViewNombreReceta;
        private TextView textViewDescripcionCortaReceta;

        public RecetasViewHolder(View view){
            super(view);
            imageViewReceta = (ImageView)view.findViewById(R.id.imagenDetalleReceta);
            textViewNombreReceta = (TextView)view.findViewById(R.id.nombreDetalleReceta);
            textViewDescripcionCortaReceta = (TextView)view.findViewById(R.id.descripcionCortaDetalleReceta);
        }

        public void cargarReceta(Receta unaReceta){
            imageViewReceta.setImageResource(unaReceta.getImagen());
            textViewNombreReceta.setText(unaReceta.getNombre());
            textViewDescripcionCortaReceta.setText(unaReceta.getDescripcioncorta());
        }
    }

}