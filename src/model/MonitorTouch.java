package br.com.fiapride.model;

public class MonitorTouch extends Monitor {
    
    private boolean suportaCaneta;

    public MonitorTouch(String marca, String cor, int tamanhoPolegadas, Computador pcConectado, boolean suportaCaneta) {
        super(marca, cor, tamanhoPolegadas, pcConectado);
        this.suportaCaneta = suportaCaneta;
    }

    public boolean isSuportaCaneta() { 
        return this.suportaCaneta; 
    }
}