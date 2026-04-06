package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;

public class SistemaPrincipal {
    public static void main(String[] args) {
        
        System.out.println("--- FIAPRIDE: Teste de Frota com Herança ---\n");
        
        // Instanciando as subclasses       
        Carro uberX = new Carro("ABC-1234", "Chevrolet Onix", 4);
        Moto mottu = new Moto("XYZ-9999", "Caloi City", true);
        
        // Acessando os atributos da Superclasse (Veiculo)    
        System.out.println("🚗 Carro modelo: " + uberX.getModelo() + " | Placa: " + uberX.getPlaca());
        System.out.println("   Vagas para passageiros: " + uberX.getCapacidadePassageiros());
        
        System.out.println("\n🏍️ Moto modelo: " + mottu.getModelo() + " | Placa: " + mottu.getPlaca());
        
        if (mottu.isEletrica()) {
            System.out.println("   Atenção: Esta moto é elétrica.");
        }
    }
}