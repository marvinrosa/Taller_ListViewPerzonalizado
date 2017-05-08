package com.example.marvi.tallerlistviewper_carros;

import java.util.regex.MatchResult;

/**
 * Created by marvi on 6/5/2017.
 */

public class Carro {

    private String foto;
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String precio;


    public Carro (String pFoto,String pPlaca, String pMarca, String pModelo, String  pColor, String pPrecio)
    {
        this.foto = pFoto;
        this.placa = pPlaca;
        this.marca = pMarca;
        this.modelo = pModelo;
        this.color = pColor;
        this.precio = pPrecio;
    }

    public String getFoto() { return foto;}
    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPlaca() { return  placa;}
    public void setPlaca(String pPlaca){this.placa = pPlaca;}

    public String getMarca() { return marca;}
    public void setMarca(String pMarca){this.marca = pMarca;}

    public String getModelo() { return modelo;}
    public void setModelo(String pModelo){this.modelo = pModelo;}

    public String getColor() { return color;}
    public void setColor(String pColor){this.marca = pColor;}

    public String getPrecio() { return precio;}
    public void setPrecio(String pPrecio){this.precio = pPrecio;}

    public void guardar() { Datos.guardar(this);}




}
