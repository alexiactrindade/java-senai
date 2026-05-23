package aula06.atividade03;

import javax.swing.*;

public class Gato extends Animal {
    @Override // significa que estamos sobescrevendo o método que já existe.
    void emitirSom() {
        JOptionPane.showMessageDialog(null, "Miauuuu miauuuu!");
    }
}
