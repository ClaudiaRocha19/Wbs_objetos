/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import paneles.*;
import wbs.Wbs;

/**
 *
 * @author ESTU-5K
 */
public class pg_ComunUser extends javax.swing.JFrame {
    File archivo,archf;
    String ruta;
    /**
     * Creates new form pg_project
     */
    public pg_ComunUser() {
        initComponents();
        new CambiaPanel(pnl_conte, new pnl_usuinicio());
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(pg_ComunUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void dispose()
    {
        new pg_login().setVisible(true);
        super.dispose();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frm_editp = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_usufoto = new javax.swing.JLabel();
        btn_examinar = new rojeru_san.RSButton();
        jLabel10 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_cancelar = new rojeru_san.RSButton();
        btn_aceptar = new rojeru_san.RSButton();
        fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        btn_editperfil = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_conte = new javax.swing.JPanel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(387, 340));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Establecer foto de perfil");

        lbl_usufoto.setMinimumSize(new java.awt.Dimension(126, 137));
        lbl_usufoto.setName(""); // NOI18N
        lbl_usufoto.setPreferredSize(new java.awt.Dimension(126, 137));

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
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_usufoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
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
                        .addComponent(lbl_usufoto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frm_editpLayout = new javax.swing.GroupLayout(frm_editp.getContentPane());
        frm_editp.getContentPane().setLayout(frm_editpLayout);
        frm_editpLayout.setHorizontalGroup(
            frm_editpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frm_editpLayout.setVerticalGroup(
            frm_editpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(218, 175, 118));
        fondo.setPreferredSize(new java.awt.Dimension(951, 545));

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
        btn_editperfil.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 130, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Edit_24px.png"))); // NOI18N
        btn_editperfil.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 40));

        jPanel2.add(btn_editperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, -1));

        lbl_nombre.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(218, 175, 118));
        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 40));

        pnl_conte.setBackground(new java.awt.Color(218, 175, 118));
        pnl_conte.setLayout(new javax.swing.BoxLayout(pnl_conte, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnl_conte);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editperfilMouseClicked
        frm_editp.setLocationRelativeTo(this);
        frm_editp.setVisible(true);
        String nombre = lbl_nombre.getText();
        try {
            rsscalelabel.RSScaleLabel.setScaleLabel(lbl_usufoto, "allusers/" + nombre + "/foto.png");

        } catch (Exception e) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lbl_usufoto, "src/img/defaultuser.png");

        }
    }//GEN-LAST:event_btn_editperfilMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btn_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examinarActionPerformed
        JFileChooser fc = new JFileChooser();
        BufferedImage imagen = null;

        fc.setDialogTitle("Buscar foto");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();

            if (archivo.canRead()) {
                if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                    rsscalelabel.RSScaleLabel.setScaleLabel(lbl_usufoto, archivo.toString());
                    ruta = fc.getSelectedFile().toString();
                    archf = fc.getSelectedFile();
                    String ext = null;

                } else {
                    JOptionPane.showMessageDialog(this, "Escoja una imagen con extension jpg, png o gif");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un problema con el archivo");
            }
        }
    }//GEN-LAST:event_btn_examinarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        frm_editp.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        if (!(txt_pass.getText().equals(""))) {
            Wbs w = new Wbs();
            try {
                BufferedReader lec_users = new BufferedReader(new FileReader("usuarios.txt"));
                BufferedWriter esc_temp = new BufferedWriter(new FileWriter("temp.txt"));

                String nombre = lbl_nombre.getText(), linea;
                ArrayList<String> campos;

                while ((linea = lec_users.readLine()) != null) {
                    campos = w.separar(linea);
                    if (campos.get(0).equals(nombre)) {
                        esc_temp.write(campos.get(0) + "," + txt_pass.getText() + "," + campos.get(2) + ",2,");
                    } else {
                        esc_temp.write(linea);
                    }
                    esc_temp.newLine();
                }

                lec_users.close();
                esc_temp.close();

                BufferedReader lec_temp = new BufferedReader(new FileReader("temp.txt"));
                BufferedWriter esc_users = new BufferedWriter(new FileWriter("usuarios.txt"));

                while ((linea = lec_temp.readLine()) != null) {
                    esc_users.write(linea);
                    esc_users.newLine();
                }

                esc_users.close();
                lec_temp.close();

            } catch (IOException ioe) {
                System.out.println("error en la lectura del archivo");
                ioe.printStackTrace();
            }

        }
        if (ruta != null) {

            try {
                File ft = new File("allusers/" + lbl_nombre.getText() + "/foto.png");
                String l = null;
                BufferedImage imagen = null;

                imagen = ImageIO.read(archivo);

                File destino = new File("allusers/" + lbl_nombre.getText() + "/foto.png");

                ImageIO.write(imagen, "png", destino);

                rsscalelabel.RSScaleLabel.setScaleLabel(this.lbl_foto, "allusers/" + lbl_nombre.getText() + "/foto.png");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            frm_editp.dispose();
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(pg_ComunUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pg_ComunUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pg_ComunUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pg_ComunUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg_ComunUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btn_aceptar;
    private rojeru_san.RSButton btn_cancelar;
    private javax.swing.JPanel btn_editperfil;
    private rojeru_san.RSButton btn_examinar;
    private javax.swing.JPanel fondo;
    private javax.swing.JFrame frm_editp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_usufoto;
    private javax.swing.JPanel pnl_conte;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
