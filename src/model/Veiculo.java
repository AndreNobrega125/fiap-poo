package br.com.fiapride.model;

public class Veiculo {

    private String dono;
    private String placa;
    private int gas;

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void adicionar(int v) {
        gas = gas + v;
    }

    public void gasta(int v) {
        gas = gas - v;
    }
}