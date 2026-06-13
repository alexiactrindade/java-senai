package aula08.composicao;

public class Carro {

    String modelo;
    int anoFabricacao;
    double valor;
    Motor motor;

    public Carro() {}

    public Carro(String modelo, int anoFabricacao, double valor, int potencia, int  anoFabricacaoMotor) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
        this.motor = new Motor(potencia, anoFabricacaoMotor);
    }
}
