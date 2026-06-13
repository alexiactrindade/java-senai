package aula08.sistemaBiblioteca;

import aula08.sistemaBiblioteca.Aluno;
import aula08.sistemaBiblioteca.Biblioteca;
import aula08.sistemaBiblioteca.Funcionario;
import aula08.sistemaBiblioteca.Livro;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Aluno aluno1 = new Aluno("Daniel", "123456789101", "001");
        Aluno aluno2 = new Aluno("Maria", "123456789101", "002");

        Funcionario funcionario1 = new Funcionario("João", "123456789101", "Supervisor");

        Livro livro1 = new Livro("Bíblia", "Vários", "1234567891011", true);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", "1234567891011", true);
        Livro livro3 = new Livro("O Cortiço", "Aluisio Azevedo", "1234567891011", true);

        biblioteca.livros.add(livro1);
        biblioteca.livros.add(livro2);
        biblioteca.livros.add(livro3);

        while (true) {

            String opcao = JOptionPane.showInputDialog(" - Biblioteca - \n" +
                    "Digite 1 para emprestar \n" +
                    "Digite 2 para devolver \n" +
                    "Lista de livros disponiveis: " + biblioteca.livros + "\n" +
                    "Lista de livros emprestados: " + biblioteca.livrosEmprestados);

            if (opcao.equals("1")) {

                String livroStr = JOptionPane.showInputDialog("Informe o livro:");

                Livro livroEncontrado = null;

                for (Livro livro : biblioteca.livros) {
                    if (livro.toString().equals(livroStr)) {
                        livroEncontrado = livro;
                    }
                }
                biblioteca.emprestarLivro(livroEncontrado, aluno1);

            } else if (opcao.equals("2")) {

                Livro livroEncontrado = null;

                String livroStr = JOptionPane.showInputDialog("Informe o livro:");

                for (Livro livro : biblioteca.livrosEmprestados) {
                    if (livro.toString().equals(livroStr)) {
                        biblioteca.devolverLivro(livro);
                    }
                }

            }


        }

    }

}
