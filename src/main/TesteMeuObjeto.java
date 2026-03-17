package br.com.fiapride.main;

import br.com.fiapride.model.Monitor;

public class TesteMeuObjeto {
    
    public static void main(String[] args) {
        
        System.out.println("--- Teste do Objeto Monitor ---\n");

        // MISSÃO 4: Passando os 3 argumentos obrigatórios (Marca, Cor, Polegadas)
        Monitor meuMonitor = new Monitor("AOC", "Preto", 27);

        System.out.println("Marca: " + meuMonitor.getMarca());
        System.out.println("Cor: " + meuMonitor.getCor());
        System.out.println("Tamanho: " + meuMonitor.getTamanhoPolegadas() + " polegadas");
        System.out.println("Status: " + (meuMonitor.isLigado() ? "Ligado" : "Desligado"));

        System.out.println("\n--- Testando ligar/desligar ---");
        meuMonitor.ligar();
        meuMonitor.desligar();

        System.out.println("\n--- Tentando burlar o sistema de polegadas ---");
        // Isso vai disparar a mensagem de erro que você programou!
        meuMonitor.setTamanhoPolegadas(200); 
    }
}
