package aula08.composicao;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Gol";
        carro.anoFabricacao = 2015;
        carro.valor = 50000;
        carro.motor.potenciaCv = 100;
        carro.motor.anoFabricacao = 2015;

        Carro carro2 = new Carro("Ecosport", 2020, 60000, 150, 2020);
    }
}
