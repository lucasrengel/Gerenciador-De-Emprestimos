package com.lucasrengel.visao;

import com.lucasrengel.dao.Conexao;

public class TelaMenu extends javax.swing.JFrame {

    private int xMouse, yMouse; //variaveis para mover a janela com a barra personalizada
    
    public TelaMenu() {
        initComponents();
        Conexao.getConexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        botaoAmigo = new javax.swing.JButton();
        botaoEmprestimo = new javax.swing.JButton();
        botaoFerramenta = new javax.swing.JButton();
        painelBarra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        iconeFechar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 117, 143));

        botaoAmigo.setBackground(new java.awt.Color(255, 255, 255));
        botaoAmigo.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        botaoAmigo.setForeground(new java.awt.Color(0, 117, 143));
        botaoAmigo.setText("Amigo");
        botaoAmigo.setFocusPainted(false);
        botaoAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAmigoActionPerformed(evt);
            }
        });

        botaoEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        botaoEmprestimo.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        botaoEmprestimo.setForeground(new java.awt.Color(0, 117, 143));
        botaoEmprestimo.setText("Emprestimos");
        botaoEmprestimo.setFocusPainted(false);
        botaoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEmprestimoActionPerformed(evt);
            }
        });

        botaoFerramenta.setBackground(new java.awt.Color(255, 255, 255));
        botaoFerramenta.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        botaoFerramenta.setForeground(new java.awt.Color(0, 117, 143));
        botaoFerramenta.setText("Ferramenta");
        botaoFerramenta.setFocusPainted(false);
        botaoFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFerramentaActionPerformed(evt);
            }
        });

        painelBarra.setBackground(new java.awt.Color(255, 255, 255));
        painelBarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        painelBarra.setForeground(new java.awt.Color(0, 117, 143));
        painelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                painelBarraMouseDragged(evt);
            }
        });
        painelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelBarraMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 117, 143));
        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 117, 143));
        jLabel2.setText("Menu Principal");

        iconeFechar.setBackground(new java.awt.Color(255, 255, 255));
        iconeFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconeFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeFecharMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 117, 143));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 117, 143));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout iconeFecharLayout = new javax.swing.GroupLayout(iconeFechar);
        iconeFechar.setLayout(iconeFecharLayout);
        iconeFecharLayout.setHorizontalGroup(
            iconeFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconeFecharLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        iconeFecharLayout.setVerticalGroup(
            iconeFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconeFecharLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelBarraLayout = new javax.swing.GroupLayout(painelBarra);
        painelBarra.setLayout(painelBarraLayout);
        painelBarraLayout.setHorizontalGroup(
            painelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(iconeFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelBarraLayout.setVerticalGroup(
            painelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addComponent(iconeFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(botaoAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAmigoActionPerformed
        TelaAmigo tela = new TelaAmigo();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoAmigoActionPerformed

    private void iconeFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_iconeFecharMouseClicked

    private void painelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_painelBarraMousePressed

    private void painelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_painelBarraMouseDragged

    private void botaoFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFerramentaActionPerformed
        TelaFerramenta tela = new TelaFerramenta();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoFerramentaActionPerformed

    private void botaoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEmprestimoActionPerformed
        TelaEmprestimo tela = new TelaEmprestimo();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoEmprestimoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAmigo;
    private javax.swing.JButton botaoEmprestimo;
    private javax.swing.JButton botaoFerramenta;
    private javax.swing.JPanel iconeFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel painelBarra;
    // End of variables declaration//GEN-END:variables
}
