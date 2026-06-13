package aula08.sistemaBiblioteca;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    String nome;
    List<Livro> livros = new ArrayList<>();
    List<Livro> livrosEmprestados = new ArrayList<>();
    List<Pessoa> pessoas = new ArrayList<>();

    void emprestarLivro(Livro livro, Pessoa pessoa){

        if(livro.isDisponivel()){
            JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!\n" +
                    "Título: " + livro.getTitulo() +"\n" +
                    "Solicitante: " + pessoa.getNome()
            );
            livro.setDisponivel(false);
           livros.remove(livro);
           livrosEmprestados.add(livro);
        }
        else {
            JOptionPane.showMessageDialog(null, "Livro indisponível");
        }
    }

    void devolverLivro(Livro livro){
        livro.setDisponivel(true);
        livros.add(livro);
        livrosEmprestados.remove(livro);
    }

}
