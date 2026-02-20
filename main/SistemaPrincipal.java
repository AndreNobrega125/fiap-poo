package br.com.fiapride.main;

// Importamos a classe Monitor para que o sistema a reconheça
import br.com.fiapride.model.Monitor;

public class SistemaPrincipal {

    public static void main(String[] args) {
    	// Dentro do main...
        // Fabriquei a primeira (Instância 1)
    	Monitor meuMonitor = new Monitor();
    	meuMonitor.marca = "AOC";
    	meuMonitor.cor = "Preto";
    	meuMonitor.led  = true;
        
    	// Fabriquei a segunda (Instância 2)
    	Monitor MonitorDoProfessor = new Monitor();
    	MonitorDoProfessor.marca = "Dell";
    	MonitorDoProfessor.cor = "Metálica";
    	MonitorDoProfessor.led = false;
        
    	System.out.println("Meu monitor é: " + meuMonitor.cor);
    	System.out.println("O do professor é: " + MonitorDoProfessor.cor);
        
        // Uso do operador ternário para formatar a saída do boolean
    	System.out.println("Meu monitor está: " + (meuMonitor.led ? "Ligado" : "Desligado"));
    	System.out.println("O do professor está: " + (MonitorDoProfessor.led ? "Ligado" : "Desligado"));
        
    	System.out.println("Meu monitor é: " + meuMonitor.marca);
    	System.out.println("O do professor é: " + MonitorDoProfessor.marca);

    }
}