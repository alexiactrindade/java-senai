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

    public static void atividade04() {
        ArrayList<String> nomes = new ArrayList<>();

        //Recebe pelo menos 5 nomes do usuario, até ele decidir parar.
        while (true) {
            String entrada = JOptionPane.showInputDialog("Informe um nome: ");
            if (entrada == null) {
                if (nomes.size() >= 5) {
                    break;
                } else {
                    int faltam = 5 - nomes.size();
                    JOptionPane.showMessageDialog(null, "Ainda faltam " + faltam + " nomes.");
                }
            } else {
                nomes.add(entrada);
            }

        }
        JOptionPane.showMessageDialog(null, "A lista tem " + nomes.size() + " nomes.");
        JOptionPane.showMessageDialog(null,
                "Primeiro nome: " + nomes.getFirst() + " \n" +
                        "Ultimo nome: " + nomes.getLast());

        String novoNome = JOptionPane.showInputDialog("Informe mais um nome para substituir " + nomes.get(2) + ": ");

        if (nomes.size() <= 3) {
            nomes.set(2, novoNome);
        }

        String nomeEliminar = JOptionPane.showInputDialog("Informe um nome para eliminar: ");
        boolean removeuNome = nomes.remove(nomeEliminar);

        JOptionPane.showMessageDialog(null, "Nome " + (removeuNome ? "" : "não ") + "removido!!");

        String nomeVerificar = JOptionPane.showInputDialog("Escolha outro nome: ");
        if (nomes.contains(nomeVerificar)) {
            JOptionPane.showMessageDialog(null, "OK, o nome existe na lista");
        } else {
            JOptionPane.showMessageDialog(null, "O nome não existe na lista");
        }
    }

    public static void atividade05() {
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {

            String entrada = JOptionPane.showInputDialog("Informe a nota" + (notas.size()+1) + ": "");

            if (entrada == null) {
                if (notas.size() >= 2) {
                    break;
                }else {
                    JOptionPane.showMessageDialog(null, "Informe pelo menos 2 notas.");
                    continue;
                }
            }

            double nota = Double.parseDouble(entrada);
            notas.add(nota);
        }

        double maiorNota = notas.get(0);
        double menorNota = notas.get(0);
        double soma = 0;

        ArrayList<Double> maioresQueSete = new ArrayList<>();

        for (int i = 0; i < notas.size(); i++) {

            double nota = notas.get(i);

            soma += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            if (nota > 7) {
                maioresQueSete.add(nota);
            }
        }

        double mediaGeral = soma / notas.size();

        JOptionPane.showMessageDialog(null, "Média geral: " + mediaGeral);
        JOptionPane.showMessageDialog(null, "Maior nota: " + maiorNota);
        JOptionPane.showMessageDialog(null, "Menor nota: " + menorNota);
        JOptionPane.showMessageDialog(null, "Notas maiores que 7: " + maioresQueSete);
    }
}