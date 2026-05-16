package aula05.atividadeContaBancaria;

public class ContaBancaria {

    private String titular;
    private String numero;
    private double saldo;

    public ContaBancaria() {}

    public ContaBancaria(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    // Método para depositar valor na conta

    public void depositar(double valor) {

        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("VALOR INVÁLIDO");
        }
    }

    public void sacar (double valor) {
        if (valor > 0) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void informarExtrato() {
        System.out.println(this.saldo);
    }
    // GETTERS E SETTERS
    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}
    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}
    public double getSaldo() {return saldo;}
}
