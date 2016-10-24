package com.example.digitalhouse.recyclerviewconlistener;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by digitalhouse on 12/10/16.
 */
public class AdaptadorProductosRecycler extends RecyclerView.Adapter implements View.OnClickListener  {

    private List<Producto> listaDeProductos;
    private Context contexto;
    private View.OnClickListener listener;

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public AdaptadorProductosRecycler(List<Producto> listaDeProductos, Context contexto, View.OnClickListener listener) {
        this.listaDeProductos = listaDeProductos;
        this.contexto = contexto;
        this.listener = listener;
    }

    public Producto dameProducto(Integer posicion){
        return listaDeProductos.get(posicion);
    }

    //Aca es donde se crea la vista y el viewHolder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contexto);
        View viewDeLaCelda = inflater.inflate(R.layout.recyclerview_detalle,parent,false);

        //LE DECIMOS A CADA CELDA QUE EL QUE LO VA A ESCUCHAR ES EL ADAPTADOR.
        viewDeLaCelda.setOnClickListener(this);

        ProductosViewHolder productosViewHolder = new ProductosViewHolder(viewDeLaCelda);
        return productosViewHolder;
    }

    //Aca es donde al viewholder que contiene la vista le cargo la informacion
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Producto unProducto = listaDeProductos.get(position);
        ProductosViewHolder productosViewHolder = (ProductosViewHolder) holder;
        productosViewHolder.cargarProducto(unProducto);
    }

    @Override
    public int getItemCount() {
        return listaDeProductos.size();
    }

    //CUANDO LE HACEN CLICK, LE AVISA AL LISTENER QUE LE PASARON POR PARAMETRO QUE LO TOCARON
    @Override
    public void onClick(View view) {
        listener.onClick(view);
    }


    private class ProductosViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewProducto;
        private TextView textViewNombreProducto;
        private TextView textViewDescripcionProducto;
        private TextView textViewPrecioProducto;

        public ProductosViewHolder(View view){
            super(view);
            imageViewProducto = (ImageView)view.findViewById(R.id.imagenDetalle);
            textViewNombreProducto = (TextView)view.findViewById(R.id.nombreDetalle);
            textViewDescripcionProducto = (TextView)view.findViewById(R.id.descripcionDetalle);
            textViewPrecioProducto = (TextView)view.findViewById(R.id.precioDetalle);
        }

        public void cargarProducto(Producto unProducto){
            imageViewProducto.setImageResource(unProducto.getImagen());
            textViewNombreProducto.setText(unProducto.getNombre());
            textViewDescripcionProducto.setText(unProducto.getDescripcion());
            textViewPrecioProducto.setText("$"+unProducto.getPrecio().toString());
        }
    }


}
