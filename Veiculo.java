package br.com.fiapride.model;

public class Veiculo {
    
    private String dono;
    private String placa;
    private int gas;
    private String modelo; 
    
    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.modelo = modelo;
        System.out.println("🚗 Registro inicial: Um " + this.modelo + " nasceu com a placa " + this.placa);
    }

    public String getDono() {
        return dono;
    }

    public String getPlaca() {
        return placa;
    }

    public int getGas() {
        return gas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void atualizarPlaca(String novaPlaca) {
        System.out.println("🔄 Solicitada atualização de placa no Detran para o veículo " + this.modelo + "...");
        this.setPlaca(novaPlaca); 
    }

    private void setPlaca(String novaPlaca) {
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
            System.out.println("✅ Sucesso: A placa agora é " + this.placa);
        } else {
            System.out.println("❌ Erro de Validação: A placa informada é inválida!");
        }
    }

    public void adicionar(int v) {
        gas = gas + v;
    }
    
    public void gasta(int v) {
        gas = gas - v;
    }
}
