package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("=== FIAPRIDE: Teste de Classes Abstratas ===");
        System.out.println();

        Veiculo taxi = new Carro("ABC-1234", "Chevrolet Onix", 4);
        Veiculo mototaxi = new Moto("MOT-9999", "Honda Biz", false);

        System.out.println("Identificacao dos Veiculos:");
        taxi.exibirTipo();
        mototaxi.exibirTipo();

        System.out.println();
        System.out.println("=== Polimorfismo com Classe Abstrata ===");

        Veiculo[] frota = new Veiculo[] {
            new Carro("CAR-1111", "Fiat Uno", 4),
            new Moto("MOT-2222", "Yamaha", false),
            new Carro("CAR-3333", "Honda Civic", 5)
        };

        for (Veiculo v : frota) {
            v.exibirTipo();
            System.out.println("---");
        }
    }
}
