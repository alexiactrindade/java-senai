package aula08.sistemaCombateRPG;

import javax.swing.*;

public class Mago extends Personagem {

    public Mago (String nome, int hp, Arma arma){
        super(nome, hp, arma);
    }

    void atacar(Personagem alvo){
        JOptionPane.showMessageDialog(null, "Lançando um feitiço!");
        alvo.setHp(alvo.getHp())-this.getArma().getDano());
    }
}
