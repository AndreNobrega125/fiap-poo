package br.com.fiapride.model;

public class Carro extends Veiculo {

    private int capacidadePassageiros;

    public Carro(String placa, String modelo, int capacidadePassageiros) {
        super(placa, modelo);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return this.capacidadePassageiros;
    }

    @Override
    public String calcularAutonomia() {
        double kmRestante = this.getNivelCombustivel() * 10.0;
        return "Autonomia do carro: " + kmRestante + " km.";
    }
}
