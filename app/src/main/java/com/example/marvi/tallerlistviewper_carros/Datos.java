package com.example.marvi.tallerlistviewper_carros;

import com.example.marvi.tallerlistviewper_carros.Carro;

import java.util.ArrayList;

/**
 * Created by marvi on 8/5/2017.
 */

public class Datos {

    private static ArrayList<Carro> carros = new ArrayList();

    public static void guardar(Carro c){
        carros.add(c);
    }

    public static ArrayList<Carro> getPersonas() {
        return carros;
    }
}
