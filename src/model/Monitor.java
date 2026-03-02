package br.com.fiapride.model;

public class Monitor {

    private String cor;
    private String marca;
    private String tomada;
    private boolean ligado;

    public Monitor(String cor, String marca, String tomada) {
        this.cor = cor;
        this.marca = marca;
        this.tomada = tomada;
        this.ligado = false;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("Erro: O monitor já está ligado.");
            return;
        }
        this.ligado = true;
        System.out.println("Monitor " + this.marca + " ligado com sucesso!");
    }

    public void desligar() {
        if (!this.ligado) {
            System.out.println("Erro: O monitor já está desligado.");
            return;
        }
        this.ligado = false;
        System.out.println("Monitor " + this.marca + " desligado.");
    }

    public String getCor() { return this.cor; }
    public String getMarca() { return this.marca; }
    public String getTomada() { return this.tomada; }
    public boolean isLigado() { return this.ligado; }
}
