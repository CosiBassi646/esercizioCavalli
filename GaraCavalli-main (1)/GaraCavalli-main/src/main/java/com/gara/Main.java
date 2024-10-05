package com.gara;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  throws InterruptedException{
        int numeroCavalli = 20;
        ArrayList<String> classifica = new ArrayList<>();  // Un array per la classifica
        Corsa c = new Corsa(10, classifica);
        ArrayList<Cavallo> partecipanti =  new ArrayList<>();

        System.out.println("Gara di Cavalli");
        for(int i=0;i<numeroCavalli;i++){
            partecipanti.add(new Cavallo("C" + (i+1), c));
            partecipanti.get(i).start();
        }
        
        // Aspetta che tutti i cavalli finiscano la corsa
        for (Cavallo cavallo : partecipanti) {
            cavallo.join();  
        }

        
        //stampa classifica
        for(int i = 0; i<classifica.size();i++){
            System.out.println(classifica.get(i) + " e arrivato in " + (i+1) + "° posizione");
        }

        
    }
        
    }
