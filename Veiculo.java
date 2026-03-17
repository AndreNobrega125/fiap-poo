package br.com.fiapride.model;

public class Veiculo {
    
    private String dono;
    private String placa;
    private int combustivel;
    private String modelo; 
    
    public Veiculo(String dono, String placa, String modelo) {
        this.dono = dono;
        this.setPlaca(placa);
        this.modelo = modelo;
        this.combustivel = 0;
        System.out.println("🚗 Registro inicial: Um " + this.modelo + " de " + this.dono + " nasceu com a placa " + this.placa);
    }

    public String getDono() {
        return dono;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setDono(String dono) {
        this.dono = dono;
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

    public void adicionar(int quantidade) {
        if (quantidade > 0) {
            this.combustivel += quantidade;
        } else {
            System.out.println("❌ Erro: A quantidade de abastecimento deve ser maior que zero.");
        }
    }
    
    public void gasta(int quantidade) {
        if (quantidade > 0 && this.combustivel >= quantidade) {
            this.combustivel -= quantidade;
        } else {
            System.out.println("❌ Erro: Combustível insuficiente para essa viagem ou quantidade inválida.");
        }
    }
}
