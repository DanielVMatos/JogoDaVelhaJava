package Interface.jogo;

/*
Essa classe é responsavel por instanciar um tabuleiro bem como adicionar
o mesmo a uma Jlabel. Também é resposavel por exibir o placar, alterar a
dificuldade(voltando para tela anterior) e reiniciar o jogo.
 */
public class TelaTabuleiro extends javax.swing.JFrame {

    //declaração dos atributos privados para exibição em tela.
    private DesenhaTabuleiro tab;
    private int dificuldade2;
    private int x = 0;
    private int o = 0;

    public TelaTabuleiro() {
        initComponents();
    }

    /* metodo construtor com atributo dificuldade
    * o metodo além de instanciar um novo desenhaTabuleiro
    * seta a dificuldade2 para que possa ser usada ao reiniciar o jogo.
     */
    TelaTabuleiro(int dificuldade) {
        initComponents();
        tab = new DesenhaTabuleiro(dificuldade);
        paineltabuleiro.add(tab);
        dificuldade2 = dificuldade;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dificuldade = new javax.swing.JButton();
        jogarnovamente = new javax.swing.JButton();
        placarx = new javax.swing.JLabel();
        placaro = new javax.swing.JLabel();
        paineltabuleiro = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Informações:");

        dificuldade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dificuldade.setText("Dificuldade");
        dificuldade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dificuldadeMouseClicked(evt);
            }
        });
        dificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldadeActionPerformed(evt);
            }
        });

        jogarnovamente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jogarnovamente.setText("Jogar Novamente");
        jogarnovamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogarnovamenteMouseClicked(evt);
            }
        });

        placarx.setText("Vitorias de X:");

        placaro.setText("Vitorias de O:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placarx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placaro, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jogarnovamente)
                .addGap(40, 40, 40)
                .addComponent(dificuldade)
                .addGap(44, 44, 44))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dificuldade, jogarnovamente});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placarx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placaro))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jogarnovamente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dificuldade, jogarnovamente});

        javax.swing.GroupLayout paineltabuleiroLayout = new javax.swing.GroupLayout(paineltabuleiro);
        paineltabuleiro.setLayout(paineltabuleiroLayout);
        paineltabuleiroLayout.setHorizontalGroup(
            paineltabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        paineltabuleiroLayout.setVerticalGroup(
            paineltabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(paineltabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(paineltabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dificuldadeActionPerformed

    /*
    Metodo responsavel por voltar a tela de seleção de dificuldade
    instancia a TelaInicial e fecha a tela atual. 
     */
    private void dificuldadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dificuldadeMouseClicked
        TelaInicial novo = new TelaInicial();
        novo.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_dificuldadeMouseClicked
    /*
    Metodo responsavel por reiniciar o jogo bem como setar o placar atual.
    o placar só é atualizado quando o jogador clica em jogar novamente.
    o metodo pega o resultado que vem do objeto "tab" que é uma instancia da 
    classe DesenhaTabuleiro.
     */
    private void jogarnovamenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogarnovamenteMouseClicked

        if (tab.getResultado().equals("X ganhou")) {
            x++;
        } else if (tab.getResultado().equals("O ganhou")) {
            o++;
        }
        placarx.setText("Vitorias de X: " + x);
        placaro.setText("Vitorias de O: " + o);

        paineltabuleiro.remove(tab);
        tab = new DesenhaTabuleiro(dificuldade2);
        paineltabuleiro.add(tab);
        tab.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_jogarnovamenteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaTabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaTabuleiro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dificuldade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jogarnovamente;
    private javax.swing.JPanel paineltabuleiro;
    private javax.swing.JLabel placaro;
    private javax.swing.JLabel placarx;
    // End of variables declaration//GEN-END:variables

    // abaixo seguem as declarações dos metodos get e set dos atributos
    public int getDificuldade2() {
        return dificuldade2;
    }

    public void setDificuldade2(int dificuldade2) {
        this.dificuldade2 = dificuldade2;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

}
