package br.com.fiapride.model;

public class Moto extends Veiculo {

    private boolean isEletrica;

    public Moto(String placa, String modelo, boolean isEletrica) {
        super(placa, modelo);
        this.isEletrica = isEletrica;
    }

    public boolean isEletrica() {
        return this.isEletrica;
    }

    @Override
    public String calcularAutonomia() {
        if (this.isEletrica) {
            return "Moto eletrica: autonomia calculada de forma especifica para bateria.";
        }

        double kmRestante = this.getNivelCombustivel() * 35.0;
        return "Autonomia da moto: " + kmRestante + " km.";
    }
}
