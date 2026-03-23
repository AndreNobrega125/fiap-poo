package br.com.fiapride.model;

public class Veiculo {
    private String placa;
    private String modelo;

    // Construtor exige apenas placa e modelo, igual ao seu Astah
    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa); // Usa o setter privado para validar
        this.modelo = modelo;
    }

    public String getPlaca() { return this.placa; }
    public String getModelo() { return this.modelo; }

    public void atualizarPlaca(String novaPlaca) {
        this.setPlaca(novaPlaca);
    }

    private void setPlaca(String novaPlaca) {
        this.placa = novaPlaca;
    }
}