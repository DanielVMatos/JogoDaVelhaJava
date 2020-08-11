package Logica.jogo;

/*
a classe humano representa o jogador humano e herda 
os atributos e metodos de jogador
 */
public class Humano extends Jogador {

    // metodo construtor atribuindo os valores passados atravez do metodo super que designa a superclasse
    public Humano(boolean turno, char simbolo) {
        super(turno, simbolo);

    }

    // Metodo jogar sobrescrito
    @Override
    public void Jogar(char tab[][], int posX, int posY, char simbolo) {
        if (String.valueOf(tab[posX][posY]).equals(" ")) {
            tab[posX][posY] = simbolo;
            this.setTurno(false);
        } else {
            System.out.println("posição invalida");
            this.setTurno(true);
        }

    }

    // Metodo jogar2 sobrescrito (não é usado mas precisa ser declarado)
    @Override
    public void Jogar2(char[][] tab, char simbolo) {

    }

}
