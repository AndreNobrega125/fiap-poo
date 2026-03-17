package br.com.fiapride.model;

public class Monitor {
    
    private String marca;
    private String cor;
    private int tamanhoPolegadas;
    private String tomada;
    private boolean ligado;

    // MISSÃO 1 e 2: Construtor criado exigindo 3 atributos essenciais
    public Monitor(String marca, String cor, int tamanhoPolegadas) {
        
        // MISSÃO 3: Atribuições usando os setters dentro do construtor
        this.setMarca(marca);
        this.setCor(cor);
        this.setTamanhoPolegadas(tamanhoPolegadas);
        
        // Atributos não essenciais para o nascimento ganham valores padrão
        this.tomada = "Desconectada"; 
        this.ligado = false; 
    }

    // Setters privados para uso no construtor (Segurança / Clean Code)
    private void setMarca(String marca) {
        this.marca = marca;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    // Seu setter de polegadas que faz a validação perfeitamente!
    public void setTamanhoPolegadas(int tamanho) {
        if (tamanho >= 10 && tamanho <= 100) {
            this.tamanhoPolegadas = tamanho;
        } else {
            System.out.println("❌ Erro: Tamanho " + tamanho + " inválido! O monitor deve ter entre 10 e 100 polegadas.");
        }
    }

    // Getters
    public String getMarca() { return this.marca; }
    public String getCor() { return this.cor; }
    public int getTamanhoPolegadas() { return this.tamanhoPolegadas; }
    public String getTomada() { return this.tomada; }
    public boolean isLigado() { return this.ligado; }

    // Métodos de comportamento
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
}
