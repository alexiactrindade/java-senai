package aula08.sistemaCombateRPG;

import javax.swing.*;

public class Arqueiro extends Personagem{

    public Arqueiro (String nome, int hp, Arma arma){
        super(nome, hp, arma);
    }

    @Override
    void atacar(Personagem alvo){
        JOptionPane.showMessageDialog(null, "Dispando uma flecha!!! ------->");
        alvo.setHp(alvo.getHp()-this.getArma().getDano());
    }
}