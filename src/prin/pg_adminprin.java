/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import paneles.*;
import wbs.Wbs;

/**
 *
 * @author Leonidas
 */
public class pg_adminprin extends javax.swing.JFrame {

    public void setNombre(String nombre) {
        this.lbl_nombre.setText(nombre);
    }

    /**
     * Creates new form pg_adminprin
     */
    public pg_adminprin() {
        initComponents();
        new CambiaPanel(pnl_contenedor, new pnl_adminicio());
        try {
            //instruccion para dar apariencia similar a ventanas de Windows (las scrollbar de Swing son feitas c:)
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(pg_adminprin.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_addcolaboradores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_nombreproyecto = new javax.swing.JLabel();
        btn_cronograma = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_addtarea = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_crearpaquete = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_cerrarsesion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(218, 175, 118));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 19, 6));
        jPanel2.setMinimumSize(new java.awt.Dimension(250, 545));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 545));
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_addcolaboradores.setBackground(new java.awt.Color(172, 95, 47));
        btn_addcolaboradores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_addcolaboradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addcolaboradoresMouseClicked(evt);
            }
        });
        btn_addcolaboradores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar colaboradores");
        btn_addcolaboradores.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Add_User_Male_24px.png"))); // NOI18N
        btn_addcolaboradores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 40, 40));

        jPanel2.add(btn_addcolaboradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, -1));

        btn_inicio.setBackground(new java.awt.Color(172, 95, 47));
        btn_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicioMouseClicked(evt);
            }
        });
        btn_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Inicio");
        btn_inicio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_24px_1.png"))); // NOI18N
        btn_inicio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 40, 40));

        jPanel2.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, -1));

        lbl_nombre.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(218, 175, 118));
        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 40));

        lbl_nombreproyecto.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nombreproyecto.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        lbl_nombreproyecto.setForeground(new java.awt.Color(218, 175, 118));
        jPanel2.add(lbl_nombreproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, 40));

        btn_cronograma.setBackground(new java.awt.Color(172, 95, 47));
        btn_cronograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cronograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cronogramaMouseClicked(evt);
            }
        });
        btn_cronograma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cronograma");
        btn_cronograma.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Planner_24px.png"))); // NOI18N
        btn_cronograma.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 40, 40));

        jPanel2.add(btn_cronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        btn_addtarea.setBackground(new java.awt.Color(172, 95, 47));
        btn_addtarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_addtarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addtareaMouseClicked(evt);
            }
        });
        btn_addtarea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar tarea");
        btn_addtarea.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Add_Property_24px.png"))); // NOI18N
        btn_addtarea.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 40, 40));

        jPanel2.add(btn_addtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, -1));

        btn_crearpaquete.setBackground(new java.awt.Color(172, 95, 47));
        btn_crearpaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_crearpaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearpaqueteMouseClicked(evt);
            }
        });
        btn_crearpaquete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Crear paquete");
        btn_crearpaquete.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Add_Folder_24px.png"))); // NOI18N
        btn_crearpaquete.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 40, 40));

        jPanel2.add(btn_crearpaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 210, -1));

        lbl_cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Shutdown_40px_2.png"))); // NOI18N
        lbl_cerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cerrarsesionMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_cerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnl_contenedor.setBackground(new java.awt.Color(218, 175, 118));
        pnl_contenedor.setLayout(new javax.swing.BoxLayout(pnl_contenedor, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnl_contenedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 11, 691, 523));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseClicked
         new CambiaPanel(pnl_contenedor, new pnl_adminicio());
    }//GEN-LAST:event_btn_inicioMouseClicked

    private void btn_cronogramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cronogramaMouseClicked
        new CambiaPanel(pnl_contenedor, new pnl_admcronograma());
    }//GEN-LAST:event_btn_cronogramaMouseClicked

    private void btn_addtareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addtareaMouseClicked
        new CambiaPanel(pnl_contenedor, new pnl_admaddtarea());
    }//GEN-LAST:event_btn_addtareaMouseClicked

    private void btn_crearpaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearpaqueteMouseClicked
        new CambiaPanel(pnl_contenedor, new pnl_admaddpaquete());
    }//GEN-LAST:event_btn_crearpaqueteMouseClicked

    private void btn_addcolaboradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addcolaboradoresMouseClicked
        new CambiaPanel(pnl_contenedor, new pnl_admaddcolaborador());
    }//GEN-LAST:event_btn_addcolaboradoresMouseClicked

    private void lbl_cerrarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarsesionMouseClicked
        new pg_login().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_lbl_cerrarsesionMouseClicked

    @Override
    public void dispose()
    {
        Wbs.savedParameters.setVisible(true);
        super.dispose();
    }
    
    
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
            java.util.logging.Logger.getLogger(pg_adminprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pg_adminprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pg_adminprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pg_adminprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg_adminprin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_addcolaboradores;
    private javax.swing.JPanel btn_addtarea;
    private javax.swing.JPanel btn_crearpaquete;
    private javax.swing.JPanel btn_cronograma;
    private javax.swing.JPanel btn_inicio;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cerrarsesion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombreproyecto;
    private javax.swing.JPanel pnl_contenedor;
    // End of variables declaration//GEN-END:variables
}
