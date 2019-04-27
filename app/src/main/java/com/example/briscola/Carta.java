package com.example.briscola;
public abstract class Carta {
    private String seme;
    private int valore;
    private String nome;//e.g. asso di bastoni
    private String coloreDorso;//blu o rosso
    public Carta(String seme,int valore,String coloreDorso){
        this.seme=seme;
        this.valore=valore;
        this.coloreDorso=coloreDorso;
        setNome();
    }

    public void setNome(){
        this.nome="";
    }
    public Carta(){

    }
}