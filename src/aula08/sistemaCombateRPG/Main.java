package aula08.sistemaCombateRPG;

public class Main {
    public static void main(String[] args) {
        Arqueiro arqueiro1 = new Arqueiro("Robin Hood", 100, new Arma("Arco"),10);
        Mago mago1 = new Mago("Merlin", 100, new Arma("Cajado"),10);

        arqueiro1.atacar(mago1);
        System.out.println("HP do mago1: " + mago1.getHp());
        arqueiro1.atacar(mago1);
        System.out.println("HP do mago1: " + mago1.getHp());

    }
}
