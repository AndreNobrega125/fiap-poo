package br.com.fiapride.model;

public class MonitorGamer extends Monitor {

    private int taxaHz;

    public MonitorGamer(String cor, String marca, String tomada, int tamanhoPolegadas, int taxaHz) {
        super(cor, marca, tomada, tamanhoPolegadas);
        this.taxaHz = taxaHz;
    }

    public int getTaxaHz() {
        return this.taxaHz;
    }

    @Override
    public String exibirModoUso() {
        return "Monitor gamer com " + this.taxaHz + " Hz, ideal para jogos.";
    }
}
