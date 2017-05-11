package com.example.marvi.tallerlistviewper_carros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListadoCarros extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Carro> carros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_carros);

        lista = (ListView)findViewById(R.id.lvListadoCarros);
        carros = Datos.getCarros();

        AdaptadorCarros adapter = new AdaptadorCarros(this,carros);
        lista.setAdapter(adapter);
    }
}
