/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;
import javax.swing.JOptionPane;

/**
 *
 * @author Karla
 */
public class InterfazRegistrarPeliculaNueva extends javax.swing.JFrame {
    Miscelaneos miscelaneos = new Miscelaneos();
    Usuario usuario;
    Pelicula pelicula;
    InteraccionConCSV interaccionCSV = new InteraccionConCSV();
    Interaccion interaccion = new Interaccion();
    
     private final String [] datosDB = {"Id: ", 
                                        "Nombre: ", 
                                        "Anio: ", 
                                        "Sinopsis: ",
                                        "Director: ",
                                        "Genero: ",
                                        "Tipo de Disco: ",
                                        "Pelicula rentada?: "};
   
    public InterfazRegistrarPeliculaNueva() {
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
        jLabel2 = new javax.swing.JLabel();
        IngresarPeliculaNuevaNombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IngresarPeliculaNuevaYearTxt = new javax.swing.JTextField();
        IngresarPeliculaNuevaDirectorTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IngresarPeliculaNuevaSinopsisTxt = new javax.swing.JTextField();
        IngresarPeliculaNuevaGeneroCbx = new javax.swing.JComboBox<>();
        IngresarPeliculaNuevaTipoDiscoCbx = new javax.swing.JComboBox<>();
        IngresarPeliculaNuevaCorroborarDatosBtn = new javax.swing.JButton();
        IngresarPeliculaNuevaLimpiarCasillasBtn = new javax.swing.JButton();
        IngresarPeliculaNuevaVolverAMenuPrincipalBtn = new javax.swing.JButton();
        IngresarNuevaPeliculaGuardarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Película Nueva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("Nombre:");

        jLabel3.setText("Año:");

        jLabel4.setText("Director:");

        IngresarPeliculaNuevaDirectorTxt.setToolTipText("");

        jLabel5.setText("Sinopsis:");

        jLabel6.setText("Género:");

        jLabel7.setText("Tipo de Disco:");

        IngresarPeliculaNuevaSinopsisTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarPeliculaNuevaSinopsisTxtActionPerformed(evt);
            }
        });

        IngresarPeliculaNuevaGeneroCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedia", "Romance", "Drama", "Scifi", "Terror", "Fantasía", "Independiente" }));

        IngresarPeliculaNuevaTipoDiscoCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DVD", "Blu-ray DISK", "Otro" }));
        IngresarPeliculaNuevaTipoDiscoCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarPeliculaNuevaTipoDiscoCbxActionPerformed(evt);
            }
        });

        IngresarPeliculaNuevaCorroborarDatosBtn.setText("Corroborar datos");
        IngresarPeliculaNuevaCorroborarDatosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarPeliculaNuevaCorroborarDatosBtnMouseClicked(evt);
            }
        });
        IngresarPeliculaNuevaCorroborarDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarPeliculaNuevaCorroborarDatosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(IngresarPeliculaNuevaNombreTxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(IngresarPeliculaNuevaDirectorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IngresarPeliculaNuevaSinopsisTxt)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(IngresarPeliculaNuevaYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(IngresarPeliculaNuevaGeneroCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(IngresarPeliculaNuevaCorroborarDatosBtn))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IngresarPeliculaNuevaTipoDiscoCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {IngresarPeliculaNuevaNombreTxt, IngresarPeliculaNuevaYearTxt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IngresarPeliculaNuevaNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IngresarPeliculaNuevaDirectorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IngresarPeliculaNuevaYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IngresarPeliculaNuevaGeneroCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(IngresarPeliculaNuevaSinopsisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IngresarPeliculaNuevaTipoDiscoCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(IngresarPeliculaNuevaCorroborarDatosBtn)
                .addContainerGap())
        );

        IngresarPeliculaNuevaLimpiarCasillasBtn.setText("Limpiar Casillas");
        IngresarPeliculaNuevaLimpiarCasillasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarPeliculaNuevaLimpiarCasillasBtnMouseClicked(evt);
            }
        });

        IngresarPeliculaNuevaVolverAMenuPrincipalBtn.setText("Volver a menú Principal");
        IngresarPeliculaNuevaVolverAMenuPrincipalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarPeliculaNuevaVolverAMenuPrincipalBtnMouseClicked(evt);
            }
        });

        IngresarNuevaPeliculaGuardarBtn.setText("Guardar");
        IngresarNuevaPeliculaGuardarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarNuevaPeliculaGuardarBtnMouseClicked(evt);
            }
        });
        IngresarNuevaPeliculaGuardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarNuevaPeliculaGuardarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(IngresarNuevaPeliculaGuardarBtn)
                .addGap(18, 18, 18)
                .addComponent(IngresarPeliculaNuevaLimpiarCasillasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(IngresarPeliculaNuevaVolverAMenuPrincipalBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarPeliculaNuevaLimpiarCasillasBtn)
                    .addComponent(IngresarPeliculaNuevaVolverAMenuPrincipalBtn)
                    .addComponent(IngresarNuevaPeliculaGuardarBtn))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     public String nombreDirectorPeliculaLimpio() {

        String nombre = IngresarPeliculaNuevaDirectorTxt.getText();

        while (nombre.contains("1") || nombre.contains("2")
                || nombre.contains("3") || nombre.contains("4")
                || nombre.contains("5") || nombre.contains("6")
                || nombre.contains("7") || nombre.contains("8")
                || nombre.contains("9") || nombre.contains("0")) {
            JOptionPane.showMessageDialog(null, "El nombre del director no debe contener números. Ingréselo de nuevo");
            IngresarPeliculaNuevaDirectorTxt.setText("");
            nombre = IngresarPeliculaNuevaDirectorTxt.getText();
            
            
        }

        String resultado = nombre.replace(',', '.');
        
        return resultado;

    
        
    }
    
    public String generoPelicula() {
        String generoPelicula= IngresarPeliculaNuevaGeneroCbx.getItemAt(IngresarPeliculaNuevaGeneroCbx.getSelectedIndex());
        
        return generoPelicula;
        
    }

    public String nombrePeliculaLimpio() {
        
        String var = IngresarPeliculaNuevaNombreTxt.getText();
        String resultado = var.replace(',', '.');
        return resultado;
        
    }
    
    public String descripcionPeliculaLimpio() {
        
        String var = IngresarPeliculaNuevaSinopsisTxt.getText();
        String resultado = var.replace(',', '.');
        return resultado;
        
    }
    
    public int anioLimpio() {

        // Variables
        boolean done = false;
        int result = 0;
        String anioPelicula;

        do {
            
            anioPelicula = IngresarPeliculaNuevaYearTxt.getText();
            try {
                
                if(anioPelicula.length() == 4) {
                    result = Integer.parseInt(anioPelicula);
                    done = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Año debe ser 4 digitos únicamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    IngresarPeliculaNuevaYearTxt.setText("0000");
                    IngresarPeliculaNuevaYearTxt.getText();
                }
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar numeros unicamente.", "Error", JOptionPane.ERROR_MESSAGE);
                IngresarPeliculaNuevaYearTxt.setText("0000");
                IngresarPeliculaNuevaYearTxt.getText();

            }

        } while (!done);
        
        return result;

    }

    
    public String tipoDiscoPeliculaLimpio() {

        String tipoDisco= IngresarPeliculaNuevaTipoDiscoCbx.getItemAt(IngresarPeliculaNuevaTipoDiscoCbx.getSelectedIndex());
        
        return tipoDisco;
        
    }
    
   
    
   
    
    private void IngresarPeliculaNuevaSinopsisTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarPeliculaNuevaSinopsisTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarPeliculaNuevaSinopsisTxtActionPerformed

    private void IngresarPeliculaNuevaVolverAMenuPrincipalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarPeliculaNuevaVolverAMenuPrincipalBtnMouseClicked
          // con este codigo volvemos al menu principal y cerramos la ventana actual
        InterfazMenuPrincipal menuPrincipal= new  InterfazMenuPrincipal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IngresarPeliculaNuevaVolverAMenuPrincipalBtnMouseClicked

    private void IngresarPeliculaNuevaLimpiarCasillasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarPeliculaNuevaLimpiarCasillasBtnMouseClicked
        // con este codigo borramos los datos que puso el bibliotecologo.
        
       
        IngresarPeliculaNuevaNombreTxt.setText("");
        IngresarPeliculaNuevaYearTxt.setText("");
        IngresarPeliculaNuevaYearTxt.setText("");
        IngresarPeliculaNuevaSinopsisTxt.setText("");
        IngresarPeliculaNuevaGeneroCbx.setSelectedIndex(0);
        IngresarPeliculaNuevaTipoDiscoCbx.setSelectedIndex(0);
        
        
        
    }//GEN-LAST:event_IngresarPeliculaNuevaLimpiarCasillasBtnMouseClicked

    private void IngresarPeliculaNuevaCorroborarDatosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarPeliculaNuevaCorroborarDatosBtnMouseClicked
        // TODO add your handling code here:
        
        pelicula = new Pelicula(interaccionCSV.setIdNuevoPelicula(),
                                nombrePeliculaLimpio(),
                                anioLimpio(),
                                descripcionPeliculaLimpio(),
                                nombreDirectorPeliculaLimpio(),
                                generoPelicula(),
                                tipoDiscoPeliculaLimpio(),
                                false);
      
    }//GEN-LAST:event_IngresarPeliculaNuevaCorroborarDatosBtnMouseClicked

    private void IngresarPeliculaNuevaCorroborarDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarPeliculaNuevaCorroborarDatosBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarPeliculaNuevaCorroborarDatosBtnActionPerformed

    private void IngresarNuevaPeliculaGuardarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarNuevaPeliculaGuardarBtnMouseClicked
        // TODO add your handling code here:
        interaccionCSV.crearPeliculaNueva(pelicula.getPeliculaNueva());
        JOptionPane.showMessageDialog(null, "Guardado con éxito");
    }//GEN-LAST:event_IngresarNuevaPeliculaGuardarBtnMouseClicked

    private void IngresarPeliculaNuevaTipoDiscoCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarPeliculaNuevaTipoDiscoCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarPeliculaNuevaTipoDiscoCbxActionPerformed

    private void IngresarNuevaPeliculaGuardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarNuevaPeliculaGuardarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarNuevaPeliculaGuardarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazRegistrarPeliculaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarPeliculaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarPeliculaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarPeliculaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistrarPeliculaNueva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresarNuevaPeliculaGuardarBtn;
    private javax.swing.JButton IngresarPeliculaNuevaCorroborarDatosBtn;
    private javax.swing.JTextField IngresarPeliculaNuevaDirectorTxt;
    private javax.swing.JComboBox<String> IngresarPeliculaNuevaGeneroCbx;
    private javax.swing.JButton IngresarPeliculaNuevaLimpiarCasillasBtn;
    private javax.swing.JTextField IngresarPeliculaNuevaNombreTxt;
    private javax.swing.JTextField IngresarPeliculaNuevaSinopsisTxt;
    private javax.swing.JComboBox<String> IngresarPeliculaNuevaTipoDiscoCbx;
    private javax.swing.JButton IngresarPeliculaNuevaVolverAMenuPrincipalBtn;
    private javax.swing.JTextField IngresarPeliculaNuevaYearTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
