package br.com.fiapride.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- FIAPRIDE: Teste de Polimorfismo ---\n");

        List<Veiculo> frota = new ArrayList<>();

        Carro uberX = new Carro("ABC-1234", "Chevrolet Onix", 4);
        Moto mottu = new Moto("XYZ-9999", "Honda CG 160", false);

        uberX.abastecer(50);
        mottu.abastecer(50);

        frota.add(uberX);
        frota.add(mottu);

        for (Veiculo veiculo : frota) {
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println(veiculo.calcularAutonomia());
            System.out.println("-----------------------------");
        }
    }
}
