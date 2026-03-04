package br.com.fiapride.model;

public class Monitor {

    private String cor;
    private String marca;
    private String tomada;
    private boolean ligado;
    private int tamanhoPolegadas; // ← FALTAVA ISSO

    public Monitor(String cor, String marca, String tomada, int tamanhoPolegadas) {
        this.cor = cor;
        this.marca = marca;
        this.tomada = tomada;
        this.ligado = false;
        this.setTamanhoPolegadas(tamanhoPolegadas);
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
    public int getTamanhoPolegadas() { return this.tamanhoPolegadas; }

    public void setTamanhoPolegadas(int tamanho) {
        if (tamanho < 10 || tamanho > 100) {
            System.out.println("Erro: Tamanho inválido! O monitor deve ter entre 10 e 100 polegadas.");
            return;
        }
        this.tamanhoPolegadas = tamanho;
    }
}
