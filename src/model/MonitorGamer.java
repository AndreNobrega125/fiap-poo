package br.com.fiapride.model;

public class MonitorGamer extends Monitor {
    
    private int taxaAtualizacaoHz;

    public MonitorGamer(String marca, String cor, int tamanhoPolegadas, Computador pcConectado, int taxaAtualizacaoHz) {
        super(marca, cor, tamanhoPolegadas, pcConectado); 
        this.taxaAtualizacaoHz = taxaAtualizacaoHz;
    }

    public int getTaxaAtualizacaoHz() { 
        return this.taxaAtualizacaoHz; 
    }

    public void ativarModoGamer() {
        System.out.println("🚀 Modo Gamer ativado! Rodando a " + this.taxaAtualizacaoHz + "Hz!");
    }
}