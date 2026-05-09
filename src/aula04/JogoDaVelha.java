package aula04;

import java.util.Scanner;

public class JogoDaVelha {

    static String[][] gradeJogoDaVelha = new String[3][3]; // uma matriz bidimensional receberá uma matriz de 3 linhas e 3 colunas

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean finalDoJogo = false; // false indica que o jogo ainda NÃO terminou. True significa que o jogo finalizou

        String jogadorAtual = "O";

        // inicialização tabuleiro
        for (int i = 0; i < 3; i++) { // O i será executado 3 vezes. Para cada vez que o i executar, o x executará 3 vezes

            for (int x = 0; x < 3; x++) {

                gradeJogoDaVelha[i][x] = " "; // indica que o campo (linha x coluna) começa vazio

            }
        }

        while (!finalDoJogo) { // enquanto o jogo está sendo executado...

            mostrarGradeJogoDaVelha();

            // Receber a jogada do usuário
            System.out.println("É a vez do jogador " + jogadorAtual);

            System.out.println("Informe a linha (1-3): ");
            int linhaJogada = sc.nextInt() - 1;

            System.out.println("Informe a coluna (1-3): ");
            int colunaJogada = sc.nextInt() - 1;

            // verificar se a jogada é válida
            if (gradeJogoDaVelha[linhaJogada][colunaJogada].equals(" ")) { // se o espaço estiver vazio, pode atribuir!

                gradeJogoDaVelha[linhaJogada][colunaJogada] = jogadorAtual; // preenche com O ou X que corresponde ao jogador

                // verificar vitória
                if (verificarVitoria()) {

                    mostrarGradeJogoDaVelha();

                    System.out.println("Jogador " + jogadorAtual + " venceu!");

                    finalDoJogo = true;

                }

                // verificar empate
                else if (verificarEmpate()) {

                    mostrarGradeJogoDaVelha();

                    System.out.println("O jogo empatou!");

                    finalDoJogo = true;

                }

                else {

                    // Alternar jogador
                    jogadorAtual = jogadorAtual.equals("O") ? "X" : "O";

                }

            } else {

                System.out.println("Jogada inválida. Tente novamente!");

            }
        }

        sc.close();
    }

    public static void mostrarGradeJogoDaVelha() {

        for (int i = 0; i < 3; i++) { // percorre as linhas

            System.out.print("|");

            for (int x = 0; x < 3; x++) { // percorre as colunas

                System.out.print(gradeJogoDaVelha[i][x]);
                System.out.print("|");

            }

            System.out.println(" ");
        }
    }

    public static boolean verificarVitoria() {

        // verificar Horizontais
        for (int i = 0; i < 3; i++) {

            if (
                    !gradeJogoDaVelha[i][0].equals(" ") &&
                            gradeJogoDaVelha[i][0].equals(gradeJogoDaVelha[i][1]) &&
                            gradeJogoDaVelha[i][0].equals(gradeJogoDaVelha[i][2])
            ) {

                return true;

            }
        }

        // verificar Verticais
        for (int x = 0; x < 3; x++) {

            if (
                    !gradeJogoDaVelha[0][x].equals(" ") &&
                            gradeJogoDaVelha[0][x].equals(gradeJogoDaVelha[1][x]) &&
                            gradeJogoDaVelha[0][x].equals(gradeJogoDaVelha[2][x])
            ) {

                return true;

            }
        }

        // verificar Diagonal principal
        if (
                !gradeJogoDaVelha[0][0].equals(" ") &&
                        gradeJogoDaVelha[0][0].equals(gradeJogoDaVelha[1][1]) &&
                        gradeJogoDaVelha[0][0].equals(gradeJogoDaVelha[2][2])
        ) {

            return true;

        }

        // verificar Diagonal secundária
        if (
                !gradeJogoDaVelha[0][2].equals(" ") &&
                        gradeJogoDaVelha[0][2].equals(gradeJogoDaVelha[1][1]) &&
                        gradeJogoDaVelha[0][2].equals(gradeJogoDaVelha[2][0])
        ) {

            return true;

        }

        return false;
    }

    public static boolean verificarEmpate() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (gradeJogoDaVelha[i][j].equals(" ")) {

                    return false;

                }
            }
        }

        return true;
    }
}
