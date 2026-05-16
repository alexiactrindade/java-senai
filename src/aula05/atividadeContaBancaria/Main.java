package aula05.atividadeContaBancaria;

import javax.swing.*;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Maria","123456789");

        String depositoStr = JOptionPane.showInputDialog("Digite o valor a ser depositado");
        double deposito = Double.parseDouble(depositoStr);

        conta1.depositar(deposito);

        String saqueStr = JOptionPane.showInputDialog("Digite o valor a ser sacado");
        double saque = Double.parseDouble(saqueStr);

        conta1.sacar(saque);
        conta1.informarExtrato();


    }



}
