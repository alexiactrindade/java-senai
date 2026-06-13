package aula08.sistemaCombateRPG;

public abstract class Personagem {

    private String nome;
    private int hp;
    private Arma arma;

    abstract void atacar(Personagem alvo);

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Arma getArma() {
        return arma;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
}