package com.gara;

public class Cavallo extends Thread{
    private String nome;
    private Corsa corsa;

    public Cavallo(String nome, Corsa corsa) {
        this.nome = nome;
        this.corsa = corsa;
    }

    public String getNome() {
        return nome;
    }

    public void run() {
        
        for (int i = 0; i < corsa.getDistanza(); i++) {
            try {
                Thread.sleep((int) (Math.random() * 1000)); // Simula il ritardo dei cavalli
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }

        // Registra l'arrivo
        corsa.aggiungiClassifica(nome);
    }

    
}
