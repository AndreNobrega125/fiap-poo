package main;

// Importando a classe Monitor do pacote model
import model.Monitor;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        System.out.println("--- Teste do Meu Projeto Pessoal ---");

        // 1. Instanciando o objeto (criando o espaço na memória)
        Monitor meuMonitor = new Monitor();

        // 2. Definindo os atributos diretamente
        meuMonitor.cor = "Preto";
        meuMonitor.marca = "AOC";
        meuMonitor.tomada = "HDMI";
        meuMonitor.led = true;

        // 3. Imprimindo o resultado no console
        System.out.println("Cor do monitor: " + meuMonitor.cor);
        System.out.println("Marca: " + meuMonitor.marca);
        System.out.println("Tomada: " + meuMonitor.tomada);
        // Operador ternário para formatar o boolean de forma legível
        System.out.println("LED: " + (meuMonitor.led ? "Ligado" : "Desligado"));
    }
}
