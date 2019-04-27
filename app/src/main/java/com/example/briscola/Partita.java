package com.example.briscola;

import com.example.briscola.Giocatore;
import com.example.briscola.StatoPartita;
import java.util.List;

public abstract class Partita {
    private List<Giocatore> giocatori;
    private StatoPartita statoPartita;
    public abstract void nuovaPartita();
    public Partita(List<Giocatore> giocatori){
        this.giocatori=giocatori;
    }
    public abstract void dichiaraVincitore();

    public abstract void scegliChiInizia();
    public abstract void cediTurno();
    public void impostaPrese(){

    }
}
