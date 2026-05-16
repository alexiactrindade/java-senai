package aula05.atividadeCadastroPessoa;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa() {
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome não pode ser vazio!");
        } else {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade <= 0 || idade > 130) {
            JOptionPane.showMessageDialog(null, "Idade deve estar entre 0 e 130.");
        } else {
            this.idade = idade;
        }
    }

    public void setCpf(String cpf) {

        int quantidadeDigitos = cpf.length();

        if (quantidadeDigitos != 11) {
            JOptionPane.showMessageDialog(null, "Número de dígitos inválido");
        } else {
            this.cpf = cpf;
        }
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
