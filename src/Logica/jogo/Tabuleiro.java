package Logica.jogo;

/*
Classe responsavel por gerenciar as regras do jogo.

 */
public class Tabuleiro {

    // atributos da classe
    private char tabuleiro[][] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private String resultado;
    private boolean estado = true;
    private Humano humano;
    private Jogador computador;
    private int contador = 0;

    public Tabuleiro() {
    }

    /*
    Metodo construtor do tabuleiro.
    Aqui a dificuldade passada serve para instanciar um 
    computador diferente
     */
    public Tabuleiro(int dificuldade) {
        this.humano = new Humano(true, 'X');
        switch (dificuldade) {
            case 1:
                this.computador = new Computador1(false, 'O');
                break;
            case 2:
                this.computador = new Computador2(false, 'O');
                break;
            case 3:
                this.computador = new Computador3(false, 'O');
                break;
            default:
                break;
        }

    }

    /*
    Metodo que verifica se Houve um ganhador e seta um resultado caso haja um.
     */
    public void verificaganhador() {
        for (int i = 0; i <= 2; i++) {
            if (getTabuleiro()[i][0] == getTabuleiro()[i][1] && getTabuleiro()[i][1] == getTabuleiro()[i][2] && getTabuleiro()[i][0] != ' ') {
                setResultado(String.valueOf(getTabuleiro()[i][0] + " ganhou"));
                System.out.println(getResultado());
                this.setEstado(false);
            }
        }

        for (int j = 0; j <= 2; j++) {
            if (getTabuleiro()[0][j] == getTabuleiro()[1][j] && getTabuleiro()[1][j] == getTabuleiro()[2][j] && getTabuleiro()[0][j] != ' ') {
                setResultado(String.valueOf(getTabuleiro()[0][j] + " ganhou"));
                System.out.println(getResultado());
                this.setEstado(false);
            }
        }

        if (getTabuleiro()[0][0] == getTabuleiro()[1][1] && getTabuleiro()[1][1] == getTabuleiro()[2][2] && getTabuleiro()[0][0] != ' ') {
            setResultado(String.valueOf(getTabuleiro()[0][0] + " ganhou"));
            System.out.println(getResultado());
            this.setEstado(false);
        }

        if (getTabuleiro()[0][2] == getTabuleiro()[1][1] && getTabuleiro()[1][1] == getTabuleiro()[2][0] && getTabuleiro()[0][2] != ' ') {
            setResultado(String.valueOf(getTabuleiro()[0][2] + " ganhou"));
            System.out.println(getResultado());
            this.setEstado(false);
        }

        if (!"X ganhou".equals(resultado) || !"O ganhou".equals(resultado)) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (!String.valueOf(this.getTabuleiro()[i][j]).equals(" ")) {
                        contador++;

                    }
                }
            }
        }

        if (contador == 9 && isEstado()) {
            setResultado("Empatou");
            this.setEstado(false);
        } else {
            contador = 0;
        }

    }

    // abaixo seguem as declarações dos metodos get e set dos atributos
    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    /**
     * @param tabuleiro the tabuleiro to set
     */
    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    public Humano getHumano() {
        return humano;
    }

    public void setHumano(Humano humano) {
        this.humano = humano;
    }

    public Jogador getComputador() {
        return computador;
    }

    public void setComputador(Jogador computador) {
        this.computador = computador;
    }

}
