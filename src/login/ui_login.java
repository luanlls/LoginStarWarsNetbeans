package login;

import javax.swing.JOptionPane;

public class ui_login extends javax.swing.JFrame {
    
    public ui_login() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPreto = new javax.swing.JPanel();
        PainelVermelho = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        loginInput = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        imperioLogo = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        senhaInput = new javax.swing.JPasswordField();
        estrela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(542, 270));
        setResizable(false);

        PainelPreto.setBackground(new java.awt.Color(0, 0, 0));

        PainelVermelho.setBackground(new java.awt.Color(102, 0, 0));

        login.setBackground(new java.awt.Color(248, 248, 248));
        login.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(248, 248, 248));
        login.setText("Username:");

        loginInput.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        loginInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginInputActionPerformed(evt);
            }
        });

        senha.setBackground(new java.awt.Color(248, 248, 248));
        senha.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(248, 248, 248));
        senha.setText("Password:");

        imperioLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/imperioIcone.png"))); // NOI18N

        enterButton.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        enterButton.setText("Log In");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelVermelhoLayout = new javax.swing.GroupLayout(PainelVermelho);
        PainelVermelho.setLayout(PainelVermelhoLayout);
        PainelVermelhoLayout.setHorizontalGroup(
            PainelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVermelhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelVermelhoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imperioLogo))
                    .addGroup(PainelVermelhoLayout.createSequentialGroup()
                        .addGroup(PainelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(loginInput, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(login)
                                .addComponent(senha)
                                .addComponent(senhaInput))
                            .addComponent(enterButton))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelVermelhoLayout.setVerticalGroup(
            PainelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVermelhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imperioLogo)
                .addGap(12, 12, 12)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        estrela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/estrelaDaMorte.png"))); // NOI18N

        javax.swing.GroupLayout PainelPretoLayout = new javax.swing.GroupLayout(PainelPreto);
        PainelPreto.setLayout(PainelPretoLayout);
        PainelPretoLayout.setHorizontalGroup(
            PainelPretoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPretoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(estrela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100)
                .addComponent(PainelVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelPretoLayout.setVerticalGroup(
            PainelPretoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPretoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(estrela)
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(PainelVermelho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPreto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPreto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginInputActionPerformed

    }//GEN-LAST:event_loginInputActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        if (loginInput.getText().equals("DarthVader")&& senhaInput.getText().equals("lukesky")) {
            JOptionPane.showMessageDialog(null, "WELCOME TO THE DARK SIDE!!");
            
        } else {
            JOptionPane.showMessageDialog(null, "DENIED ACCESS.");
        }
    }//GEN-LAST:event_enterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ui_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPreto;
    private javax.swing.JPanel PainelVermelho;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel estrela;
    private javax.swing.JLabel imperioLogo;
    private javax.swing.JLabel login;
    private javax.swing.JTextField loginInput;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senhaInput;
    // End of variables declaration//GEN-END:variables
}
