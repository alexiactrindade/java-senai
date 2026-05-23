package aula06.atividade01;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    int paginas;

    public Livro(String titulo, String autor, int anoPublicacao, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.paginas = paginas;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Páginas: " + paginas);
    }
}
