package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class PrincipalVeiculo {

    public static void main(String[] args) {
        
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234", "Corolla");
        
        v1.adicionar(50);
        v1.gasta(10);
        
        System.out.println("Dono: " + v1.getDono());
        System.out.println("Placa: " + v1.getPlaca());
        System.out.println("Modelo: " + v1.getModelo());
        System.out.println("Combustível: " + v1.getCombustivel());
    }
}
