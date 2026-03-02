package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    // Construtor (Aula 3)
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    // Métodos de comportamento (Aula 3)
    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }
        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: R$" + this.saldo);
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: R$" + this.saldo);
    }

    // Getters e Setters
    public String getNome() { return this.nome; }
    public String getCpf() { return this.cpf; }
    public double getSaldo() { return this.saldo; }
}
