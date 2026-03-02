package br.com.fiapride.main;

import br.com.fiapride.model.Monitor;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        System.out.println("--- Teste do Objeto Monitor ---\n");

        Monitor meuMonitor = new Monitor("Preto", "AOC", "HDMI");

        System.out.println("Marca: " + meuMonitor.getMarca());
        System.out.println("Cor: " + meuMonitor.getCor());
        System.out.println("Entrada: " + meuMonitor.getTomada());
        System.out.println("Status: " + (meuMonitor.isLigado() ? "Ligado" : "Desligado"));

        System.out.println("\n--- Testando Métodos ---");
        meuMonitor.ligar();
        meuMonitor.ligar();    // erro: já ligado
        meuMonitor.desligar();
        meuMonitor.desligar(); // erro: já desligado
    }
}
