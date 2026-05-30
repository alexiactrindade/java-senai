package aula07.atividade06;

public class Funcionario {
    private String nome;
    private double salario;

    // as classes que herdam de Funcionário herdam os getters/setters também

    public double calcularSalario(int diasTrabalhados) { // metodo vai retornar salário
        return (salario/30) * diasTrabalhados;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}