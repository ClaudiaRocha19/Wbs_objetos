/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Leonidas
 */
public class pg_userprin extends javax.swing.JFrame {

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonIconD2 = new rojerusan.RSButtonIconD();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_mostrarproyectos = new javax.swing.JPanel();
        btn_addproyecto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        rSButtonIconD2.setText("rSButtonIconD2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(218, 175, 118));
        jPanel1.setMinimumSize(new java.awt.Dimension(961, 545));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 19, 6));
        jPanel2.setMinimumSize(new java.awt.Dimension(250, 545));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 545));
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_foto.setForeground(new java.awt.Color(204, 204, 204));
        lbl_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_foto.setText("foto");

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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_addproyecto;
    private javax.swing.JPanel btn_editperfil;
    private javax.swing.JPanel btn_vercolaboradores;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JPanel pnl_mostrarproyectos;
    private rojerusan.RSButtonIconD rSButtonIconD2;
    // End of variables declaration//GEN-END:variables
}
