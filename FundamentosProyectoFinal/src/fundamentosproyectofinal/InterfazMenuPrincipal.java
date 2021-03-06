/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

/**
 *
 * @author Karla
 */
public class InterfazMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazMenuPrincipal
     */
    public InterfazMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuPrincipalMenuUsuarioBtn = new javax.swing.JButton();
        MenuPrincipalMenuPeliculasBtn = new javax.swing.JButton();
        MenuPrincipalConsultarInformacionBtn = new javax.swing.JButton();
        MenuPrincipalSalirBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuPrincipalMenuUsuarioBtn.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipalMenuUsuarioBtn.setText("Menu usuarios");
        MenuPrincipalMenuUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalMenuUsuarioBtnActionPerformed(evt);
            }
        });

        MenuPrincipalMenuPeliculasBtn.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipalMenuPeliculasBtn.setText("Menú películas");
        MenuPrincipalMenuPeliculasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPrincipalMenuPeliculasBtnMouseClicked(evt);
            }
        });

        MenuPrincipalConsultarInformacionBtn.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipalConsultarInformacionBtn.setText("Consultar Información");
        MenuPrincipalConsultarInformacionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPrincipalConsultarInformacionBtnMouseClicked(evt);
            }
        });

        MenuPrincipalSalirBtn.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipalSalirBtn.setText("Salir");
        MenuPrincipalSalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalSalirBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU PRINCIPAL VIDEOTEK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(MenuPrincipalMenuUsuarioBtn)
                    .addComponent(MenuPrincipalMenuPeliculasBtn)
                    .addComponent(MenuPrincipalConsultarInformacionBtn)
                    .addComponent(MenuPrincipalSalirBtn))
                .addGap(37, 37, 37))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MenuPrincipalConsultarInformacionBtn, MenuPrincipalMenuPeliculasBtn, MenuPrincipalMenuUsuarioBtn, MenuPrincipalSalirBtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuPrincipalMenuUsuarioBtn)
                .addGap(34, 34, 34)
                .addComponent(MenuPrincipalMenuPeliculasBtn)
                .addGap(32, 32, 32)
                .addComponent(MenuPrincipalConsultarInformacionBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(MenuPrincipalSalirBtn)
                .addGap(30, 30, 30))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MenuPrincipalConsultarInformacionBtn, MenuPrincipalMenuPeliculasBtn, MenuPrincipalMenuUsuarioBtn, MenuPrincipalSalirBtn});

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

    private void MenuPrincipalSalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalSalirBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuPrincipalSalirBtnActionPerformed

    private void MenuPrincipalMenuUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalMenuUsuarioBtnActionPerformed
        // con este codigo vamos al menu de Usuario y cerramos esta ventana
        InterfazMenuUsuarios menuUsuario= new InterfazMenuUsuarios();
        menuUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuPrincipalMenuUsuarioBtnActionPerformed

    private void MenuPrincipalMenuPeliculasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPrincipalMenuPeliculasBtnMouseClicked
        // con este codigo vamos al menu de peliculas y cerramos esta ventan
        InterfazMenuPeliculas menuPeliculas= new InterfazMenuPeliculas();
        menuPeliculas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuPrincipalMenuPeliculasBtnMouseClicked

    private void MenuPrincipalConsultarInformacionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPrincipalConsultarInformacionBtnMouseClicked
        // con este codigo vamos al menu de Consultar informacion
        InterfazConsultarInformacion consultarInformacion= new InterfazConsultarInformacion  ();
        consultarInformacion.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_MenuPrincipalConsultarInformacionBtnMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuPrincipalConsultarInformacionBtn;
    private javax.swing.JButton MenuPrincipalMenuPeliculasBtn;
    private javax.swing.JButton MenuPrincipalMenuUsuarioBtn;
    private javax.swing.JButton MenuPrincipalSalirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
