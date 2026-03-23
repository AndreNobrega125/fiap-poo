package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("--- FIAPRIDE: Inicializando Sistema ---");
        
        // 1. Criando os objetos
        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        Veiculo corolla = new Veiculo("ABC-1234", "Toyota Corolla");
        
        // 2. Associando na Viagem
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, corolla);
        
        // 3. Imprimindo o resumo
        viagemDaAna.exibirResumo();
    }
}