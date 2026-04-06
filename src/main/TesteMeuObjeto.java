package br.com.fiapride.main;

import br.com.fiapride.model.Computador;
import br.com.fiapride.model.MonitorGamer;
import br.com.fiapride.model.MonitorTouch;

public class TesteMeuObjeto {
    public static void main(String[] args) {
        System.out.println("--- Teste do Objeto Pessoal com Herança ---\n");

        Computador meuPc = new Computador("Dell", "Intel i7");
        
        MonitorGamer telaGamer = new MonitorGamer("AOC", "Preto", 27, meuPc, 144);
        MonitorTouch telaTouch = new MonitorTouch("Wacom", "Branco", 24, meuPc, true);

        telaGamer.ligar();
        telaGamer.exibirImagem();
        telaGamer.ativarModoGamer(); 
        
        System.out.println("\nMonitor Touch suporta caneta? " + telaTouch.isSuportaCaneta());
    }
}