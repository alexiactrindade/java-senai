package aula07.atividade08;

public abstract class Veiculo {  // não permite instanciação do objeto na main ou em outra classe
    String modelo;
    int ano;

    abstract void acelerar(); // vc não pode instanciar nada dessa classe, quem pode instanciar são os filhos da classe
}
