package br.com.fiapride.main;

import br.com.fiapride.model.Monitor;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        System.out.println("--- Teste do Objeto Monitor ---\n");

        Monitor meuMonitor = new Monitor("Preto", "AOC", "HDMI", 27); // ← 4 parâmetros agora

        System.out.println("Marca: " + meuMonitor.getMarca());
        System.out.println("Cor: " + meuMonitor.getCor());
        System.out.println("Entrada: " + meuMonitor.getTomada());
        System.out.println("Tamanho: " + meuMonitor.getTamanhoPolegadas() + " polegadas");
        System.out.println("Status: " + (meuMonitor.isLigado() ? "Ligado" : "Desligado"));

        System.out.println("\n--- Testando ligar/desligar ---");
        meuMonitor.ligar();
        meuMonitor.ligar();
        meuMonitor.desligar();
        meuMonitor.desligar();

        System.out.println("\n--- Tentando burlar o sistema ---");
        meuMonitor.setTamanhoPolegadas(200); // bloqueado
        meuMonitor.setTamanhoPolegadas(-5);  // bloqueado
        System.out.println("Tamanho continua: " + meuMonitor.getTamanhoPolegadas() + " polegadas");
    }
}
