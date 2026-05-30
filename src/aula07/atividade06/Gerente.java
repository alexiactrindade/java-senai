package aula07.atividade06;

public class Gerente extends Funcionario {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(int diasTrabalhados) {
       return super.calcularSalario(diasTrabalhados) + bonus;
    }
}