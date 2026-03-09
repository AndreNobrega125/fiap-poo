package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class PrincipalVeiculo {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        v1.setDono("Carlos");
        v1.setPlaca("ABC-1234");
        v1.setGas(50);
        v1.gasta(10);

        System.out.println("Dono: " + v1.getDono());
        System.out.println("Placa: " + v1.getPlaca());
        System.out.println("Gas: " + v1.getGas());
    }
}