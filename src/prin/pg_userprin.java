/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelos.Project;
import wbs.Wbs;

/**
 *
 * @author Leonidas
 */
public class pg_userprin extends javax.swing.JFrame {
    File archivo;
    /**
     * Creates new form pg_userprin
     */
    public pg_userprin() {
        initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(pg_userprin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
        
        Wbs.savedParameters=this;
        
    }

    public void setNombre(String nombre) {
        this.lbl_nombre.setText(nombre);
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl_foto,"src/img/defaultuser.png");
//        ImageIcon image= new ImageIcon(getClass().getResource("foto.png"));
//        ImageIcon newImage = new ImageIcon(image.getImage().getScaledInstance(lbl_foto.getWidth(), lbl_foto.getHeight(), Image.SCALE_DEFAULT));
//        lbl_foto.setIcon(newImage);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frm_editarperfil = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_usufoto = new javax.swing.JLabel();
        btn_examinar = new rojeru_san.RSButton();
        jLabel10 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_cancelar = new rojeru_san.RSButton();
        btn_aceptar = new rojeru_san.RSButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        btn_vercolaboradores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_editperfil = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_mostrarproyectos = new javax.swing.JPanel();
        btn_addproyecto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Establecer foto de perfil");

        btn_examinar.setBackground(new java.awt.Color(204, 51, 0));
        btn_examinar.setText("Examinar...");
        btn_examinar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_examinarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Cambiar contraseña");

        btn_cancelar.setBackground(new java.awt.Color(204, 51, 0));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setColorHover(new java.awt.Color(255, 153, 0));
        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_aceptar.setBackground(new java.awt.Color(204, 51, 0));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setColorHover(new java.awt.Color(255, 153, 0));
        btn_aceptar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_usufoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_usufoto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout frm_editarperfilLayout = new javax.swing.GroupLayout(frm_editarperfil.getContentPane());
        frm_editarperfil.getContentPane().setLayout(frm_editarperfilLayout);
        frm_editarperfilLayout.setHorizontalGroup(
            frm_editarperfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frm_editarperfilLayout.setVerticalGroup(
            frm_editarperfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(218, 175, 118));
        jPanel1.setMinimumSize(new java.awt.Dimension(961, 545));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 19, 6));
        jPanel2.setMinimumSize(new java.awt.Dimension(250, 545));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 545));
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_foto.setForeground(new java.awt.Color(204, 204, 204));
        lbl_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 92, -1, -1));

        btn_vercolaboradores.setBackground(new java.awt.Color(172, 95, 47));
        btn_vercolaboradores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mis colaboradores");
        btn_vercolaboradores.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 144, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Eye_24px_1.png"))); // NOI18N
        btn_vercolaboradores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 40));

        jPanel2.add(btn_vercolaboradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 190, -1));

        btn_editperfil.setBackground(new java.awt.Color(172, 95, 47));
        btn_editperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editperfilMouseClicked(evt);
            }
        });
        btn_editperfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar perfil");
        btn_editperfil.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 144, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Edit_24px.png"))); // NOI18N
        btn_editperfil.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 40));

        jPanel2.add(btn_editperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 190, -1));

        lbl_nombre.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(218, 175, 118));
        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 545));

        javax.swing.GroupLayout pnl_mostrarproyectosLayout = new javax.swing.GroupLayout(pnl_mostrarproyectos);
        pnl_mostrarproyectos.setLayout(pnl_mostrarproyectosLayout);
        pnl_mostrarproyectosLayout.setHorizontalGroup(
            pnl_mostrarproyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        pnl_mostrarproyectosLayout.setVerticalGroup(
            pnl_mostrarproyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnl_mostrarproyectos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 580, 400));

        btn_addproyecto.setBackground(new java.awt.Color(172, 95, 47));
        btn_addproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addproyectoMouseClicked(evt);
            }
        });
        btn_addproyecto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nuevo proyecto");
        btn_addproyecto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 144, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Plus_24px.png"))); // NOI18N
        btn_addproyecto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 0, 50, 40));

        jPanel1.add(btn_addproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 220, 40));

        jLabel8.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 19, 6));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Mis Proyectos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addproyectoMouseClicked
        //String name = JOptionPane.showInputDialog(null,"Nombre del projecto");
        wbs.createProject(new Project(JOptionPane.showInputDialog(null,"Nombre del projecto"),Wbs.tree));
        this.setVisible(false);
    }//GEN-LAST:event_btn_addproyectoMouseClicked

    private void btn_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examinarActionPerformed
        JFileChooser fc= new JFileChooser();
        BufferedImage imagen = null;

        fc.setDialogTitle("Buscar portada de película");
        if (fc.showOpenDialog(this)== JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();

            if(archivo.canRead()){
                if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                    //img = impelicula.portada(archivo);
                    rsscalelabel.RSScaleLabel.setScaleLabel(lbl_usufoto,archivo.toString());
                    String ruta  = fc.getSelectedFile().toString();
                    String ext = null;

                }else{
                    JOptionPane.showMessageDialog(this, "Escoja una imagen con extension jpg, png o gif");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Hubo un problema con el archivo");
            }
        }
    }//GEN-LAST:event_btn_examinarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btn_editperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editperfilMouseClicked
        frm_editarperfil.setVisible(true);
    }//GEN-LAST:event_btn_editperfilMouseClicked

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
            java.util.logging.Logger.getLogger(pg_userprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pg_userprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pg_userprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pg_userprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg_userprin().setVisible(true);
            }
        });
    }

    @Override
    public void dispose()
    {
        new pg_login().setVisible(true);
        super.dispose();
    }
    
    Wbs wbs = new Wbs();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btn_aceptar;
    private javax.swing.JPanel btn_addproyecto;
    private rojeru_san.RSButton btn_cancelar;
    private javax.swing.JPanel btn_editperfil;
    private rojeru_san.RSButton btn_examinar;
    private javax.swing.JPanel btn_vercolaboradores;
    private javax.swing.JFrame frm_editarperfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_usufoto;
    private javax.swing.JPanel pnl_mostrarproyectos;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
