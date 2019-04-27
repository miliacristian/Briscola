package com.example.briscola;

import java.util.List;

public abstract class Mazzo {
    private List<Carta> listaCarte;
    private List<String> listaSemi;
    private List<String> listaValori;
    public void mischiaMazzo(){

    }
    public Carta rimuoviCarta(int position){
        return null;
    }
    public boolean mazzoVuoto(){
        return listaCarte.isEmpty();
    }
    public abstract void creaMazzo();
    public Mazzo(){

    }
}
