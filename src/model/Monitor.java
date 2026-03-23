package br.com.fiapride.model;

public class Monitor {
    private String marca;
    private String cor;
    private int tamanhoPolegadas;
    private String tomada;
    private boolean ligado;
    
    // ASSOCIAÇÃO: O Monitor "tem um" Computador conectado
    private Computador pcConectado; 

    // Construtor atualizado exigindo o Computador
    public Monitor(String marca, String cor, int tamanhoPolegadas, Computador pcConectado) {
        this.setMarca(marca);
        this.setCor(cor);
        this.setTamanhoPolegadas(tamanhoPolegadas);
        this.pcConectado = pcConectado;
        this.tomada = "Desconectada"; 
        this.ligado = false; 
    }

    private void setMarca(String marca) { this.marca = marca; }
    private void setCor(String cor) { this.cor = cor; }
    
    public void setTamanhoPolegadas(int tamanho) {
        if (tamanho >= 10 && tamanho <= 100) {
            this.tamanhoPolegadas = tamanho;
        } else {
            System.out.println("❌ Erro: Tamanho " + tamanho + " inválido!");
        }
    }

    // Método que prova que a associação funcionou
    public void exibirImagem() {
        if (this.ligado) {
            System.out.println("Exibindo a tela do computador: " + this.pcConectado.getMarca());
        } else {
            System.out.println("Monitor desligado. Nenhuma imagem.");
        }
    }

    public void ligar() { this.ligado = true; }
    public void desligar() { this.ligado = false; }
}