package guisenadevs.classes;

/**
 * @author Guilherme
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int vals[][] = new int[3][3];
    int xo = 1;
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++){
            vals [i][j] = 2;
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblRes = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);

        btn1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        lblRes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRes.setText("Vez de X");

        btnReset.setText("Resetar");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (xo == 1) btn1.setText("X");
        else btn1.setText("O");
        btn1.setEnabled(false);
        vals[0][0] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (xo == 1) btn2.setText("X");
        else btn2.setText("O");
        btn2.setEnabled(false);
        vals[0][1] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (xo == 1) btn3.setText("X");
        else btn3.setText("O");
        btn3.setEnabled(false);
        vals[0][2] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (xo == 1) btn4.setText("X");
        else btn4.setText("O");
        btn4.setEnabled(false);
        vals[1][0] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (xo == 1) btn5.setText("X");
        else btn5.setText("O");
        btn5.setEnabled(false);
        vals[1][1] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (xo == 1) btn6.setText("X");
        else btn6.setText("O");
        btn6.setEnabled(false);
        vals[1][2] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (xo == 1) btn7.setText("X");
        else btn7.setText("O");
        btn7.setEnabled(false);
        vals[2][0] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (xo == 1) btn8.setText("X");
        else btn8.setText("O");
        btn8.setEnabled(false);
        vals[2][1] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (xo == 1) btn9.setText("X");
        else btn9.setText("O");
        btn9.setEnabled(false);
        vals[2][2] = xo;
        trocaPlayer();
        vefFim();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btn1.setEnabled(true);
        btn1.setText(" ");
        btn2.setEnabled(true);
        btn2.setText(" ");
        btn3.setEnabled(true);
        btn3.setText(" ");
        btn4.setEnabled(true);
        btn4.setText(" ");
        btn5.setEnabled(true);
        btn5.setText(" ");
        btn6.setEnabled(true);
        btn6.setText(" ");
        btn7.setEnabled(true);
        btn7.setText(" ");
        btn8.setEnabled(true);
        btn8.setText(" ");
        btn9.setEnabled(true);
        btn9.setText(" ");
        xo = 1;
        for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++){
            vals [i][j] = 2;
            }
        }
        lblRes.setText("Vez de X");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    void trocaPlayer(){
        if (xo == 1) {
            xo = 0;
            lblRes.setText("Vez de O");
        }
        else if (xo == 0) {
            xo = 1;
            lblRes.setText("Vez de X");
        }
    }
    void vefFim(){
        //Horizontal
        if(vals[0][0] == 0 && vals[0][1] == 0 && vals[0][2] == 0){
            lblRes.setText("O ganhou");
            enabledFalse();
        }else if(vals[1][0] == 0 && vals[1][1] == 0 && vals[1][2] == 0){
            lblRes.setText("O ganhou");
            enabledFalse();
        }else if(vals[2][0] == 0 && vals[2][1] == 0 && vals[2][2] == 0){
            lblRes.setText("O ganhou");
            enabledFalse();
        }else if (vals[0][0] == 1 && vals[0][1] == 1 && vals[0][2] == 1){
            lblRes.setText("X ganhou");
            enabledFalse();
        }else if(vals[1][0] == 1 && vals[1][1] == 1 && vals[1][2] == 1){
            lblRes.setText("X ganhou");
            enabledFalse();
        }else if(vals[2][0] == 1 && vals[2][1] == 1 && vals[2][2] == 1){
            lblRes.setText("X ganhou");
            enabledFalse();
        //Vertical
        }else if(vals[0][0] == 0 && vals[1][0] == 0 && vals[2][0] == 0){
            lblRes.setText("O ganhou");
            enabledFalse();
        }else if(vals[0][1] == 0 && vals[1][1] == 0 && vals[2][1] == 0){
            lblRes.setText("O ganhou");
            enabledFalse();
        }else if(vals[0][2] == 0 && vals[1][2] == 0 && vals[2][2] == 0){
            lblRes.setText("O ganhou");
            enabledFalse();
            
        }else if(vals[0][0] == 1 && vals[1][0] == 1 && vals[2][0] == 1){
            lblRes.setText("X ganhou");
            enabledFalse();
        }else if(vals[0][1] == 1 && vals[1][1] == 1 && vals[2][1] == 1){
            lblRes.setText("X ganhou");
            enabledFalse();
        }else if(vals[0][2] == 1 && vals[1][2] == 1 && vals[2][2] == 1){
            lblRes.setText("X ganhou");
            enabledFalse();
            //Diagonal
        }else if(vals[0][0] == 0 && vals[1][1] == 0 && vals[2][2] == 0){
            lblRes.setText("O ganhou");
            enabledFalse();
        }else if(vals[0][2] == 0 && vals[1][1] == 0 && vals[2][0] == 0){
            lblRes.setText("O ganhou");
            enabledFalse();
        }else if(vals[0][0] == 1 && vals[1][1] == 1 && vals[2][2] == 1){
            lblRes.setText("X ganhou");
            enabledFalse();
        }else if(vals[0][2] == 1 && vals[1][1] == 1 && vals[2][0] == 1){
            lblRes.setText("X ganhou");
            enabledFalse();
        }else if (getEnabled()){
            lblRes.setText("Velha");
            enabledFalse();
        }
    }
    void enabledFalse(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    boolean getEnabled(){
        boolean retorno;
        if (btn1.isEnabled() == false && btn2.isEnabled() == false && btn3.isEnabled() == false && btn4.isEnabled() == false && btn5.isEnabled() == false && btn6.isEnabled() == false && btn7.isEnabled() == false && btn8.isEnabled() == false && btn9.isEnabled() == false ){
            retorno = true;
            
        }else retorno = false;
        return retorno;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblRes;
    // End of variables declaration//GEN-END:variables
}
