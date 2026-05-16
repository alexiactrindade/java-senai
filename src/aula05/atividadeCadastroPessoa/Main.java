package aula05.atividadeCadastroPessoa;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        String cpf = JOptionPane.showInputDialog("Digite o CPF:");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(nome);
        pessoa1.setIdade(idade);
        pessoa1.setCpf(cpf);

        JOptionPane.showMessageDialog(
                null,
                "DADOS DA PESSOA\n\n" +
                        "Nome: " + pessoa1.getNome() +
                        "\nIdade: " + pessoa1.getIdade() +
                        "\nCPF: " + pessoa1.getCpf()
        );
    }
}
