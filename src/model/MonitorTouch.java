package br.com.fiapride.model;

public class MonitorTouch extends Monitor {

    private boolean suportaCaneta;

    public MonitorTouch(String cor, String marca, String tomada, int tamanhoPolegadas, boolean suportaCaneta) {
        super(cor, marca, tomada, tamanhoPolegadas);
        this.suportaCaneta = suportaCaneta;
    }

    public boolean isSuportaCaneta() {
        return this.suportaCaneta;
    }

    @Override
    public String exibirModoUso() {
        if (this.suportaCaneta) {
            return "Monitor touch ideal para desenho e interacao com caneta.";
        }
        return "Monitor touch ideal para interacao direta com a tela.";
    }
}
