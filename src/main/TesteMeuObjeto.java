package br.com.fiapride.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiapride.model.Monitor;
import br.com.fiapride.model.MonitorGamer;
import br.com.fiapride.model.MonitorTouch;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        System.out.println("--- Teste de Polimorfismo do Projeto Pessoal ---\n");

        List<Monitor> monitores = new ArrayList<>();

        MonitorGamer telaGamer = new MonitorGamer("Preto", "AOC", "3 pinos", 27, 144);
        MonitorTouch telaTouch = new MonitorTouch("Branco", "Wacom", "2 pinos", 24, true);

        monitores.add(telaGamer);
        monitores.add(telaTouch);

        for (Monitor monitor : monitores) {
            System.out.println("Marca: " + monitor.getMarca());
            System.out.println("Cor: " + monitor.getCor());
            System.out.println("Tamanho: " + monitor.getTamanhoPolegadas());
            System.out.println(monitor.exibirModoUso());
            System.out.println("-----------------------------");
        }
    }
}
