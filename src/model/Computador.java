package br.com.fiapride.model;

public class Computador {
    private String marca;
    private String processador;

    public Computador(String marca, String processador) {
        this.marca = marca;
        this.processador = processador;
    }

    public String getMarca() { return this.marca; }
}