package aula06.atividade02;

import javax.swing.*;

public class Personagem {
        String nome;
        String classe;
        int nivel;
        int forca;

        public Personagem(String nome, String classe, int nivel, int forca) {
            this.nome = nome;
            this.classe = classe;
            this.nivel = nivel;
            this.forca = forca;
        }

        public void apresentar() {
            String mensagem = "Sou " + nome + ", " + classe +
                    " de nível " + nivel + " com força " + forca;

            JOptionPane.showMessageDialog(null, mensagem);
        }
}
