package Logica.jogo;

import Interface.jogo.TelaInicial;

/*
Classe principal responsavel por iniciar todo o jogo
isso é feito atravez da criação de uma instancia de tela inicial
e deixando a mesma visivel
 */
public class Jogo {

    public static void main(String[] args) {

        TelaInicial play = new TelaInicial();
        play.setVisible(true);
    }
}
