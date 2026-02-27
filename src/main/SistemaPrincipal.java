// Importamos a classe Monitor para que o sistema a reconheça
//	import br.com.fiapride.model.Monitor;

//public class SistemaPrincipal {

   // public static void main(String[] args) {
    	//código inicial
//     	 Dentro do main...
//        // Fabriquei a primeira (Instância 1)
//    	Monitor meuMonitor = new Monitor();
//    	meuMonitor.marca = "AOC";
//    	meuMonitor.cor = "Preto";
//    	meuMonitor.led  = true;
//        
//    	// Fabriquei a segunda (Instância 2)
//    	Monitor MonitorDoProfessor = new Monitor();
//    	MonitorDoProfessor.marca = "Dell";
//    	MonitorDoProfessor.cor = "Metálica";
//    	MonitorDoProfessor.led = false;
//        
//    	System.out.println("Meu monitor é: " + meuMonitor.cor);
//    	System.out.println("O do professor é: " + MonitorDoProfessor.cor);
//        
//        // Uso do operador ternário para formatar a saída do boolean
//    	System.out.println("Meu monitor está: " + (meuMonitor.led ? "Ligado" : "Desligado"));
//    	System.out.println("O do professor está: " + (MonitorDoProfessor.led ? "Ligado" : "Desligado"));
//        
//    	System.out.println("Meu monitor é: " + meuMonitor.marca);
//    	System.out.println("O do professor é: " + MonitorDoProfessor.marca);
//
//    }
//}
    	
    	// Importamos a classe Passageiro para que o sistema a reconheça
package main;

//Importamos a classe Passageiro para que o sistema a reconheça
import model.Passageiro;

public class SistemaPrincipal {

 public static void main(String[] args) {
     // INSTANCIAÇÃO
     // O comando 'new' aloca memória para um novo objeto.
     // Criando o primeiro passageiro (Objeto 1)
     Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
     System.out.println("Regarga passageiro 1");
     passageiro1.adicionarSaldo(50.0);

     // Criando o segundo passageiro (Objeto 2)
     Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
     System.out.println("Regarga passageiro 2");
     passageiro2.adicionarSaldo(12.5);

     System.out.println("--- Sistema FiapRide ---");
     System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
     System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
     
     System.out.println("Pagando viagem do passageiro 1");
     passageiro1.pagarViagem(20);
     System.out.println("Pagando viagem do passageiro 2");
     passageiro2.pagarViagem(20);

 }
}