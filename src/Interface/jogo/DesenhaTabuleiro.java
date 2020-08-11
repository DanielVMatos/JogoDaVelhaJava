package Interface.jogo;

import Logica.jogo.Tabuleiro;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
Metodo responsavel por desenhar o tabuleiro.
Esse metodo instancia a classe tabuleiro que faz o controle 
das regras do jogo.
 */
public class DesenhaTabuleiro extends javax.swing.JPanel {

    private static int dificuldade2;
    private int cordX;
    private int cordY;
    private Tabuleiro tabuleirod;
    Font fonte = new Font("Times New Roman", 1, 56);
    private String resultado = " ";

    public DesenhaTabuleiro() {
        initComponents();

    }

    /*
    Metodo construtor do desenhatabuleiro que recebe a dificuldade e instancia um tabuleiro
    de acordo com a dificuldade passada. Essa dificuldade vem da Tela inicial.
     */
    public DesenhaTabuleiro(int dificuldade) {
        initComponents();
        setSize(300, 300);
        setVisible(true);
        DesenhaTabuleiro.setDificuldade2(dificuldade);
        tabuleirod = new Tabuleiro(dificuldade);

    }

    /*
    Subscrevendo o metodo paint do Graphics para desenhar o tabuleiro e as 
    jogadas.
     */
    @Override
    public void paint(Graphics g) {
        // desenha caso o estado do tabuleiro seja verdadeiro ou seja o jogo não acabou
        if (tabuleirod.isEstado()) {
            g.setColor(Color.white);
            g.fillRect(0, 0, 300, 300);

            g.setColor(Color.black);
            g.drawLine(0, 100, 300, 100);
            g.drawLine(0, 200, 300, 200);
            g.drawLine(100, 0, 100, 300);
            g.drawLine(200, 0, 200, 300);

            // aqui as jogadas são desenhadas de acordo com a matriz que vem da instancia do tabuleiro
            for (int lin = 0; lin < 3; lin++) {
                for (int col = 0; col < 3; col++) {
                    g.setFont(fonte);
                    g.drawString(String.valueOf(tabuleirod.getTabuleiro()[lin][col]), 30 + lin * 100, 70 + col * 100);
                }
            }
            // caso tenha acabado o jogo desenha na tela quem venceu
        } else {
            g.setColor(Color.white);
            g.fillRect(0, 0, 300, 300);
            g.setColor(Color.black);
            g.setFont(fonte);
            g.drawString(tabuleirod.getResultado(), 25, 150);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    /*
    Utiliza a entrada de eventos click na tela para determinar a posição da jogada
    pegando as cordenadas de X e Y em que o mouse estava e dividindo por 200 temos
    um numero inteiro que representa a linha e a coluna da matriz
     */
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        setCordX(evt.getX() / 100);
        setCordY(evt.getY() / 100);
        /* vericicamos se o jogo está ativo caso esteja realizamos a jogada do humano 
        em seguida analizamos se a posição é valida atravez do metodo Jogar e realizamos a jogada
        e verificamos se houve ganhador
         */
        if (tabuleirod.isEstado() && tabuleirod.getHumano().isTurno()) {
            tabuleirod.getHumano().Jogar(tabuleirod.getTabuleiro(), cordX, cordY, tabuleirod.getHumano().getSimbolo());
            tabuleirod.getComputador().setTurno(true);
            repaint();
            tabuleirod.verificaganhador();
            setResultado(tabuleirod.getResultado());

        }

        /*
        em seguida realizamos o mesmo processo só que dessa vez com a jogada do computador.
         */
        if (tabuleirod.isEstado() && tabuleirod.getComputador().isTurno() && !tabuleirod.getHumano().isTurno()) {
            tabuleirod.getComputador().Jogar2(tabuleirod.getTabuleiro(), tabuleirod.getComputador().getSimbolo());
            tabuleirod.getHumano().setTurno(true);
            repaint();
            tabuleirod.verificaganhador();
            setResultado(tabuleirod.getResultado());
        }


    }//GEN-LAST:event_formMouseClicked

    // abaixo seguem as declarações dos metodos get e set dos atributos
    public int getCordX() {
        return cordX;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    public int getDificuldade2() {
        return dificuldade2;
    }

    public static void setDificuldade2(int dificuldade2) {
        DesenhaTabuleiro.dificuldade2 = dificuldade2;
    }

    public Tabuleiro getTabuleirod() {
        return tabuleirod;
    }

    public void setTabuleirod(Tabuleiro tabuleirod) {
        this.tabuleirod = tabuleirod;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
