package aula06.atividade02;

public class Main {
        public static void main(String[] args) {

            Personagem p1 = new Personagem("Arthos", "Guerreiro", 10, 85);
            Personagem p2 = new Personagem("Lyra", "Mago", 12, 60);
            Personagem p3 = new Personagem("Kael", "Arqueiro", 8, 75);

            p1.apresentar();
            p2.apresentar();
            p3.apresentar();
    }
}
