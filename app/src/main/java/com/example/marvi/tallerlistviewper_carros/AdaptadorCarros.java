package com.example.marvi.tallerlistviewper_carros;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.marvi.tallerlistviewper_carros.Carro;

import java.util.ArrayList;

/**
 * Created by marvi on 8/5/2017.
 */

public class AdaptadorCarros extends BaseAdapter {

    private Resources res;
    private Context contexto;
    private ArrayList<Carro> carros;

    public AdaptadorCarros(Context contexto, ArrayList<Carro> pCarros){
        this.contexto=contexto;
        this.carros=pCarros;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Declarar variables
        TextView placa,precio;
        Spinner marca, modelo,color;
        TextView rMarca, rModelo= null, rColor;
        ImageView foto;
        LayoutInflater inflater;
        View itemView;

        //Uso del Inflater
        inflater = (LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        itemView = inflater.inflate(R.layout.item_carro,null);

        //Captura de los objetos
        placa = (TextView)itemView.findViewById(R.id.txtPlacaCarro);
        precio = (TextView)itemView.findViewById(R.id.txtPrecioCarro);

        //
        rMarca = (TextView)itemView.findViewById(R.id.txtMarcaCarro);
        rModelo = (TextView)itemView.findViewById(R.id.txtModeloCarro);
        rColor = (TextView)itemView.findViewById(R.id.txtColorCarro);

        foto = (ImageView)itemView.findViewById(R.id.imgFoto);

        // Captura de los combos
        //marca = (Spinner)itemView.findViewById(R.id.cmbMarcaCarro);
       // modelo = (Spinner)itemView.findViewById(R.id.cmbModeloCarro);
        //color = (Spinner)itemView.findViewById(R.id.cmbColorCarro);

        //Pasar la información

        placa.setText(  "Placa: " + carros.get(position).getPlaca());
        rMarca.setText( "Marca: " + carros.get(position).getMarca());
        rModelo.setText("Modelo: " + carros.get(position).getModelo());
        rColor.setText( "Color: " + carros.get(position).getColor());
        precio.setText( "Precio: " + carros.get(position).getPrecio());

        foto.setImageResource(Integer.parseInt(carros.get(position).getFoto()));//retornar itemview

        return itemView;
    }



}
