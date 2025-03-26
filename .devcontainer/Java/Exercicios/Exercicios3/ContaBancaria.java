package Exercicios3;

public class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;
    private String numeroConta;

    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
            System.out.printf("Depósito de %.2f realizado com sucesso!\n", valor);
        }
        else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if(valor > 0){
            if(valor <= this.saldo){
                this.saldo -= valor;
                System.out.printf("Saque de %.2f realizado com sucesso!\n", valor);
            }
            else {
                System.out.println("Erro: Saldo insuficiente para saque.");
            }

        } else{
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Método para consultar o saldo
    public double consultarSaldo() {
        return this.saldo;
    }

    // Método para exibir os dados da conta
    public String exibirDadosConta() {
        String dados = String.format("Titular: %s, Número da Conta: %s, Saldo: R$ %.1f", this.titular, this.numeroConta, this.saldo);
        return dados;
    }    
}
