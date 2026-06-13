package aula08.sistemaCombateRPG;

import javax.swing.*;

public class Guerreiro extends Personagem {

    public Guerreiro (String nome, int hp, Arma arma){
        super(nome, hp, arma);
    }

    void atacar(Personagem alvo){
        JOptionPane.showMessageDialog(null, "Atacando com espada!");
        alvo.setHp(alvo.getHp())-this.getArma().getDano());
    }
    }
