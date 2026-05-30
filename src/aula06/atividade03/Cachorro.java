package aula06.atividade03;

import javax.swing.*;

public class Cachorro extends aula06.atividade03.Animal {

    String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    void emitirSom() {
        JOptionPane.showMessageDialog(null, "Au au au"); // sobrescrevendo metodo
        super.emitirSom(); // vai usar o som genérico, pois aproveita o método estabelecido na classe
    }

}