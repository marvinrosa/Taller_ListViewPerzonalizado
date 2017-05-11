package com.example.marvi.tallerlistviewper_carros;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Registro extends AppCompatActivity {



    private Resources res;
    private EditText placa,precio;
    private Spinner comboMarca,comboModelo,comboColor;

    //Mostrar la info en el comboBox
    private ArrayAdapter<String> adapterMarca;
    private ArrayAdapter<String> adapterModelo;
    private ArrayAdapter<String> adapterColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        res = this.getResources();
        // Text
        placa = (EditText)findViewById(R.id.txtPlaca);
        precio =(EditText)findViewById(R.id.txtPrecio);

        // Captura de los combos
        comboMarca = (Spinner)findViewById(R.id.cmbMarca);
        comboModelo = (Spinner)findViewById(R.id.cmbModelo);
        comboColor = (Spinner)findViewById(R.id.cmbColor);

        // Mostrando las opciones
        //Array AdapterMarca
        String[] opcMarca = this.getResources().getStringArray(R.array.str_material);
        adapterMarca = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcMarca);
        comboMarca.setAdapter(adapterMarca);

        //Array AdapterModelo
        String[] opcModelo = this.getResources().getStringArray(R.array.str_dije);
        adapterModelo = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcModelo);
        comboModelo.setAdapter(adapterModelo);

        //Array AdapterColor
        String[] opcColor = this.getResources().getStringArray(R.array.str_tipo);
        adapterColor = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcColor);
        comboColor.setAdapter(adapterColor);
    }



    public void regitrar(View v){

        String rPlaca;
        String rMarca;
        String rModelo;
        String rColor;
        String rPrecio;
        String foto;
        String aux="";

        rPlaca = placa.getText().toString();
        rMarca = comboMarca.getSelectedItem().toString();
        rModelo = comboModelo.getSelectedItem().toString();
        rColor = comboColor.getSelectedItem().toString();
        rPrecio = precio.getText().toString();

        foto = String.valueOf(fotoAleatoria());

        //public Carro (String pFoto,String pPlaca, String pMarca, int pModelo, String  pColor, float pPrecio)
        Carro c = new Carro(foto,rPlaca,rMarca,rModelo,rColor,rPrecio);
        c.guardar();
        new AlertDialog.Builder(this).setMessage(res.getString(R.string.str_mensaje)).show();


        limpiar();
    }

    public void borrar(View v){
        limpiar();
    }
    public void limpiar(){
        placa.setText("");
        precio.setText("");
        comboMarca.isSelected();
         comboModelo.isSelected();
        comboColor.isSelected();
        placa.requestFocus();

    }

    public int fotoAleatoria(){
        int fotos[] = {R.drawable.hyndai_img,R.drawable.renault_img,R.drawable.kia_img};
        int numero = (int) (Math.random() *2);
        return fotos[numero];
    }

}
