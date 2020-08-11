package Logica.jogo;

/*
classe que representa o computador no nivel medio
 */
public class Computador2 extends Jogador {

    // atributos
    private int x;
    private int y;
    Integer[] p = new Integer[9];
    private int posicao = 0;

    // construtor
    public Computador2(boolean turno, char simbolo) {
        super(turno, simbolo);

    }

    // Metodo jogar sobrescrito
    @Override
    public void Jogar(char[][] tab, int posX, int posY, char simbolo) {
        tab[posX][posY] = simbolo;
    }

    // metodo que seta um X e um Y para ser usado como indice da matriz para definir uma jogada  
    public void verificarposicao(int x) {
        switch (x) {
            case 0:
                setX(0);
                setY(0);
                break;
            case 1:
                setX(0);
                setY(1);
                break;
            case 2:
                setX(0);
                setY(2);
                break;

            case 3:
                setX(1);
                setY(0);
                break;
            case 4:
                setX(1);
                setY(1);
                break;
            case 5:
                setX(1);
                setY(2);
                break;
            case 6:
                setX(2);
                setY(0);
                break;
            case 7:
                setX(2);
                setY(1);
                break;
            case 8:
                setX(2);
                setY(2);
                break;
            default:
        }
    }

    // Metodo jogar2 sobrescrito
    @Override
    public void Jogar2(char[][] tab, char simbolo) {
        // segue dando preferencia a linha livre
        verificarposicao(posicao);
        if (String.valueOf(tab[this.getY()][this.getX()]).equals(" ")) {
            tab[this.getY()][this.getX()] = simbolo;
            this.setTurno(false);
        } else {
            posicao++;
            Jogar2(tab, simbolo);
        }
    }

    // abaixo seguem as declarações dos metodos get e set dos atributos
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
