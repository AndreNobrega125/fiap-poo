package br.com.fiapride.main;

import br.com.fiapride.model.Computador;
import br.com.fiapride.model.Monitor;

public class TesteMeuObjeto {
    public static void main(String[] args) {
        System.out.println("--- Teste do Objeto Monitor (Aula 5) ---\n");

        // 1. Criamos o Computador primeiro
        Computador meuPc = new Computador("Dell", "Intel i7");
        
        // 2. Criamos o Monitor e passamos o PC para ele (Associação!)
        Monitor meuMonitor = new Monitor("AOC", "Preto", 27, meuPc);

        // 3. Testando a interação
        meuMonitor.ligar();
        meuMonitor.exibirImagem(); // Vai imprimir a marca do PC que associamos
    }
}