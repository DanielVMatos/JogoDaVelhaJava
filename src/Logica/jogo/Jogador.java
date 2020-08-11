package Logica.jogo;

/*
classe pai de todos os jogadores
nela são deficidos alguns atributos comuns a todos os jogadores
aplicando o conseito de herança bem como polimorfismo atravez dos metodos abstratos
que se comportam de maneira distinta em cada subclasse
 */
public abstract class Jogador {

    // atributos comuns
    private boolean turno;
    private char simbolo;

    // construtor de jogador
    public Jogador(boolean turno, char simbolo) {
        this.turno = turno;
        this.simbolo = simbolo;
    }

    // metodos abstratos
    public abstract void Jogar(char tab[][], int posX, int posY, char simbolo);

    public abstract void Jogar2(char tab[][], char simbolo);

    // abaixo seguem as declarações dos metodos get e set dos atributos
    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public boolean isTurno() {
        return turno;
    }

    public char getSimbolo() {
        return simbolo;
    }
}
