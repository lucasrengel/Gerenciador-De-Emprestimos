package com.lucasrengel.visao;

import com.lucasrengel.dao.FerramentaDAO;
import com.lucasrengel.modelo.Ferramenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaFerramenta extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private FerramentaDAO objetoferramenta;

    public TelaFerramenta() {
        initComponents();
        objetoferramenta = new FerramentaDAO();
        carregaTabela();
    }

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaFerramenta.getModel();
        modelo.setNumRows(0);

        ArrayList<Ferramenta> minhalista;
        minhalista = objetoferramenta.getMinhaLista();

        for (Ferramenta ferramenta : minhalista) {
            modelo.addRow(new Object[]{
                ferramenta.getId(),
                ferramenta.getNome(),
                ferramenta.getMarca(),
                ferramenta.getPreco(),});
        }
        precoTotal();
    }

    private void precoTotal() {
        double precoTotal = objetoferramenta.getTotal();
        String precoTotalFormatado = String.format("%.2f", precoTotal);
        this.textoTotal.setText(precoTotalFormatado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoCadastrar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFerramenta = new javax.swing.JTable();
        painelBarra = new javax.swing.JPanel();
        iconeFechar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textoMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoPreco = new javax.swing.JTextField();
        textoTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 117, 143));

        botaoCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 117, 143));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        botaoAtualizar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        botaoAtualizar.setForeground(new java.awt.Color(0, 117, 143));
        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        botaoApagar.setBackground(new java.awt.Color(255, 255, 255));
        botaoApagar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        botaoApagar.setForeground(new java.awt.Color(0, 117, 143));
        botaoApagar.setText("Apagar");
        botaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarActionPerformed(evt);
            }
        });

        tabelaFerramenta.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        tabelaFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marcca", "Preco"
            }
        ));
        jScrollPane1.setViewportView(tabelaFerramenta);

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
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        iconeFecharLayout.setVerticalGroup(
            iconeFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconeFecharLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(0, 117, 143));
        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 117, 143));
        jLabel2.setText("Gerenciador de Ferramentas");

        javax.swing.GroupLayout painelBarraLayout = new javax.swing.GroupLayout(painelBarra);
        painelBarra.setLayout(painelBarraLayout);
        painelBarraLayout.setHorizontalGroup(
            painelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconeFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelBarraLayout.setVerticalGroup(
            painelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconeFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelBarraLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");

        textoNome.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");

        textoMarca.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preco:");

        textoPreco.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        textoTotal.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        textoTotal.setForeground(new java.awt.Color(255, 255, 255));
        textoTotal.setText("0");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gasto Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(textoTotal))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(botaoApagar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoAtualizar)
                            .addGap(43, 43, 43)
                            .addComponent(botaoCadastrar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoNome)
                            .addComponent(textoMarca)
                            .addComponent(textoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(painelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textoTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizar)
                    .addComponent(botaoApagar)
                    .addComponent(botaoCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        try {
            String nome = "";
            String marca = "";
            double preco = 0;

            if (this.textoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres");
            } else {
                nome = this.textoNome.getText();
            }
            if (this.textoMarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres");
            } else {
                marca = this.textoMarca.getText();
            }
            if (this.textoPreco.getText().length() < 0) {
                throw new Mensagens("Preco deve ser numero e maior que zero");
            } else {
                preco = Double.parseDouble(this.textoPreco.getText());
            }

            for (Ferramenta f : FerramentaDAO.minhaLista) { // checa se o amigo ja está cadastrado
                if (f.getNome().equals(nome) && f.getMarca().equals(marca)) {
                    throw new Mensagens("Essa Ferramenta já está cadastrada!");
                }
            }

            if (this.objetoferramenta.insertFerramentaBD(new Ferramenta(nome, marca, preco))) {
                this.textoNome.setText("");
                this.textoMarca.setText("");
                this.textoPreco.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta cadastrada com sucesso!");
            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void iconeFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeFecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_iconeFecharMouseClicked

    private void painelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_painelBarraMouseDragged

    private void painelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_painelBarraMousePressed

    private void botaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarActionPerformed
        try {
            int id = 0;
            if (this.tabelaFerramenta.getSelectedRow() == -1) {
                throw new Mensagens("Selecione uma ferramenta para apagar");
            } else {
                id = Integer.parseInt(this.tabelaFerramenta.getValueAt(this.tabelaFerramenta.getSelectedRow(), 0).toString());
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esssa ferramenta?");

            if (resposta == 0) {
                if (this.objetoferramenta.deleteFerramentaBD(id)) {
                    this.textoNome.setText("");
                    this.textoMarca.setText("");
                    this.textoPreco.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta apagada com sucesso");
                }
            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_botaoApagarActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        try {
            int id = 0;
            String nome = "";
            String marca = "";
            double preco = 0;

            if (this.textoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.textoNome.getText();
            }

            if (this.textoMarca.getText().length() <= 0) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.textoMarca.getText();
            }

            if (this.textoPreco.getText().length() < 2) {
                throw new Mensagens("Custo deve conter ao menos 1 numero.");
            } else {
                preco = Double.parseDouble(this.textoPreco.getText());
            }

            if (this.tabelaFerramenta.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para Alterar");
            } else {
                id = Integer.parseInt(this.tabelaFerramenta.getValueAt(this.tabelaFerramenta.getSelectedRow(), 0).toString());
            }

            if (this.objetoferramenta.updateFerramentaBD(new Ferramenta(id, nome, marca, preco))) {

                this.textoNome.setText("");
                this.textoMarca.setText("");
                this.textoPreco.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada com Sucesso!");

            }
            System.out.println(this.objetoferramenta.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoApagar;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JPanel iconeFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBarra;
    private javax.swing.JTable tabelaFerramenta;
    private javax.swing.JTextField textoMarca;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoPreco;
    private javax.swing.JLabel textoTotal;
    // End of variables declaration//GEN-END:variables
}
