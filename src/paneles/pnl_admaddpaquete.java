/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;
import wbs.Wbs;

/**
 *
 * @author Leonidas
 */
public class pnl_admaddpaquete extends javax.swing.JPanel {

    /**
     * Creates new form pnl_admaddpaquete
     */
    public pnl_admaddpaquete() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        btn_crear = new rojeru_san.RSButton();
        jLabel9 = new javax.swing.JLabel();
        btn_addproyecto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(218, 175, 118));
        setMinimumSize(new java.awt.Dimension(689, 521));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 19, 6));
        jLabel8.setText("Agregar colaborador:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 40));

        txt_user.setToolTipText("Nombre del paquete");
        add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 310, 40));

        btn_crear.setBackground(new java.awt.Color(172, 95, 47));
        btn_crear.setText("Crear paquete");
        btn_crear.setToolTipText("crear");
        btn_crear.setColorHover(new java.awt.Color(208, 124, 66));
        btn_crear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });
        add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 250, -1));

        jLabel9.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(47, 19, 6));
        jLabel9.setText("Nuevo paquete:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 23, -1, 40));

        btn_addproyecto.setBackground(new java.awt.Color(172, 95, 47));
        btn_addproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addproyectoMouseClicked(evt);
            }
        });
        btn_addproyecto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Plus_24px.png"))); // NOI18N
        btn_addproyecto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 50, 40));

        searchUser.setToolTipText("Buscar colaborador");
        searchUser.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchUserCaretUpdate(evt);
            }
        });
        btn_addproyecto.add(searchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 40));

        add(btn_addproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 40));

        jLabel10.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(47, 19, 6));
        jLabel10.setText("Notificación de ingreso:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 23, -1, 40));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Predeterminado");
        jRadioButton1.setOpaque(false);
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Personalizar");
        jRadioButton2.setOpaque(false);
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jTextField1.setEditable(false);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 208, 34));

        jLabel11.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(47, 19, 6));
        jLabel11.setText("Mensaje:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, 40));

        jLabel13.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(47, 19, 6));
        jLabel13.setText("Asunto:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 210, 120));

        jSeparator1.setBackground(new java.awt.Color(172, 95, 47));
        jSeparator1.setForeground(new java.awt.Color(172, 95, 47));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 10, 360));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 310, 34));

        jLabel12.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(47, 19, 6));
        jLabel12.setText("Colaboradores:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed

        // metodo para crear paquete
    }//GEN-LAST:event_btn_crearActionPerformed

    private void btn_addproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addproyectoMouseClicked
        
    }//GEN-LAST:event_btn_addproyectoMouseClicked

    private void searchUserCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchUserCaretUpdate
        
        for (String search : wbs.getRelativeUsers(searchUser.getText())) 
        {
            
        }

    }//GEN-LAST:event_searchUserCaretUpdate

    
    private int labelReference;
    Wbs wbs = new Wbs();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_addproyecto;
    private rojeru_san.RSButton btn_crear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField searchUser;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
