package aula08.agregacao;

public class Main {
    public static void main(String[] args) {
    Selecao selecao1 = new Selecao();
    selecao1.pais = "Brasil";
    selecao1.continente = "America do Sul";
    selecao1.titulosDeCopa = 6;

    Tecnico tecnico1 = new Tecnico();
    tecnico1.nome = "Carlos Ancelotti";
    tecnico1.nacionalidade = "Italiano";
    tecnico1.idade = 67;
    tecnico1.titulosDeCopa = 0;

    Tecnico tecnico2 = new Tecnico();
    tecnico2.nome = "Fernando Diniz";
    tecnico2.nacionalidade = "Brasileiro";
    tecnico2.idade = 50;
    tecnico2.titulosDeCopa = 0;

    selecao1.tecnico = tecnico2;
    selecao1.tecnico.apresentacao();
;    }
}
