package aula04;

import javax.swing.*;
import java.util.ArrayList;

public class atividadeListas {
    public static void atividade01() {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        while (true) {
            String entradaStr = JOptionPane.showInputDialog("Informe um número maior que 0: ");
            Integer entradaInt = Integer.parseInt(entradaStr);

            if (entradaInt == 0) {
                break;
            }

            //verifica se o numero par
            if (entradaInt % 2 == 0) {
                numeros.add(entradaInt);
            }

        }

        JOptionPane.showMessageDialog(null, numeros);

    }

    public static void atividade02() {
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            String entrada = JOptionPane.showInputDialog("Insira um nome. Pare digitando X: ");

            if (entrada.equals("x")) {
                break;
            }
            if (!nomes.contains(entrada)) {
                nomes.add(entrada);
            } else {
                JOptionPane.showMessageDialog(null, "Esse número já contém na lista");
                break;
            }

        }
    }

    public static void atividade03() {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String entrada = JOptionPane.showInputDialog("Insira 5 numeros inteiros: ");
            Integer entradaInt = Integer.parseInt(entrada);
            numeros.add(entradaInt);
        }


        while (true) {
            String indiceAlterado = JOptionPane.showInputDialog("Show, remova um número da lista informando sua posição: ");
            Integer indice = Integer.parseInt(indiceAlterado);

            if (indice >= 0 && indice < numeros.size()) {
                String alteracao = JOptionPane.showInputDialog("Troque por um número diferente: ");
                Integer alteracaoInt = Integer.parseInt(alteracao);

                numeros.set(indice, alteracaoInt);
                JOptionPane.showMessageDialog(null, numeros);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido! Tente novamente");
            }
        }
    }
}