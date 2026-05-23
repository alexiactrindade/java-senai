package aula06.atividade01;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro(
                "Dom Casmurro",
                "Machado de Assis",
                1899,
                256
        );

        Livro livro2 = new Livro(
                "1984",
                "George Orwell",
                1949,
                328
        );

        livro1.exibirInfo();
        livro2.exibirInfo();
    }
}
