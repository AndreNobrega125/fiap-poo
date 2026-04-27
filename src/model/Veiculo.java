package br.com.fiapride.model;

public abstract class Veiculo {

    private String placa;
    private String modelo;
    private double nivelCombustivel;

    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.modelo = modelo;
        this.nivelCombustivel = 0.0;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void atualizarPlaca(String novaPlaca) {
        this.setPlaca(novaPlaca);
    }

    private void setPlaca(String novaPlaca) {
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
        } else {
            System.out.println("Erro: placa invalida.");
        }
    }

    public abstract void exibirTipo();

    public String calcularAutonomia() {
        return "Autonomia nao definida para um veiculo generico.";
    }

    public void abastecer(double quantidade) {
        if (quantidade > 0) {
            this.setNivelCombustivel(this.getNivelCombustivel() + quantidade);
        } else {
            System.out.println("Erro: quantidade de combustivel invalida.");
        }
    }

    public double getNivelCombustivel() {
        return this.nivelCombustivel;
    }

    private void setNivelCombustivel(double nivelCombustivel) {
        if (nivelCombustivel >= 0) {
            this.nivelCombustivel = nivelCombustivel;
        }
    }
}
