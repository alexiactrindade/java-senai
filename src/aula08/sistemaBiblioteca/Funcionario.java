package aula08.sistemaBiblioteca;
import aula08.sistemaBiblioteca.Pessoa;

public class Funcionario extends Pessoa{

    private String cargo;

    public Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
