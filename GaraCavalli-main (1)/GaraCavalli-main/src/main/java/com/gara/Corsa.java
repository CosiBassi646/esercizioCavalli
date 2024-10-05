package com.gara;

import java.util.ArrayList;

public class Corsa  {
    private int distanza;
    private ArrayList<String> classifica;   

    public Corsa(int distanza, ArrayList<String> classifica) {
        this.distanza = distanza;
        this.classifica = classifica;
    }

    public int getDistanza() {
        return distanza;
    }

    public synchronized  void aggiungiClassifica(String nomeCavallo) {
        classifica.add(nomeCavallo);  
        
    }
}
